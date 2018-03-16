package com.niit.Dao;


import java.util.List;

import com.niit.Model.Cart;

public interface CartDao {

	public void insertCart(Cart cart);
    public List<Cart> findCartById(String email);
    public Cart getCartById(String email,int cartId);
    public void deleteCart(Cart cart);
    //public void updateCart(Cart cart);
    //public void updateCartById(int cartId,Cart cart) ;
}
