// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

public interface SubscriptionTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.deploy.v1.SubscriptionTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of an execution unit to target
   * </pre>
   *
   * <code>string execution_unit = 1;</code>
   * @return Whether the executionUnit field is set.
   */
  boolean hasExecutionUnit();
  /**
   * <pre>
   * The name of an execution unit to target
   * </pre>
   *
   * <code>string execution_unit = 1;</code>
   * @return The executionUnit.
   */
  java.lang.String getExecutionUnit();
  /**
   * <pre>
   * The name of an execution unit to target
   * </pre>
   *
   * <code>string execution_unit = 1;</code>
   * @return The bytes for executionUnit.
   */
  com.google.protobuf.ByteString
      getExecutionUnitBytes();

  public io.nitric.proto.deploy.v1.SubscriptionTarget.TargetCase getTargetCase();
}
