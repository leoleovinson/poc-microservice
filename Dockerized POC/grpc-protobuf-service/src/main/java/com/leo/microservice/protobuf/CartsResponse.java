// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.leo.microservice.protobuf;

/**
 * Protobuf type {@code com.leo.microservice.cartservice.proto.CartsResponse}
 */
public final class CartsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.leo.microservice.cartservice.proto.CartsResponse)
    CartsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CartsResponse.newBuilder() to construct.
  private CartsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CartsResponse() {
    carts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CartsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CartsResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              carts_ = new java.util.ArrayList<com.leo.microservice.protobuf.CartResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            carts_.add(
                input.readMessage(com.leo.microservice.protobuf.CartResponse.parser(), extensionRegistry));
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
        carts_ = java.util.Collections.unmodifiableList(carts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leo.microservice.protobuf.CartsResponse.class, com.leo.microservice.protobuf.CartsResponse.Builder.class);
  }

  public static final int CARTS_FIELD_NUMBER = 1;
  private java.util.List<com.leo.microservice.protobuf.CartResponse> carts_;
  /**
   * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.leo.microservice.protobuf.CartResponse> getCartsList() {
    return carts_;
  }
  /**
   * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.leo.microservice.protobuf.CartResponseOrBuilder> 
      getCartsOrBuilderList() {
    return carts_;
  }
  /**
   * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
   */
  @java.lang.Override
  public int getCartsCount() {
    return carts_.size();
  }
  /**
   * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
   */
  @java.lang.Override
  public com.leo.microservice.protobuf.CartResponse getCarts(int index) {
    return carts_.get(index);
  }
  /**
   * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
   */
  @java.lang.Override
  public com.leo.microservice.protobuf.CartResponseOrBuilder getCartsOrBuilder(
      int index) {
    return carts_.get(index);
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
    for (int i = 0; i < carts_.size(); i++) {
      output.writeMessage(1, carts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < carts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, carts_.get(i));
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
    if (!(obj instanceof com.leo.microservice.protobuf.CartsResponse)) {
      return super.equals(obj);
    }
    com.leo.microservice.protobuf.CartsResponse other = (com.leo.microservice.protobuf.CartsResponse) obj;

    if (!getCartsList()
        .equals(other.getCartsList())) return false;
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
    if (getCartsCount() > 0) {
      hash = (37 * hash) + CARTS_FIELD_NUMBER;
      hash = (53 * hash) + getCartsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leo.microservice.protobuf.CartsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leo.microservice.protobuf.CartsResponse parseFrom(
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
  public static Builder newBuilder(com.leo.microservice.protobuf.CartsResponse prototype) {
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
   * Protobuf type {@code com.leo.microservice.cartservice.proto.CartsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.leo.microservice.cartservice.proto.CartsResponse)
      com.leo.microservice.protobuf.CartsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leo.microservice.protobuf.CartsResponse.class, com.leo.microservice.protobuf.CartsResponse.Builder.class);
    }

    // Construct using com.leo.microservice.cartservice.proto.CartsResponse.newBuilder()
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
        getCartsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cartsBuilder_ == null) {
        carts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        cartsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartsResponse_descriptor;
    }

    @java.lang.Override
    public com.leo.microservice.protobuf.CartsResponse getDefaultInstanceForType() {
      return com.leo.microservice.protobuf.CartsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.leo.microservice.protobuf.CartsResponse build() {
      com.leo.microservice.protobuf.CartsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.leo.microservice.protobuf.CartsResponse buildPartial() {
      com.leo.microservice.protobuf.CartsResponse result = new com.leo.microservice.protobuf.CartsResponse(this);
      int from_bitField0_ = bitField0_;
      if (cartsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          carts_ = java.util.Collections.unmodifiableList(carts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.carts_ = carts_;
      } else {
        result.carts_ = cartsBuilder_.build();
      }
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
      if (other instanceof com.leo.microservice.protobuf.CartsResponse) {
        return mergeFrom((com.leo.microservice.protobuf.CartsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leo.microservice.protobuf.CartsResponse other) {
      if (other == com.leo.microservice.protobuf.CartsResponse.getDefaultInstance()) return this;
      if (cartsBuilder_ == null) {
        if (!other.carts_.isEmpty()) {
          if (carts_.isEmpty()) {
            carts_ = other.carts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCartsIsMutable();
            carts_.addAll(other.carts_);
          }
          onChanged();
        }
      } else {
        if (!other.carts_.isEmpty()) {
          if (cartsBuilder_.isEmpty()) {
            cartsBuilder_.dispose();
            cartsBuilder_ = null;
            carts_ = other.carts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cartsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCartsFieldBuilder() : null;
          } else {
            cartsBuilder_.addAllMessages(other.carts_);
          }
        }
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
      com.leo.microservice.protobuf.CartsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.leo.microservice.protobuf.CartsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.leo.microservice.protobuf.CartResponse> carts_ =
      java.util.Collections.emptyList();
    private void ensureCartsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        carts_ = new java.util.ArrayList<com.leo.microservice.protobuf.CartResponse>(carts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.leo.microservice.protobuf.CartResponse, com.leo.microservice.protobuf.CartResponse.Builder, com.leo.microservice.protobuf.CartResponseOrBuilder> cartsBuilder_;

    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public java.util.List<com.leo.microservice.protobuf.CartResponse> getCartsList() {
      if (cartsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(carts_);
      } else {
        return cartsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public int getCartsCount() {
      if (cartsBuilder_ == null) {
        return carts_.size();
      } else {
        return cartsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public com.leo.microservice.protobuf.CartResponse getCarts(int index) {
      if (cartsBuilder_ == null) {
        return carts_.get(index);
      } else {
        return cartsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder setCarts(
        int index, com.leo.microservice.protobuf.CartResponse value) {
      if (cartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCartsIsMutable();
        carts_.set(index, value);
        onChanged();
      } else {
        cartsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder setCarts(
        int index, com.leo.microservice.protobuf.CartResponse.Builder builderForValue) {
      if (cartsBuilder_ == null) {
        ensureCartsIsMutable();
        carts_.set(index, builderForValue.build());
        onChanged();
      } else {
        cartsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder addCarts(com.leo.microservice.protobuf.CartResponse value) {
      if (cartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCartsIsMutable();
        carts_.add(value);
        onChanged();
      } else {
        cartsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder addCarts(
        int index, com.leo.microservice.protobuf.CartResponse value) {
      if (cartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCartsIsMutable();
        carts_.add(index, value);
        onChanged();
      } else {
        cartsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder addCarts(
        com.leo.microservice.protobuf.CartResponse.Builder builderForValue) {
      if (cartsBuilder_ == null) {
        ensureCartsIsMutable();
        carts_.add(builderForValue.build());
        onChanged();
      } else {
        cartsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder addCarts(
        int index, com.leo.microservice.protobuf.CartResponse.Builder builderForValue) {
      if (cartsBuilder_ == null) {
        ensureCartsIsMutable();
        carts_.add(index, builderForValue.build());
        onChanged();
      } else {
        cartsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder addAllCarts(
        java.lang.Iterable<? extends com.leo.microservice.protobuf.CartResponse> values) {
      if (cartsBuilder_ == null) {
        ensureCartsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, carts_);
        onChanged();
      } else {
        cartsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder clearCarts() {
      if (cartsBuilder_ == null) {
        carts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cartsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public Builder removeCarts(int index) {
      if (cartsBuilder_ == null) {
        ensureCartsIsMutable();
        carts_.remove(index);
        onChanged();
      } else {
        cartsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public com.leo.microservice.protobuf.CartResponse.Builder getCartsBuilder(
        int index) {
      return getCartsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public com.leo.microservice.protobuf.CartResponseOrBuilder getCartsOrBuilder(
        int index) {
      if (cartsBuilder_ == null) {
        return carts_.get(index);  } else {
        return cartsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public java.util.List<? extends com.leo.microservice.protobuf.CartResponseOrBuilder> 
         getCartsOrBuilderList() {
      if (cartsBuilder_ != null) {
        return cartsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(carts_);
      }
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public com.leo.microservice.protobuf.CartResponse.Builder addCartsBuilder() {
      return getCartsFieldBuilder().addBuilder(
          com.leo.microservice.protobuf.CartResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public com.leo.microservice.protobuf.CartResponse.Builder addCartsBuilder(
        int index) {
      return getCartsFieldBuilder().addBuilder(
          index, com.leo.microservice.protobuf.CartResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .com.leo.microservice.cartservice.proto.CartResponse carts = 1;</code>
     */
    public java.util.List<com.leo.microservice.protobuf.CartResponse.Builder> 
         getCartsBuilderList() {
      return getCartsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.leo.microservice.protobuf.CartResponse, com.leo.microservice.protobuf.CartResponse.Builder, com.leo.microservice.protobuf.CartResponseOrBuilder> 
        getCartsFieldBuilder() {
      if (cartsBuilder_ == null) {
        cartsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.leo.microservice.protobuf.CartResponse, com.leo.microservice.protobuf.CartResponse.Builder, com.leo.microservice.protobuf.CartResponseOrBuilder>(
                carts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        carts_ = null;
      }
      return cartsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.leo.microservice.cartservice.proto.CartsResponse)
  }

  // @@protoc_insertion_point(class_scope:com.leo.microservice.cartservice.proto.CartsResponse)
  private static final com.leo.microservice.protobuf.CartsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leo.microservice.protobuf.CartsResponse();
  }

  public static com.leo.microservice.protobuf.CartsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CartsResponse>
      PARSER = new com.google.protobuf.AbstractParser<CartsResponse>() {
    @java.lang.Override
    public CartsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CartsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CartsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CartsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.leo.microservice.protobuf.CartsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

