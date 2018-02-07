package com.niit.Dao;

import java.util.List;

import com.niit.Model.Supplier;

public interface SupplierDao {
	
	public void  insertSupplier(Supplier supplier );
    List<Supplier> getAllSupplier( );
	public Supplier  getSupplier(int sid );
	public void  updateSupplier(Supplier supplier );
	public void  deleteSupplier(Supplier supplier );

}
