package io.nitric.util

import com.google.protobuf.ListValue
import com.google.protobuf.NullValue
import com.google.protobuf.Value
import com.google.protobuf.Struct
import java.util.function.Function
import java.util.stream.Collector
import java.util.stream.Collectors

object ProtoUtils {

    /**
     * Return a new Map built from the given struct.
     *
     * @param struct the protobuf Struct object
     * @return a Map object.
     */
    fun toMap(struct: Struct): Map<String?, Any?>? {
        return struct
            .getFieldsMap()
            .entries
            .stream()
            .collect(
                toMapNullFriendly(
                    { it.key },
                    { entry ->
                        val value: Value = entry.value
                        when (value.kindCase) {
                            Value.KindCase.STRUCT_VALUE -> return@toMapNullFriendly toMap(value.structValue)
                            Value.KindCase.LIST_VALUE -> return@toMapNullFriendly toList(value.listValue)
                            else -> return@toMapNullFriendly getScalarValue(value)
                        }
                    })
            )
    }

    /**
     * Return a new Struct built from the given Map.
     *
     * @param map the map object (required)
     * @return a new protobuf Struct object
     */
    fun toStruct(map: Map<String?, Any?>): Struct? {
        return mapToStructBuilder(map).build()
    }

    // Package Private Methods ------------------------------------------------

    // Package Private Methods ------------------------------------------------
    fun toStructNullFriendly(map: Map<String?, Any?>): Struct? {
        return mapToStructBuilder(map).build()
    }

    fun getScalarValue(value: Value): Any? {
        when (value.kindCase) {
            Value.KindCase.STRUCT_VALUE, Value.KindCase.LIST_VALUE -> throw AssertionError("value should be scalar")
            Value.KindCase.BOOL_VALUE -> return value.boolValue
            Value.KindCase.NUMBER_VALUE ->                 // Note: this assumes all numbers are doubles. Downstream code that have access to the
                // schema can convert this number to the correct number type.
                return value.numberValue
            Value.KindCase.STRING_VALUE -> return value.stringValue
            Value.KindCase.NULL_VALUE -> return null
            else -> {}
        }
        return value
    }

    fun toList(listValue: ListValue): List<Any?>? {
        return listValue
            .valuesList
            .stream()
            .map { value: Value -> when(value.kindCase) {
                Value.KindCase.STRUCT_VALUE -> toMap(value.structValue)
                else -> getScalarValue(value)
            }}
            .collect(Collectors.toList())
    }

    fun mapToStructBuilder(map: Map<String?, Any?>): Struct.Builder {
        val builder: Struct.Builder = Struct.newBuilder()
        for ((key, value) in map) {
            val structValue: Value? = value(value)
            builder.putFields(key, structValue)
        }
        return builder
    }

    fun value(value: Any?): Value? {
        return if (value is Map<*, *>) {
            Value.newBuilder().setStructValue(toStructNullFriendly(value as Map<String?, Any?>)).build()
        } else if (value is Value) {
            value as Value?
        } else if (value is String) {
            Value.newBuilder().setStringValue(value).build()
        } else if (value is Boolean) {
            Value.newBuilder().setBoolValue(value).build()
        } else if (value is Number) {
            Value.newBuilder().setNumberValue(value.toDouble()).build()
        } else if (value is Iterable<*>) {
            listValue(value)
        } else if (value is Struct) {
            Value.newBuilder().setStructValue(value).build()
        } else if (value == null) {
            Value.newBuilder().setNullValue(NullValue.NULL_VALUE).build()
        } else {
            throw IllegalArgumentException("Cannot convert $value to a protobuf `Value`")
        }
    }

    fun listValue(value: Iterable<*>): Value? {
        val listValue = ListValue.newBuilder()
        for (item in value) {
            listValue.addValues(value(item))
        }
        return Value.newBuilder().setListValue(listValue.build()).build()
    }

    fun <T, K, U> toMapNullFriendly(
        keyMapper: Function<in T, out K>?,
        valueMapper: Function<in T, out U>
    ): Collector<T, *, Map<K, U?>>? {
        val none = Any() as U
        return Collectors.collectingAndThen(
            Collectors.toMap(keyMapper,
                valueMapper.andThen { v -> if (v == null) none else v }),
            Function<MutableMap<K, U?>, Map<K, U?>> { map: MutableMap<K, U?> ->
                map.replaceAll { k: K, v: U? -> if (v === none) null else v }
                map
            })
    }
}