// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.leo.microservice.protobuf;

public interface CartItemResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.leo.microservice.cartservice.proto.CartItemResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 cartItemId = 1;</code>
   * @return The cartItemId.
   */
  long getCartItemId();

  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <code>int64 productId = 3;</code>
   * @return The productId.
   */
  long getProductId();

  /**
   * <code>int64 cartId = 4;</code>
   * @return The cartId.
   */
  long getCartId();

  /**
   * <code>double productPrice = 5;</code>
   * @return The productPrice.
   */
  double getProductPrice();

  /**
   * <code>double cartItemTotalPrice = 6;</code>
   * @return The cartItemTotalPrice.
   */
  double getCartItemTotalPrice();
}
