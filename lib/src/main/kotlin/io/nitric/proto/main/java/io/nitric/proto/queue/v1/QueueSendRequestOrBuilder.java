// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/queue/v1/queue.proto

package io.nitric.proto.queue.v1;

public interface QueueSendRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.queue.v1.QueueSendRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Nitric name for the queue
   * this will automatically be resolved to the provider specific queue identifier.
   * </pre>
   *
   * <code>string queue = 1 [(.validate.rules) = { ... }</code>
   * @return The queue.
   */
  java.lang.String getQueue();
  /**
   * <pre>
   * The Nitric name for the queue
   * this will automatically be resolved to the provider specific queue identifier.
   * </pre>
   *
   * <code>string queue = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for queue.
   */
  com.google.protobuf.ByteString
      getQueueBytes();

  /**
   * <pre>
   * The task to push to the queue
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * The task to push to the queue
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 2 [(.validate.rules) = { ... }</code>
   * @return The task.
   */
  io.nitric.proto.queue.v1.NitricTask getTask();
  /**
   * <pre>
   * The task to push to the queue
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 2 [(.validate.rules) = { ... }</code>
   */
  io.nitric.proto.queue.v1.NitricTaskOrBuilder getTaskOrBuilder();
}
