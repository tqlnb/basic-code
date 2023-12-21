// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: INodeRunnerRemote.proto

package ins.daemon.node;

/**
 * Protobuf type {@code ins.daemon.node.updateDSPRequest}
 */
public final class updateDSPRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ins.daemon.node.updateDSPRequest)
    updateDSPRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use updateDSPRequest.newBuilder() to construct.
  private updateDSPRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private updateDSPRequest() {
    resource_ = "";
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new updateDSPRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_updateDSPRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_updateDSPRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ins.daemon.node.updateDSPRequest.class, ins.daemon.node.updateDSPRequest.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resource_ = "";
  /**
   * <code>string resource = 1;</code>
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <code>string resource = 1;</code>
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.ByteString> data_;
  /**
   * <pre>
   *这里就是一个重复多个的数据定义，理解为数组即可
   * </pre>
   *
   * <code>repeated bytes data = 2;</code>
   * @return A list containing the data.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getDataList() {
    return data_;
  }
  /**
   * <pre>
   *这里就是一个重复多个的数据定义，理解为数组即可
   * </pre>
   *
   * <code>repeated bytes data = 2;</code>
   * @return The count of data.
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <pre>
   *这里就是一个重复多个的数据定义，理解为数组即可
   * </pre>
   *
   * <code>repeated bytes data = 2;</code>
   * @param index The index of the element to return.
   * @return The data at the given index.
   */
  public com.google.protobuf.ByteString getData(int index) {
    return data_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resource_);
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeBytes(2, data_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resource_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < data_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(data_.get(i));
      }
      size += dataSize;
      size += 1 * getDataList().size();
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
    if (!(obj instanceof ins.daemon.node.updateDSPRequest)) {
      return super.equals(obj);
    }
    ins.daemon.node.updateDSPRequest other = (ins.daemon.node.updateDSPRequest) obj;

    if (!getResource()
        .equals(other.getResource())) return false;
    if (!getDataList()
        .equals(other.getDataList())) return false;
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
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ins.daemon.node.updateDSPRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ins.daemon.node.updateDSPRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ins.daemon.node.updateDSPRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ins.daemon.node.updateDSPRequest parseFrom(
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
  public static Builder newBuilder(ins.daemon.node.updateDSPRequest prototype) {
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
   * Protobuf type {@code ins.daemon.node.updateDSPRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ins.daemon.node.updateDSPRequest)
      ins.daemon.node.updateDSPRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_updateDSPRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_updateDSPRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ins.daemon.node.updateDSPRequest.class, ins.daemon.node.updateDSPRequest.Builder.class);
    }

    // Construct using ins.daemon.node.updateDSPRequest.newBuilder()
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
      resource_ = "";
      data_ = java.util.Collections.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ins.daemon.node.INodeRunnerRt.internal_static_ins_daemon_node_updateDSPRequest_descriptor;
    }

    @java.lang.Override
    public ins.daemon.node.updateDSPRequest getDefaultInstanceForType() {
      return ins.daemon.node.updateDSPRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ins.daemon.node.updateDSPRequest build() {
      ins.daemon.node.updateDSPRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ins.daemon.node.updateDSPRequest buildPartial() {
      ins.daemon.node.updateDSPRequest result = new ins.daemon.node.updateDSPRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ins.daemon.node.updateDSPRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        data_ = java.util.Collections.unmodifiableList(data_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.data_ = data_;
    }

    private void buildPartial0(ins.daemon.node.updateDSPRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resource_ = resource_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ins.daemon.node.updateDSPRequest) {
        return mergeFrom((ins.daemon.node.updateDSPRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ins.daemon.node.updateDSPRequest other) {
      if (other == ins.daemon.node.updateDSPRequest.getDefaultInstance()) return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.data_.isEmpty()) {
        if (data_.isEmpty()) {
          data_ = other.data_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDataIsMutable();
          data_.addAll(other.data_);
        }
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
              resource_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.ByteString v = input.readBytes();
              ensureDataIsMutable();
              data_.add(v);
              break;
            } // case 18
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

    private java.lang.Object resource_ = "";
    /**
     * <code>string resource = 1;</code>
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resource = 1;</code>
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resource = 1;</code>
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resource_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string resource = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      resource_ = getDefaultInstance().getResource();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string resource = 1;</code>
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resource_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> data_ = java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        data_ = new java.util.ArrayList<com.google.protobuf.ByteString>(data_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     *这里就是一个重复多个的数据定义，理解为数组即可
     * </pre>
     *
     * <code>repeated bytes data = 2;</code>
     * @return A list containing the data.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getDataList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(data_) : data_;
    }
    /**
     * <pre>
     *这里就是一个重复多个的数据定义，理解为数组即可
     * </pre>
     *
     * <code>repeated bytes data = 2;</code>
     * @return The count of data.
     */
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <pre>
     *这里就是一个重复多个的数据定义，理解为数组即可
     * </pre>
     *
     * <code>repeated bytes data = 2;</code>
     * @param index The index of the element to return.
     * @return The data at the given index.
     */
    public com.google.protobuf.ByteString getData(int index) {
      return data_.get(index);
    }
    /**
     * <pre>
     *这里就是一个重复多个的数据定义，理解为数组即可
     * </pre>
     *
     * <code>repeated bytes data = 2;</code>
     * @param index The index to set the value at.
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDataIsMutable();
      data_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *这里就是一个重复多个的数据定义，理解为数组即可
     * </pre>
     *
     * <code>repeated bytes data = 2;</code>
     * @param value The data to add.
     * @return This builder for chaining.
     */
    public Builder addData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDataIsMutable();
      data_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *这里就是一个重复多个的数据定义，理解为数组即可
     * </pre>
     *
     * <code>repeated bytes data = 2;</code>
     * @param values The data to add.
     * @return This builder for chaining.
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureDataIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, data_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *这里就是一个重复多个的数据定义，理解为数组即可
     * </pre>
     *
     * <code>repeated bytes data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      data_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:ins.daemon.node.updateDSPRequest)
  }

  // @@protoc_insertion_point(class_scope:ins.daemon.node.updateDSPRequest)
  private static final ins.daemon.node.updateDSPRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ins.daemon.node.updateDSPRequest();
  }

  public static ins.daemon.node.updateDSPRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<updateDSPRequest>
      PARSER = new com.google.protobuf.AbstractParser<updateDSPRequest>() {
    @java.lang.Override
    public updateDSPRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<updateDSPRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<updateDSPRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ins.daemon.node.updateDSPRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
