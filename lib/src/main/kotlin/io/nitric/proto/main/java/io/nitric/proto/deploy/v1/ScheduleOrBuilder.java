// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

public interface ScheduleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.deploy.v1.Schedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cron = 1;</code>
   * @return The cron.
   */
  java.lang.String getCron();
  /**
   * <code>string cron = 1;</code>
   * @return The bytes for cron.
   */
  com.google.protobuf.ByteString
      getCronBytes();

  /**
   * <code>.nitric.deploy.v1.ScheduleTarget target = 2;</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <code>.nitric.deploy.v1.ScheduleTarget target = 2;</code>
   * @return The target.
   */
  io.nitric.proto.deploy.v1.ScheduleTarget getTarget();
  /**
   * <code>.nitric.deploy.v1.ScheduleTarget target = 2;</code>
   */
  io.nitric.proto.deploy.v1.ScheduleTargetOrBuilder getTargetOrBuilder();
}
