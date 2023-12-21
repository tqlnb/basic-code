// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: INodeRunnerRemote.proto

package ins.daemon.node;

/**
 * Protobuf type {@code ins.daemon.node.checkDeamonStatusResponse}
 */
public final class checkDeamonStatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ins.daemon.node.checkDeamonStatusResponse)
    checkDeamonStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use checkDeamonStatusResponse.newBuilder() to construct.
  private checkDeamonStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private checkDeamonStatusResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new checkDeamonStatusResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_checkDeamonStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_checkDeamonStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ins.daemon.node.checkDeamonStatusResponse.class, ins.daemon.node.checkDeamonStatusResponse.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private boolean message_ = false;
  /**
   * <code>bool message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public boolean getMessage() {
    return message_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (message_ != false) {
      output.writeBool(1, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (message_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, message_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ins.daemon.node.checkDeamonStatusResponse)) {
      return super.equals(obj);
    }
    ins.daemon.node.checkDeamonStatusResponse other = (ins.daemon.node.checkDeamonStatusResponse) obj;

    if (getMessage()
        != other.getMessage()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMessage());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ins.daemon.node.checkDeamonStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ins.daemon.node.checkDeamonStatusResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ins.daemon.node.checkDeamonStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ins.daemon.node.checkDeamonStatusResponse)
      ins.daemon.node.checkDeamonStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_checkDeamonStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_checkDeamonStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ins.daemon.node.checkDeamonStatusResponse.class, ins.daemon.node.checkDeamonStatusResponse.Builder.class);
    }

    // Construct using ins.daemon.node.checkDeamonStatusResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      message_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_checkDeamonStatusResponse_descriptor;
    }

    @java.lang.Override
    public ins.daemon.node.checkDeamonStatusResponse getDefaultInstanceForType() {
      return ins.daemon.node.checkDeamonStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ins.daemon.node.checkDeamonStatusResponse build() {
      ins.daemon.node.checkDeamonStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ins.daemon.node.checkDeamonStatusResponse buildPartial() {
      ins.daemon.node.checkDeamonStatusResponse result = new ins.daemon.node.checkDeamonStatusResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ins.daemon.node.checkDeamonStatusResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ins.daemon.node.checkDeamonStatusResponse) {
        return mergeFrom((ins.daemon.node.checkDeamonStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ins.daemon.node.checkDeamonStatusResponse other) {
      if (other == ins.daemon.node.checkDeamonStatusResponse.getDefaultInstance()) return this;
      if (other.getMessage() != false) {
        setMessage(other.getMessage());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              message_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean message_ ;
    /**
     * <code>bool message = 1;</code>
     * @return The message.
     */
    @java.lang.Override
    public boolean getMessage() {
      return message_;
    }
    /**
     * <code>bool message = 1;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(boolean value) {

      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      message_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ins.daemon.node.checkDeamonStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:ins.daemon.node.checkDeamonStatusResponse)
  private static final ins.daemon.node.checkDeamonStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ins.daemon.node.checkDeamonStatusResponse();
  }

  public static ins.daemon.node.checkDeamonStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<checkDeamonStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<checkDeamonStatusResponse>() {
    @java.lang.Override
    public checkDeamonStatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<checkDeamonStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<checkDeamonStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ins.daemon.node.checkDeamonStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

