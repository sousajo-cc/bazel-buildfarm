// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface GetClientStartTimeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.GetClientStartTime)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string instance_name = 1;</code>
   */
  java.lang.String getInstanceName();
  /**
   * <code>string instance_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getInstanceNameBytes();

  /**
   * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
   */
  boolean hasClientStartTime();
  /**
   * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
   */
  com.google.protobuf.Timestamp getClientStartTime();
  /**
   * <code>.google.protobuf.Timestamp client_start_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getClientStartTimeOrBuilder();
}
