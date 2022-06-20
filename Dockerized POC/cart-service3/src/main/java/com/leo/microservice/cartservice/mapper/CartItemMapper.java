package com.leo.microservice.cartservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.leo.microservice.cartservice.entity.Cart;
import com.leo.microservice.cartservice.entity.CartItem;

@Mapper
@Component
public interface CartItemMapper {

	@Insert("INSERT INTO cart_item (product_id, quantity, cart_id, product_price, cart_item_total_price, date_created) "
			+ "values (#{productId}, #{quantity}, #{cartId}, #{productPrice}, #{cartItemTotalPrice}, #{dateCreated})")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "cartItemId", before = false, resultType = Long.class)
	int insert(CartItem cartItem);

	@Select("SELECT * FROM cart_item WHERE cart_id=#{cartId}")
	List<CartItem> findCartItemsById(Long cartId);
	
	@Delete("DELETE FROM cart_item WHERE cart_id=#{cartId} AND product_id=#{productId}")
	int deleteCartItem(CartItem cartItem);

	@Update("UPDATE cart_item SET quantity=#{quantity}, cart_item_total_price=#{cartItemTotalPrice} WHERE cart_item_id=#{cartItemId}")
	int updateCartItem(CartItem cartItem);

}
