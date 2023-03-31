// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: http.proto

package com.google.api;

public final class HttpProto {
  private HttpProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Http_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Http_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_HttpRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_HttpRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_CustomHttpPattern_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_CustomHttpPattern_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nhttp.proto\022\ngoogle.api\"+\n\004Http\022#\n\005rule" +
      "s\030\001 \003(\0132\024.google.api.HttpRule\"\352\001\n\010HttpRu" +
      "le\022\020\n\010selector\030\001 \001(\t\022\r\n\003get\030\002 \001(\tH\000\022\r\n\003p" +
      "ut\030\003 \001(\tH\000\022\016\n\004post\030\004 \001(\tH\000\022\020\n\006delete\030\005 \001" +
      "(\tH\000\022\017\n\005patch\030\006 \001(\tH\000\022/\n\006custom\030\010 \001(\0132\035." +
      "google.api.CustomHttpPatternH\000\022\014\n\004body\030\007" +
      " \001(\t\0221\n\023additional_bindings\030\013 \003(\0132\024.goog" +
      "le.api.HttpRuleB\t\n\007pattern\"/\n\021CustomHttp" +
      "Pattern\022\014\n\004kind\030\001 \001(\t\022\014\n\004path\030\002 \001(\tBj\n\016c" +
      "om.google.apiB\tHttpProtoP\001ZAgoogle.golan" +
      "g.org/genproto/googleapis/api/annotation" +
      "s;annotations\370\001\001\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_api_Http_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Http_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Http_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_google_api_HttpRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_HttpRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_HttpRule_descriptor,
        new java.lang.String[] { "Selector", "Get", "Put", "Post", "Delete", "Patch", "Custom", "Body", "AdditionalBindings", "Pattern", });
    internal_static_google_api_CustomHttpPattern_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_CustomHttpPattern_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_CustomHttpPattern_descriptor,
        new java.lang.String[] { "Kind", "Path", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
