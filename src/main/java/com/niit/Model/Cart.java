package com.niit.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;
@SuppressWarnings("unused")
@Entity
@Component
public class Cart implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	private int cartProductID;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userMailed")
	private User cartUserDetails;
	private double cartPrice;
	private int cartQuantity;
	private String cartImages;
	private String cartProductName;
	
	public Cart()
	{
		
	}
	public int getCartId() {
		return cartId;
	}
	public int getCartProductID() {
		return cartProductID;
	}
	public User getCartUserDetails() {
		return cartUserDetails;
	}
	public double getCartPrice() {
		return cartPrice;
	}
	public int getCartQuantity() {
		return cartQuantity;
	}
	public String getCartImages() {
		return cartImages;
	}
	public String getCartProductName() {
		return cartProductName;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public void setCartProductID(int cartProductID) {
		this.cartProductID = cartProductID;
	}
	public void setCartUserDetails(User cartUserDetails) {
		this.cartUserDetails = cartUserDetails;
	}
	public void setCartPrice(double cartPrice) {
		this.cartPrice = cartPrice;
	}
	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}
	public void setCartImages(String cartImages) {
		this.cartImages = cartImages;
	}
	public void setCartProductName(String cartProductName) {
		this.cartProductName = cartProductName;
	}
	public Cart(int cartId,int cartProductID,User cartUserDetails, Double cartPrice,int cartQuantity)
	{
		this.cartId=cartId;
		this.cartProductID=cartProductID;
		this.cartUserDetails=cartUserDetails;
		this.cartPrice=cartPrice;
		this.cartQuantity=cartQuantity;
	}
	
	


}
