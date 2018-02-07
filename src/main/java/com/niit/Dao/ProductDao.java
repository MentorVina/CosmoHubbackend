package com.niit.Dao;

import java.util.List;

import com.niit.Model.Product;

public interface ProductDao {
	public void  insertProduct(Product product );
    List<Product> getAllProduct( );
	public Product  getProduct(int pid );
	public void  updateProduct(Product product);
	public void  deleteProduct(Product product );

}

