package com.niit.cosmobackendtest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.Dao.ProductDao;

import com.niit.DaoImpl.ProductDaoImpl;
import com.niit.Model.Category;
import com.niit.Model.Product;
import com.niit.Model.Supplier;
import com.niit.config.HibernateConfig;

public class TestProdInsert {
	private static HibernateConfig config;
	private static ProductDao productDao;
	
	@BeforeClass
	public static void setUp(){
		config = new HibernateConfig();
		productDao = new ProductDaoImpl(config.getSessionFac(config.getH2Data()));
	}
	
	@Test
	public void testInsertProduct(){
		Product product = new Product();
		product.setPid(1);
		product.setPname("Kurta");
		product.setDescription("Authentic Kurta");
		product.setPrice(3000.50f);
		product.setStock(10);
		
		Category category = new Category();
		category.setCid(1);
		
		product.setCategory(category);
		
		Supplier supplier = new Supplier();
		supplier.setSid(1);
		
		product.setSupplier(supplier);
		product.setImagname("kurta");
		
		productDao.insertProduct(product);
	}
}


