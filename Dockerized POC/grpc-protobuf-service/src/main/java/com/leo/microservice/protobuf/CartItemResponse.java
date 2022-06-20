// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.leo.microservice.protobuf;

/**
 * Protobuf type {@code com.leo.microservice.cartservice.proto.CartItemResponse}
 */
public final class CartItemResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.leo.microservice.cartservice.proto.CartItemResponse)
    CartItemResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CartItemResponse.newBuilder() to construct.
  private CartItemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CartItemResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CartItemResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CartItemResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            cartItemId_ = input.readInt64();
            break;
          }
          case 16: {

            quantity_ = input.readInt32();
            break;
          }
          case 24: {

            productId_ = input.readInt64();
            break;
          }
          case 32: {

            cartId_ = input.readInt64();
            break;
          }
          case 41: {

            productPrice_ = input.readDouble();
            break;
          }
          case 49: {

            cartItemTotalPrice_ = input.readDouble();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.leo.microservice.protobuf.CartItemResponse.class, com.leo.microservice.protobuf.CartItemResponse.Builder.class);
  }

  public static final int CARTITEMID_FIELD_NUMBER = 1;
  private long cartItemId_;
  /**
   * <code>int64 cartItemId = 1;</code>
   * @return The cartItemId.
   */
  @java.lang.Override
  public long getCartItemId() {
    return cartItemId_;
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private int quantity_;
  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
  }

  public static final int PRODUCTID_FIELD_NUMBER = 3;
  private long productId_;
  /**
   * <code>int64 productId = 3;</code>
   * @return The productId.
   */
  @java.lang.Override
  public long getProductId() {
    return productId_;
  }

  public static final int CARTID_FIELD_NUMBER = 4;
  private long cartId_;
  /**
   * <code>int64 cartId = 4;</code>
   * @return The cartId.
   */
  @java.lang.Override
  public long getCartId() {
    return cartId_;
  }

  public static final int PRODUCTPRICE_FIELD_NUMBER = 5;
  private double productPrice_;
  /**
   * <code>double productPrice = 5;</code>
   * @return The productPrice.
   */
  @java.lang.Override
  public double getProductPrice() {
    return productPrice_;
  }

  public static final int CARTITEMTOTALPRICE_FIELD_NUMBER = 6;
  private double cartItemTotalPrice_;
  /**
   * <code>double cartItemTotalPrice = 6;</code>
   * @return The cartItemTotalPrice.
   */
  @java.lang.Override
  public double getCartItemTotalPrice() {
    return cartItemTotalPrice_;
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
    if (cartItemId_ != 0L) {
      output.writeInt64(1, cartItemId_);
    }
    if (quantity_ != 0) {
      output.writeInt32(2, quantity_);
    }
    if (productId_ != 0L) {
      output.writeInt64(3, productId_);
    }
    if (cartId_ != 0L) {
      output.writeInt64(4, cartId_);
    }
    if (java.lang.Double.doubleToRawLongBits(productPrice_) != 0) {
      output.writeDouble(5, productPrice_);
    }
    if (java.lang.Double.doubleToRawLongBits(cartItemTotalPrice_) != 0) {
      output.writeDouble(6, cartItemTotalPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cartItemId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, cartItemId_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, quantity_);
    }
    if (productId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, productId_);
    }
    if (cartId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, cartId_);
    }
    if (java.lang.Double.doubleToRawLongBits(productPrice_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, productPrice_);
    }
    if (java.lang.Double.doubleToRawLongBits(cartItemTotalPrice_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, cartItemTotalPrice_);
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
    if (!(obj instanceof com.leo.microservice.protobuf.CartItemResponse)) {
      return super.equals(obj);
    }
    com.leo.microservice.protobuf.CartItemResponse other = (com.leo.microservice.protobuf.CartItemResponse) obj;

    if (getCartItemId()
        != other.getCartItemId()) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
    if (getProductId()
        != other.getProductId()) return false;
    if (getCartId()
        != other.getCartId()) return false;
    if (java.lang.Double.doubleToLongBits(getProductPrice())
        != java.lang.Double.doubleToLongBits(
            other.getProductPrice())) return false;
    if (java.lang.Double.doubleToLongBits(getCartItemTotalPrice())
        != java.lang.Double.doubleToLongBits(
            other.getCartItemTotalPrice())) return false;
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
    hash = (37 * hash) + CARTITEMID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCartItemId());
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProductId());
    hash = (37 * hash) + CARTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCartId());
    hash = (37 * hash) + PRODUCTPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getProductPrice()));
    hash = (37 * hash) + CARTITEMTOTALPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCartItemTotalPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.leo.microservice.protobuf.CartItemResponse parseFrom(
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
  public static Builder newBuilder(com.leo.microservice.protobuf.CartItemResponse prototype) {
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
   * Protobuf type {@code com.leo.microservice.cartservice.proto.CartItemResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.leo.microservice.cartservice.proto.CartItemResponse)
      com.leo.microservice.protobuf.CartItemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.leo.microservice.protobuf.CartItemResponse.class, com.leo.microservice.protobuf.CartItemResponse.Builder.class);
    }

    // Construct using com.leo.microservice.cartservice.proto.CartItemResponse.newBuilder()
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
      cartItemId_ = 0L;

      quantity_ = 0;

      productId_ = 0L;

      cartId_ = 0L;

      productPrice_ = 0D;

      cartItemTotalPrice_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.leo.microservice.protobuf.Schema.internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_descriptor;
    }

    @java.lang.Override
    public com.leo.microservice.protobuf.CartItemResponse getDefaultInstanceForType() {
      return com.leo.microservice.protobuf.CartItemResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.leo.microservice.protobuf.CartItemResponse build() {
      com.leo.microservice.protobuf.CartItemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.leo.microservice.protobuf.CartItemResponse buildPartial() {
      com.leo.microservice.protobuf.CartItemResponse result = new com.leo.microservice.protobuf.CartItemResponse(this);
      result.cartItemId_ = cartItemId_;
      result.quantity_ = quantity_;
      result.productId_ = productId_;
      result.cartId_ = cartId_;
      result.productPrice_ = productPrice_;
      result.cartItemTotalPrice_ = cartItemTotalPrice_;
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
      if (other instanceof com.leo.microservice.protobuf.CartItemResponse) {
        return mergeFrom((com.leo.microservice.protobuf.CartItemResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.leo.microservice.protobuf.CartItemResponse other) {
      if (other == com.leo.microservice.protobuf.CartItemResponse.getDefaultInstance()) return this;
      if (other.getCartItemId() != 0L) {
        setCartItemId(other.getCartItemId());
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
      }
      if (other.getProductId() != 0L) {
        setProductId(other.getProductId());
      }
      if (other.getCartId() != 0L) {
        setCartId(other.getCartId());
      }
      if (other.getProductPrice() != 0D) {
        setProductPrice(other.getProductPrice());
      }
      if (other.getCartItemTotalPrice() != 0D) {
        setCartItemTotalPrice(other.getCartItemTotalPrice());
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
      com.leo.microservice.protobuf.CartItemResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.leo.microservice.protobuf.CartItemResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long cartItemId_ ;
    /**
     * <code>int64 cartItemId = 1;</code>
     * @return The cartItemId.
     */
    @java.lang.Override
    public long getCartItemId() {
      return cartItemId_;
    }
    /**
     * <code>int64 cartItemId = 1;</code>
     * @param value The cartItemId to set.
     * @return This builder for chaining.
     */
    public Builder setCartItemId(long value) {
      
      cartItemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cartItemId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCartItemId() {
      
      cartItemId_ = 0L;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 2;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0;
      onChanged();
      return this;
    }

    private long productId_ ;
    /**
     * <code>int64 productId = 3;</code>
     * @return The productId.
     */
    @java.lang.Override
    public long getProductId() {
      return productId_;
    }
    /**
     * <code>int64 productId = 3;</code>
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(long value) {
      
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 productId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductId() {
      
      productId_ = 0L;
      onChanged();
      return this;
    }

    private long cartId_ ;
    /**
     * <code>int64 cartId = 4;</code>
     * @return The cartId.
     */
    @java.lang.Override
    public long getCartId() {
      return cartId_;
    }
    /**
     * <code>int64 cartId = 4;</code>
     * @param value The cartId to set.
     * @return This builder for chaining.
     */
    public Builder setCartId(long value) {
      
      cartId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cartId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCartId() {
      
      cartId_ = 0L;
      onChanged();
      return this;
    }

    private double productPrice_ ;
    /**
     * <code>double productPrice = 5;</code>
     * @return The productPrice.
     */
    @java.lang.Override
    public double getProductPrice() {
      return productPrice_;
    }
    /**
     * <code>double productPrice = 5;</code>
     * @param value The productPrice to set.
     * @return This builder for chaining.
     */
    public Builder setProductPrice(double value) {
      
      productPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double productPrice = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductPrice() {
      
      productPrice_ = 0D;
      onChanged();
      return this;
    }

    private double cartItemTotalPrice_ ;
    /**
     * <code>double cartItemTotalPrice = 6;</code>
     * @return The cartItemTotalPrice.
     */
    @java.lang.Override
    public double getCartItemTotalPrice() {
      return cartItemTotalPrice_;
    }
    /**
     * <code>double cartItemTotalPrice = 6;</code>
     * @param value The cartItemTotalPrice to set.
     * @return This builder for chaining.
     */
    public Builder setCartItemTotalPrice(double value) {
      
      cartItemTotalPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double cartItemTotalPrice = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCartItemTotalPrice() {
      
      cartItemTotalPrice_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:com.leo.microservice.cartservice.proto.CartItemResponse)
  }

  // @@protoc_insertion_point(class_scope:com.leo.microservice.cartservice.proto.CartItemResponse)
  private static final com.leo.microservice.protobuf.CartItemResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.leo.microservice.protobuf.CartItemResponse();
  }

  public static com.leo.microservice.protobuf.CartItemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CartItemResponse>
      PARSER = new com.google.protobuf.AbstractParser<CartItemResponse>() {
    @java.lang.Override
    public CartItemResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CartItemResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CartItemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CartItemResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.leo.microservice.protobuf.CartItemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

