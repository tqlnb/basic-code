// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: INodeRunnerRemote.proto

package ins.daemon.node;

public interface updateAppRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ins.daemon.node.updateAppRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bytes files = 2;</code>
   * @return The files.
   */
  com.google.protobuf.ByteString getFiles();

  /**
   * <code>bool force = 3;</code>
   * @return The force.
   */
  boolean getForce();
}
