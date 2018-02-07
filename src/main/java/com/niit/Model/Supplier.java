package com.niit.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Supplier {

@Id
private int sid;
private String sname;

@OneToMany(targetEntity=Product.class,fetch=FetchType.EAGER,mappedBy="supplier")
private Set<Product>products=new HashSet<Product>(0);


public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}


}
