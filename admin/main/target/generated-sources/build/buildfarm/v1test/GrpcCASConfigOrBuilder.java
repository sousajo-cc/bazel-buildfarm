// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buildfarm.proto

package build.buildfarm.v1test;

public interface GrpcCASConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.buildfarm.v1test.GrpcCASConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * CAS resources must contain instance names
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  java.lang.String getInstanceName();
  /**
   * <pre>
   * CAS resources must contain instance names
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getInstanceNameBytes();

  /**
   * <pre>
   * grpc endpoint supporting CAS/BS
   * </pre>
   *
   * <code>string target = 2;</code>
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * grpc endpoint supporting CAS/BS
   * </pre>
   *
   * <code>string target = 2;</code>
   */
  com.google.protobuf.ByteString
      getTargetBytes();
}
