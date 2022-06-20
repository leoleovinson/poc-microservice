package com.leo.microservice.cartservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.leo.microservice.cartservice.entity.Cart;

@Mapper
@Component
public interface CartMapper {

	@Select("SELECT * FROM carts")
	List<Cart> findAll();
	
	@Insert("INSERT INTO carts (total_price, date_created) values (#{totalPrice}, #{dateCreated})")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "cartId", before = false, resultType = Long.class)
	int insert(Cart cart);

	@Select("SELECT * FROM carts WHERE cart_id=#{cartId}")
	Cart findById(Long cartId);

	@Update("UPDATE carts SET total_price=#{totalPrice} WHERE cart_id=#{cartId}")
	void updateCartTotal(Cart cart);

}
