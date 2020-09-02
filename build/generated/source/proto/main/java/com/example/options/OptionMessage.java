// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: options.proto

package com.example.options;

/**
 * Protobuf type {@code example.options.OptionMessage}
 */
public  final class OptionMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:example.options.OptionMessage)
    OptionMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OptionMessage.newBuilder() to construct.
  private OptionMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OptionMessage() {
    name_ = "";
    simpleList_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OptionMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OptionMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 16: {

            isSimple_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              simpleList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            simpleList_.addInt(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              simpleList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              simpleList_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        simpleList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.options.Options.internal_static_example_options_OptionMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.options.Options.internal_static_example_options_OptionMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.options.OptionMessage.class, com.example.options.OptionMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  public int getId() {
    return id_;
  }

  public static final int IS_SIMPLE_FIELD_NUMBER = 2;
  private boolean isSimple_;
  /**
   * <code>bool is_simple = 2;</code>
   * @return The isSimple.
   */
  public boolean getIsSimple() {
    return isSimple_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIMPLE_LIST_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList simpleList_;
  /**
   * <code>repeated int32 simple_list = 4;</code>
   * @return A list containing the simpleList.
   */
  public java.util.List<java.lang.Integer>
      getSimpleListList() {
    return simpleList_;
  }
  /**
   * <code>repeated int32 simple_list = 4;</code>
   * @return The count of simpleList.
   */
  public int getSimpleListCount() {
    return simpleList_.size();
  }
  /**
   * <code>repeated int32 simple_list = 4;</code>
   * @param index The index of the element to return.
   * @return The simpleList at the given index.
   */
  public int getSimpleList(int index) {
    return simpleList_.getInt(index);
  }
  private int simpleListMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (isSimple_ != false) {
      output.writeBool(2, isSimple_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (getSimpleListList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(simpleListMemoizedSerializedSize);
    }
    for (int i = 0; i < simpleList_.size(); i++) {
      output.writeInt32NoTag(simpleList_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (isSimple_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isSimple_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < simpleList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(simpleList_.getInt(i));
      }
      size += dataSize;
      if (!getSimpleListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      simpleListMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.options.OptionMessage)) {
      return super.equals(obj);
    }
    com.example.options.OptionMessage other = (com.example.options.OptionMessage) obj;

    if (getId()
        != other.getId()) return false;
    if (getIsSimple()
        != other.getIsSimple()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getSimpleListList()
        .equals(other.getSimpleListList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + IS_SIMPLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSimple());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getSimpleListCount() > 0) {
      hash = (37 * hash) + SIMPLE_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getSimpleListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.options.OptionMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.options.OptionMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.options.OptionMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.options.OptionMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.options.OptionMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessage parseFrom(
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
  public static Builder newBuilder(com.example.options.OptionMessage prototype) {
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
   * Protobuf type {@code example.options.OptionMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:example.options.OptionMessage)
      com.example.options.OptionMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.options.Options.internal_static_example_options_OptionMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.options.Options.internal_static_example_options_OptionMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.options.OptionMessage.class, com.example.options.OptionMessage.Builder.class);
    }

    // Construct using com.example.options.OptionMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      isSimple_ = false;

      name_ = "";

      simpleList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.options.Options.internal_static_example_options_OptionMessage_descriptor;
    }

    @java.lang.Override
    public com.example.options.OptionMessage getDefaultInstanceForType() {
      return com.example.options.OptionMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.options.OptionMessage build() {
      com.example.options.OptionMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.options.OptionMessage buildPartial() {
      com.example.options.OptionMessage result = new com.example.options.OptionMessage(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.isSimple_ = isSimple_;
      result.name_ = name_;
      if (((bitField0_ & 0x00000001) != 0)) {
        simpleList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.simpleList_ = simpleList_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.options.OptionMessage) {
        return mergeFrom((com.example.options.OptionMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.options.OptionMessage other) {
      if (other == com.example.options.OptionMessage.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getIsSimple() != false) {
        setIsSimple(other.getIsSimple());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.simpleList_.isEmpty()) {
        if (simpleList_.isEmpty()) {
          simpleList_ = other.simpleList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSimpleListIsMutable();
          simpleList_.addAll(other.simpleList_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.example.options.OptionMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.options.OptionMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private boolean isSimple_ ;
    /**
     * <code>bool is_simple = 2;</code>
     * @return The isSimple.
     */
    public boolean getIsSimple() {
      return isSimple_;
    }
    /**
     * <code>bool is_simple = 2;</code>
     * @param value The isSimple to set.
     * @return This builder for chaining.
     */
    public Builder setIsSimple(boolean value) {
      
      isSimple_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_simple = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSimple() {
      
      isSimple_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList simpleList_ = emptyIntList();
    private void ensureSimpleListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        simpleList_ = mutableCopy(simpleList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 simple_list = 4;</code>
     * @return A list containing the simpleList.
     */
    public java.util.List<java.lang.Integer>
        getSimpleListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(simpleList_) : simpleList_;
    }
    /**
     * <code>repeated int32 simple_list = 4;</code>
     * @return The count of simpleList.
     */
    public int getSimpleListCount() {
      return simpleList_.size();
    }
    /**
     * <code>repeated int32 simple_list = 4;</code>
     * @param index The index of the element to return.
     * @return The simpleList at the given index.
     */
    public int getSimpleList(int index) {
      return simpleList_.getInt(index);
    }
    /**
     * <code>repeated int32 simple_list = 4;</code>
     * @param index The index to set the value at.
     * @param value The simpleList to set.
     * @return This builder for chaining.
     */
    public Builder setSimpleList(
        int index, int value) {
      ensureSimpleListIsMutable();
      simpleList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 simple_list = 4;</code>
     * @param value The simpleList to add.
     * @return This builder for chaining.
     */
    public Builder addSimpleList(int value) {
      ensureSimpleListIsMutable();
      simpleList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 simple_list = 4;</code>
     * @param values The simpleList to add.
     * @return This builder for chaining.
     */
    public Builder addAllSimpleList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureSimpleListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, simpleList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 simple_list = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSimpleList() {
      simpleList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:example.options.OptionMessage)
  }

  // @@protoc_insertion_point(class_scope:example.options.OptionMessage)
  private static final com.example.options.OptionMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.options.OptionMessage();
  }

  public static com.example.options.OptionMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OptionMessage>
      PARSER = new com.google.protobuf.AbstractParser<OptionMessage>() {
    @java.lang.Override
    public OptionMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OptionMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OptionMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OptionMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.options.OptionMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

