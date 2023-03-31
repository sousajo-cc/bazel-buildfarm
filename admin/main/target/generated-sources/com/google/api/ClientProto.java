// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package com.google.api;

public final class ClientProto {
  private ClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.ClientProto.oauthScopes);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int METHOD_SIGNATURE_FIELD_NUMBER = 1051;
  /**
   * <pre>
   * A definition of a client library method signature.
   * In client libraries, each proto RPC corresponds to one or more methods
   * which the end user is able to call, and calls the underlying RPC.
   * Normally, this method receives a single argument (a struct or instance
   * corresponding to the RPC request object). Defining this field will
   * add one or more overloads providing flattened or simpler method signatures
   * in some languages.
   * The fields on the method signature are provided as a comma-separated
   * string.
   * For example, the proto RPC and annotation:
   *   rpc CreateSubscription(CreateSubscriptionRequest)
   *       returns (Subscription) {
   *     option (google.api.method_signature) = "name,topic";
   *   }
   * Would add the following Java overload (in addition to the method accepting
   * the request object):
   *   public final Subscription createSubscription(String name, String topic)
   * The following backwards-compatibility guidelines apply:
   *   * Adding this annotation to an unannotated method is backwards
   *     compatible.
   *   * Adding this annotation to a method which already has existing
   *     method signature annotations is backwards compatible if and only if
   *     the new method signature annotation is last in the sequence.
   *   * Modifying or removing an existing method signature annotation is
   *     a breaking change.
   *   * Re-ordering existing method signature annotations is a breaking
   *     change.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      java.util.List<java.lang.String>> methodSignature = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int DEFAULT_HOST_FIELD_NUMBER = 1049;
  /**
   * <pre>
   * The hostname for this service.
   * This should be specified with no prefix or protocol.
   * Example:
   *   service Foo {
   *     option (google.api.default_host) = "foo.googleapi.com";
   *     ...
   *   }
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.String> defaultHost = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int OAUTH_SCOPES_FIELD_NUMBER = 1050;
  /**
   * <pre>
   * OAuth scopes needed for the client.
   * Example:
   *   service Foo {
   *     option (google.api.oauth_scopes) = &#92;
   *       "https://www.googleapis.com/auth/cloud-platform";
   *     ...
   *   }
   * If there is more than one scope, use a comma-separated string:
   * Example:
   *   service Foo {
   *     option (google.api.oauth_scopes) = &#92;
   *       "https://www.googleapis.com/auth/cloud-platform,"
   *       "https://www.googleapis.com/auth/monitoring";
   *     ...
   *   }
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.ServiceOptions,
      java.lang.String> oauthScopes = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014client.proto\022\ngoogle.api\032\020descriptor.p" +
      "roto:9\n\020method_signature\022\036.google.protob" +
      "uf.MethodOptions\030\233\010 \003(\t:6\n\014default_host\022" +
      "\037.google.protobuf.ServiceOptions\030\231\010 \001(\t:" +
      "6\n\014oauth_scopes\022\037.google.protobuf.Servic" +
      "eOptions\030\232\010 \001(\tBi\n\016com.google.apiB\013Clien" +
      "tProtoP\001ZAgoogle.golang.org/genproto/goo" +
      "gleapis/api/annotations;annotations\242\002\004GA" +
      "PIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    methodSignature.internalInit(descriptor.getExtensions().get(0));
    defaultHost.internalInit(descriptor.getExtensions().get(1));
    oauthScopes.internalInit(descriptor.getExtensions().get(2));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
