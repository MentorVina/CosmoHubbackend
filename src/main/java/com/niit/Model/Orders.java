package com.niit.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Orders  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@ManyToOne
	@JoinColumn(name="email")
	private User user;
	
	private String payment;
	private Double total;
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public User getUser() {
		return user;
	}
	public String getPayment() {
		return payment;
	}
	public Double getTotal() {
		return total;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public void setTotal(Double total) {
		this.total = total;
	}


}
