package com.niit.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.Dao.OrderDao;
import com.niit.Model.Order;

public class OrderDaoImpl implements OrderDao{

	@Autowired
	SessionFactory sessionFactory;
	public OrderDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	public void insertOrder(Order order) {
	
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.persist(order);
		session.getTransaction().commit();
		
		
	}
	
	

}
