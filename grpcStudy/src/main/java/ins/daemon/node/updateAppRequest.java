// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: INodeRunnerRemote.proto

package ins.daemon.node;

/**
 * Protobuf type {@code ins.daemon.node.updateAppRequest}
 */
public final class updateAppRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ins.daemon.node.updateAppRequest)
    updateAppRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use updateAppRequest.newBuilder() to construct.
  private updateAppRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private updateAppRequest() {
    name_ = "";
    files_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new updateAppRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return INodeRunnerRt.internal_static_ins_daemon_node_updateAppRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return INodeRunnerRt.internal_static_ins_daemon_node_updateAppRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            updateAppRequest.class, Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object name_ = "";
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @Override
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILES_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString files_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes files = 2;</code>
   * @return The files.
   */
  @Override
  public com.google.protobuf.ByteString getFiles() {
    return files_;
  }

  public static final int FORCE_FIELD_NUMBER = 3;
  private boolean force_ = false;
  /**
   * <code>bool force = 3;</code>
   * @return The force.
   */
  @Override
  public boolean getForce() {
    return force_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!files_.isEmpty()) {
      output.writeBytes(2, files_);
    }
    if (force_ != false) {
      output.writeBool(3, force_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!files_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, files_);
    }
    if (force_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, force_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof updateAppRequest)) {
      return super.equals(obj);
    }
    updateAppRequest other = (updateAppRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getFiles()
        .equals(other.getFiles())) return false;
    if (getForce()
        != other.getForce()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + FILES_FIELD_NUMBER;
    hash = (53 * hash) + getFiles().hashCode();
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForce());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static updateAppRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static updateAppRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static updateAppRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static updateAppRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static updateAppRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static updateAppRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static updateAppRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static updateAppRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static updateAppRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static updateAppRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static updateAppRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static updateAppRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(updateAppRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ins.daemon.node.updateAppRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ins.daemon.node.updateAppRequest)
      updateAppRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return INodeRunnerRt.internal_static_ins_daemon_node_updateAppRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return INodeRunnerRt.internal_static_ins_daemon_node_updateAppRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              updateAppRequest.class, Builder.class);
    }

    // Construct using ins.daemon.node.updateAppRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      files_ = com.google.protobuf.ByteString.EMPTY;
      force_ = false;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return INodeRunnerRt.internal_static_ins_daemon_node_updateAppRequest_descriptor;
    }

    @Override
    public updateAppRequest getDefaultInstanceForType() {
      return updateAppRequest.getDefaultInstance();
    }

    @Override
    public updateAppRequest build() {
      updateAppRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public updateAppRequest buildPartial() {
      updateAppRequest result = new updateAppRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(updateAppRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.files_ = files_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.force_ = force_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof updateAppRequest) {
        return mergeFrom((updateAppRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(updateAppRequest other) {
      if (other == updateAppRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFiles() != com.google.protobuf.ByteString.EMPTY) {
        setFiles(other.getFiles());
      }
      if (other.getForce() != false) {
        setForce(other.getForce());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              files_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              force_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString files_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes files = 2;</code>
     * @return The files.
     */
    @Override
    public com.google.protobuf.ByteString getFiles() {
      return files_;
    }
    /**
     * <code>bytes files = 2;</code>
     * @param value The files to set.
     * @return This builder for chaining.
     */
    public Builder setFiles(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      files_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes files = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiles() {
      bitField0_ = (bitField0_ & ~0x00000002);
      files_ = getDefaultInstance().getFiles();
      onChanged();
      return this;
    }

    private boolean force_ ;
    /**
     * <code>bool force = 3;</code>
     * @return The force.
     */
    @Override
    public boolean getForce() {
      return force_;
    }
    /**
     * <code>bool force = 3;</code>
     * @param value The force to set.
     * @return This builder for chaining.
     */
    public Builder setForce(boolean value) {

      force_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool force = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearForce() {
      bitField0_ = (bitField0_ & ~0x00000004);
      force_ = false;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ins.daemon.node.updateAppRequest)
  }

  // @@protoc_insertion_point(class_scope:ins.daemon.node.updateAppRequest)
  private static final updateAppRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new updateAppRequest();
  }

  public static updateAppRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<updateAppRequest>
      PARSER = new com.google.protobuf.AbstractParser<updateAppRequest>() {
    @Override
    public updateAppRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<updateAppRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<updateAppRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public updateAppRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

