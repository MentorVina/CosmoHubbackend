package com.niit.Dao;

import java.util.List;

import com.niit.Model.Cart;

public interface CartDao {

	public void insertCart(Cart cart);
	public List<Cart> findCartById(String userId);
	public Cart getCartById(int cartId,String userEmail);
	public void deleteCart(int cartId);
	public void update (Cart cr);
}
