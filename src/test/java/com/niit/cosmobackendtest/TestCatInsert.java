package com.niit.cosmobackendtest;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.Dao.CategoryDao;
import com.niit.DaoImpl.CategoryDaoImpl;
import com.niit.Model.Category;
import com.niit.config.HibernateConfig;

public class TestCatInsert {
	
	private static HibernateConfig config;
	private static CategoryDao categoryDao;
	
	@BeforeClass
	public static void setUp(){
		config = new HibernateConfig();
		categoryDao = new CategoryDaoImpl(config.getSessionFac(config.getH2Data()));
	}
	
	@Test
	public void testInsertCategory(){
		Category category  = new Category();
		category.setCid(1);
		category.setCname("abcd");
		categoryDao.insertCategory(category);
	}

}
