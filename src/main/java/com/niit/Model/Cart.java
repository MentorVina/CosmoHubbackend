package com.niit.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;


@Component
@Entity
public class Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	private int cartProductID;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="email")
	private User userEmail;
	private double cartPrice;
	private int cartQuantity;
	private String cartImages;
	private String cartProductName;
	public int getCartId() {
		return cartId;
	}
	public int getCartProductID() {
		return cartProductID;
	}
	public User getUserEmail() {
		return userEmail;
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
	public void setUserEmail(User userEmail) {
		this.userEmail = userEmail;
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
	
	
	
}
