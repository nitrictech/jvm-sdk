// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

public interface PolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.deploy.v1.Policy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
   */
  java.util.List<io.nitric.proto.deploy.v1.Resource> 
      getPrincipalsList();
  /**
   * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
   */
  io.nitric.proto.deploy.v1.Resource getPrincipals(int index);
  /**
   * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
   */
  int getPrincipalsCount();
  /**
   * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
   */
  java.util.List<? extends io.nitric.proto.deploy.v1.ResourceOrBuilder> 
      getPrincipalsOrBuilderList();
  /**
   * <code>repeated .nitric.deploy.v1.Resource principals = 1;</code>
   */
  io.nitric.proto.deploy.v1.ResourceOrBuilder getPrincipalsOrBuilder(
      int index);

  /**
   * <pre>
   * TODO: Split out discrete action definitions from resources
   * Also need to allow custom action types as well
   * Should incorporate action re-use here...
   * </pre>
   *
   * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
   * @return A list containing the actions.
   */
  java.util.List<io.nitric.proto.resource.v1.Action> getActionsList();
  /**
   * <pre>
   * TODO: Split out discrete action definitions from resources
   * Also need to allow custom action types as well
   * Should incorporate action re-use here...
   * </pre>
   *
   * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
   * @return The count of actions.
   */
  int getActionsCount();
  /**
   * <pre>
   * TODO: Split out discrete action definitions from resources
   * Also need to allow custom action types as well
   * Should incorporate action re-use here...
   * </pre>
   *
   * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
   * @param index The index of the element to return.
   * @return The actions at the given index.
   */
  io.nitric.proto.resource.v1.Action getActions(int index);
  /**
   * <pre>
   * TODO: Split out discrete action definitions from resources
   * Also need to allow custom action types as well
   * Should incorporate action re-use here...
   * </pre>
   *
   * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
   * @return A list containing the enum numeric values on the wire for actions.
   */
  java.util.List<java.lang.Integer>
  getActionsValueList();
  /**
   * <pre>
   * TODO: Split out discrete action definitions from resources
   * Also need to allow custom action types as well
   * Should incorporate action re-use here...
   * </pre>
   *
   * <code>repeated .nitric.resource.v1.Action actions = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of actions at the given index.
   */
  int getActionsValue(int index);

  /**
   * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
   */
  java.util.List<io.nitric.proto.deploy.v1.Resource> 
      getResourcesList();
  /**
   * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
   */
  io.nitric.proto.deploy.v1.Resource getResources(int index);
  /**
   * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
   */
  int getResourcesCount();
  /**
   * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
   */
  java.util.List<? extends io.nitric.proto.deploy.v1.ResourceOrBuilder> 
      getResourcesOrBuilderList();
  /**
   * <code>repeated .nitric.deploy.v1.Resource resources = 3;</code>
   */
  io.nitric.proto.deploy.v1.ResourceOrBuilder getResourcesOrBuilder(
      int index);
}
