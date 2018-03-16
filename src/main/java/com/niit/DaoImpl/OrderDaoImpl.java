package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.Dao.OrderDao;
import com.niit.Model.Cart;
import com.niit.Model.Orders;

@Repository
public class OrderDaoImpl implements OrderDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public OrderDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	public void insertOrder(Orders order) {
	
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(order);
		session.getTransaction().commit();
		
		
	}
	public List<Orders> findOrderById(int orderId) {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from Orders where orderId=:orderId");
		query.setParameter("orderId",orderId);
		
		List<Orders> orderList=query.list();
		return orderList;
	}
	

}
