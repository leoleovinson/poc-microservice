// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.leo.microservices.cartgatewayservice.protobuf;

public final class Schema {
  private Schema() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_leo_microservice_cartservice_proto_CartsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_leo_microservice_cartservice_proto_CartsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_leo_microservice_cartservice_proto_CartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_leo_microservice_cartservice_proto_CartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_leo_microservice_cartservice_proto_CartsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_leo_microservice_cartservice_proto_CartsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_leo_microservice_cartservice_proto_CartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_leo_microservice_cartservice_proto_CartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014schema.proto\022&com.leo.microservice.car" +
      "tservice.proto\"\016\n\014CartsRequest\"B\n\013CartRe" +
      "quest\022\016\n\006cartId\030\001 \001(\003\022\021\n\tproductId\030\002 \001(\003" +
      "\022\020\n\010quantity\030\003 \001(\005\"T\n\rCartsResponse\022C\n\005c" +
      "arts\030\001 \003(\01324.com.leo.microservice.cartse" +
      "rvice.proto.CartResponse\"\203\001\n\014CartRespons" +
      "e\022\016\n\006cartId\030\001 \001(\003\022\026\n\016cartTotalPrice\030\002 \001(" +
      "\001\022K\n\tcartItems\030\003 \003(\01328.com.leo.microserv" +
      "ice.cartservice.proto.CartItemResponse\"\215" +
      "\001\n\020CartItemResponse\022\022\n\ncartItemId\030\001 \001(\003\022" +
      "\020\n\010quantity\030\002 \001(\005\022\021\n\tproductId\030\003 \001(\003\022\016\n\006" +
      "cartId\030\004 \001(\003\022\024\n\014productPrice\030\005 \001(\001\022\032\n\022ca" +
      "rtItemTotalPrice\030\006 \001(\0012\374\004\n\013CartService\022y" +
      "\n\010getCarts\0224.com.leo.microservice.cartse" +
      "rvice.proto.CartsRequest\0325.com.leo.micro" +
      "service.cartservice.proto.CartsResponse\"" +
      "\000\022y\n\ncreateCart\0223.com.leo.microservice.c" +
      "artservice.proto.CartRequest\0324.com.leo.m" +
      "icroservice.cartservice.proto.CartRespon" +
      "se\"\000\022z\n\013getCartById\0223.com.leo.microservi" +
      "ce.cartservice.proto.CartRequest\0324.com.l" +
      "eo.microservice.cartservice.proto.CartRe" +
      "sponse\"\000\022|\n\raddItemToCart\0223.com.leo.micr" +
      "oservice.cartservice.proto.CartRequest\0324" +
      ".com.leo.microservice.cartservice.proto." +
      "CartResponse\"\000\022}\n\016deleteFromCart\0223.com.l" +
      "eo.microservice.cartservice.proto.CartRe" +
      "quest\0324.com.leo.microservice.cartservice" +
      ".proto.CartResponse\"\000B*\n&com.leo.microse" +
      "rvice.cartservice.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_leo_microservice_cartservice_proto_CartsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_leo_microservice_cartservice_proto_CartsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_leo_microservice_cartservice_proto_CartsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_leo_microservice_cartservice_proto_CartRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_leo_microservice_cartservice_proto_CartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_leo_microservice_cartservice_proto_CartRequest_descriptor,
        new java.lang.String[] { "CartId", "ProductId", "Quantity", });
    internal_static_com_leo_microservice_cartservice_proto_CartsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_leo_microservice_cartservice_proto_CartsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_leo_microservice_cartservice_proto_CartsResponse_descriptor,
        new java.lang.String[] { "Carts", });
    internal_static_com_leo_microservice_cartservice_proto_CartResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_leo_microservice_cartservice_proto_CartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_leo_microservice_cartservice_proto_CartResponse_descriptor,
        new java.lang.String[] { "CartId", "CartTotalPrice", "CartItems", });
    internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_leo_microservice_cartservice_proto_CartItemResponse_descriptor,
        new java.lang.String[] { "CartItemId", "Quantity", "ProductId", "CartId", "ProductPrice", "CartItemTotalPrice", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
