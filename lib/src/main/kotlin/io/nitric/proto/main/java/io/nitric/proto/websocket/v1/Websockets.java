// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/websocket/v1/websocket.proto

package io.nitric.proto.websocket.v1;

public final class Websockets {
  private Websockets() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_websocket_v1_WebsocketSendRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_websocket_v1_WebsocketSendRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_websocket_v1_WebsocketSendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_websocket_v1_WebsocketSendResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_websocket_v1_WebsocketCloseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_websocket_v1_WebsocketCloseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_websocket_v1_WebsocketCloseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_websocket_v1_WebsocketCloseResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"proto/websocket/v1/websocket.proto\022\023ni" +
      "tric.websocket.v1\032\027validate/validate.pro" +
      "to\"]\n\024WebsocketSendRequest\022\027\n\006socket\030\001 \001" +
      "(\tB\007\372B\004r\002\020\001\022\036\n\rconnection_id\030\002 \001(\tB\007\372B\004r" +
      "\002\020\001\022\014\n\004data\030\003 \001(\014\"\027\n\025WebsocketSendRespon" +
      "se\"P\n\025WebsocketCloseRequest\022\027\n\006socket\030\001 " +
      "\001(\tB\007\372B\004r\002\020\001\022\036\n\rconnection_id\030\002 \001(\tB\007\372B\004" +
      "r\002\020\001\"\030\n\026WebsocketCloseResponse2\323\001\n\020Webso" +
      "cketService\022]\n\004Send\022).nitric.websocket.v" +
      "1.WebsocketSendRequest\032*.nitric.websocke" +
      "t.v1.WebsocketSendResponse\022`\n\005Close\022*.ni" +
      "tric.websocket.v1.WebsocketCloseRequest\032" +
      "+.nitric.websocket.v1.WebsocketCloseResp" +
      "onseB\243\001\n\034io.nitric.proto.websocket.v1B\nW" +
      "ebsocketsP\001Z=github.com/nitrictech/nitri" +
      "c/core/pkg/api/nitric/websocket/v1\252\002\031Nit" +
      "ric.Proto.Websocket.v1\312\002\031Nitric\\Proto\\We" +
      "bsocket\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_nitric_websocket_v1_WebsocketSendRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nitric_websocket_v1_WebsocketSendRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_websocket_v1_WebsocketSendRequest_descriptor,
        new java.lang.String[] { "Socket", "ConnectionId", "Data", });
    internal_static_nitric_websocket_v1_WebsocketSendResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nitric_websocket_v1_WebsocketSendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_websocket_v1_WebsocketSendResponse_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_websocket_v1_WebsocketCloseRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nitric_websocket_v1_WebsocketCloseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_websocket_v1_WebsocketCloseRequest_descriptor,
        new java.lang.String[] { "Socket", "ConnectionId", });
    internal_static_nitric_websocket_v1_WebsocketCloseResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_nitric_websocket_v1_WebsocketCloseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_websocket_v1_WebsocketCloseResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
