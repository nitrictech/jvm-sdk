// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

public interface TopicOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.deploy.v1.Topic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TODO: Include topic specifications here
   * </pre>
   *
   * <code>repeated .nitric.deploy.v1.SubscriptionTarget subscriptions = 1;</code>
   */
  java.util.List<io.nitric.proto.deploy.v1.SubscriptionTarget> 
      getSubscriptionsList();
  /**
   * <pre>
   * TODO: Include topic specifications here
   * </pre>
   *
   * <code>repeated .nitric.deploy.v1.SubscriptionTarget subscriptions = 1;</code>
   */
  io.nitric.proto.deploy.v1.SubscriptionTarget getSubscriptions(int index);
  /**
   * <pre>
   * TODO: Include topic specifications here
   * </pre>
   *
   * <code>repeated .nitric.deploy.v1.SubscriptionTarget subscriptions = 1;</code>
   */
  int getSubscriptionsCount();
  /**
   * <pre>
   * TODO: Include topic specifications here
   * </pre>
   *
   * <code>repeated .nitric.deploy.v1.SubscriptionTarget subscriptions = 1;</code>
   */
  java.util.List<? extends io.nitric.proto.deploy.v1.SubscriptionTargetOrBuilder> 
      getSubscriptionsOrBuilderList();
  /**
   * <pre>
   * TODO: Include topic specifications here
   * </pre>
   *
   * <code>repeated .nitric.deploy.v1.SubscriptionTarget subscriptions = 1;</code>
   */
  io.nitric.proto.deploy.v1.SubscriptionTargetOrBuilder getSubscriptionsOrBuilder(
      int index);
}