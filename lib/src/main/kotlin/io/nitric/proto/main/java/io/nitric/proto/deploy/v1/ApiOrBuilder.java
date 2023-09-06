// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/deploy/v1/deploy.proto

package io.nitric.proto.deploy.v1;

public interface ApiOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.deploy.v1.Api)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An OpenAPI document for deployment
   * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
   * </pre>
   *
   * <code>string openapi = 1;</code>
   * @return Whether the openapi field is set.
   */
  boolean hasOpenapi();
  /**
   * <pre>
   * An OpenAPI document for deployment
   * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
   * </pre>
   *
   * <code>string openapi = 1;</code>
   * @return The openapi.
   */
  java.lang.String getOpenapi();
  /**
   * <pre>
   * An OpenAPI document for deployment
   * This document will contain extensions that hint of execution units that should be targeted as part of the deployment
   * </pre>
   *
   * <code>string openapi = 1;</code>
   * @return The bytes for openapi.
   */
  com.google.protobuf.ByteString
      getOpenapiBytes();

  public io.nitric.proto.deploy.v1.Api.DocumentCase getDocumentCase();
}
