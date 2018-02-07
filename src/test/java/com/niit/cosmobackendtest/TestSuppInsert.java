package com.niit.cosmobackendtest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.Dao.SupplierDao;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.Model.Supplier;
import com.niit.config.HibernateConfig;

public class TestSuppInsert {
	private static HibernateConfig config;
	private static SupplierDao supplierDao;
	
	@BeforeClass
	public static void setUp(){
		config = new HibernateConfig();
		supplierDao = new SupplierDaoImpl(config.getSessionFac(config.getH2Data()));
	}
	
	@Test
	public void testInsertSupplier(){
		Supplier supplier  = new Supplier();
		supplier.setSid(1);
		supplier.setSname("xyz");
		supplierDao.insertSupplier(supplier);
	}

}
