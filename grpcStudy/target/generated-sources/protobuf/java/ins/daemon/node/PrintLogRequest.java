// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: INodeRunnerRemote.proto

package ins.daemon.node;

/**
 * Protobuf type {@code ins.daemon.node.PrintLogRequest}
 */
public final class PrintLogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ins.daemon.node.PrintLogRequest)
    PrintLogRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrintLogRequest.newBuilder() to construct.
  private PrintLogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrintLogRequest() {
    logName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrintLogRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_PrintLogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_PrintLogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ins.daemon.node.PrintLogRequest.class, ins.daemon.node.PrintLogRequest.Builder.class);
  }

  public static final int LOGNAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object logName_ = "";
  /**
   * <code>string logName = 1;</code>
   * @return The logName.
   */
  @java.lang.Override
  public java.lang.String getLogName() {
    java.lang.Object ref = logName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logName_ = s;
      return s;
    }
  }
  /**
   * <code>string logName = 1;</code>
   * @return The bytes for logName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogNameBytes() {
    java.lang.Object ref = logName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, logName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(logName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, logName_);
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
    if (!(obj instanceof ins.daemon.node.PrintLogRequest)) {
      return super.equals(obj);
    }
    ins.daemon.node.PrintLogRequest other = (ins.daemon.node.PrintLogRequest) obj;

    if (!getLogName()
        .equals(other.getLogName())) return false;
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
    hash = (37 * hash) + LOGNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLogName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ins.daemon.node.PrintLogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ins.daemon.node.PrintLogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ins.daemon.node.PrintLogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ins.daemon.node.PrintLogRequest parseFrom(
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
  public static Builder newBuilder(ins.daemon.node.PrintLogRequest prototype) {
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
   * Protobuf type {@code ins.daemon.node.PrintLogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ins.daemon.node.PrintLogRequest)
      ins.daemon.node.PrintLogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_PrintLogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_PrintLogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ins.daemon.node.PrintLogRequest.class, ins.daemon.node.PrintLogRequest.Builder.class);
    }

    // Construct using ins.daemon.node.PrintLogRequest.newBuilder()
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
      logName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_PrintLogRequest_descriptor;
    }

    @java.lang.Override
    public ins.daemon.node.PrintLogRequest getDefaultInstanceForType() {
      return ins.daemon.node.PrintLogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ins.daemon.node.PrintLogRequest build() {
      ins.daemon.node.PrintLogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ins.daemon.node.PrintLogRequest buildPartial() {
      ins.daemon.node.PrintLogRequest result = new ins.daemon.node.PrintLogRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ins.daemon.node.PrintLogRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.logName_ = logName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ins.daemon.node.PrintLogRequest) {
        return mergeFrom((ins.daemon.node.PrintLogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ins.daemon.node.PrintLogRequest other) {
      if (other == ins.daemon.node.PrintLogRequest.getDefaultInstance()) return this;
      if (!other.getLogName().isEmpty()) {
        logName_ = other.logName_;
        bitField0_ |= 0x00000001;
        onChanged();
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
            case 10: {
              logName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object logName_ = "";
    /**
     * <code>string logName = 1;</code>
     * @return The logName.
     */
    public java.lang.String getLogName() {
      java.lang.Object ref = logName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logName = 1;</code>
     * @return The bytes for logName.
     */
    public com.google.protobuf.ByteString
        getLogNameBytes() {
      java.lang.Object ref = logName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logName = 1;</code>
     * @param value The logName to set.
     * @return This builder for chaining.
     */
    public Builder setLogName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      logName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string logName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogName() {
      logName_ = getDefaultInstance().getLogName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string logName = 1;</code>
     * @param value The bytes for logName to set.
     * @return This builder for chaining.
     */
    public Builder setLogNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      logName_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:ins.daemon.node.PrintLogRequest)
  }

  // @@protoc_insertion_point(class_scope:ins.daemon.node.PrintLogRequest)
  private static final ins.daemon.node.PrintLogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ins.daemon.node.PrintLogRequest();
  }

  public static ins.daemon.node.PrintLogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrintLogRequest>
      PARSER = new com.google.protobuf.AbstractParser<PrintLogRequest>() {
    @java.lang.Override
    public PrintLogRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PrintLogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrintLogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ins.daemon.node.PrintLogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
