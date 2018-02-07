package com.niit.cosmobackendtest;

import org.junit.BeforeClass;
import org.junit.Test;


import com.niit.Dao.UserDao;

import com.niit.DaoImpl.UserDaoImpl;
import com.niit.Model.User;
import com.niit.config.HibernateConfig;

public class TestUserInsert {

	
	private static HibernateConfig config;
	private static UserDao userDao;
	
	@BeforeClass
	public static void setUp(){
		config = new HibernateConfig();
		userDao = new UserDaoImpl(config.getSessionFac(config.getH2Data()));
	}
	
	@Test
	public void testInsertUser(){
		User user  = new User();
		user.setFname("vina");
		user.setLname("Masram");
		user.setEmail("vina@gmail.com");
		user.setContact("5689512364");
		user.setDob("9/11/1992");
		user.setAddr("Nagpur");
		user.setPass("1234");
		user.setRole("user");
		user.setEnabled(true);
		
		
		userDao.insertUser(user);
	}
	
}
