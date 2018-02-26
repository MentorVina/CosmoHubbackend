package com.niit.Dao;

import java.util.List;

import com.niit.Model.Product;

public interface ProductDao {
	public void  insertProduct(Product product );
    List<Product> getAllProduct( );
    List<Product> getProdCid( int cid);
	public Product  getProduct(int pid );
	public void  updateProduct(Product product);
	public void  deleteProdPid(int  pid);
	

}

