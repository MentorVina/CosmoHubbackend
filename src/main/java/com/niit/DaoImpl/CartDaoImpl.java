
package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.Dao.CartDao;
import com.niit.Model.Cart;
import com.niit.Model.Product;
@Repository
public class CartDaoImpl implements CartDao
{
	@Autowired
	SessionFactory sessionFactory;
	public CartDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	public void insertCart(Cart cart) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(cart);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public List<Cart> findCartById(String email) {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from Cart where email=:email");
		query.setParameter("email",email);
		
		List<Cart> cartList=query.list();
		return cartList;
	}
	@Override
	public Cart getCartById(String email, int cartId) {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from Cart where email=:email and cartId=:cartId");
		query.setParameter("email",email);
		query.setParameter("cartId", cartId);
		Cart cartList= (Cart) query.getSingleResult();
		return cartList;
	}

	public void deleteCart(Cart cart) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(cart);
		session.getTransaction().commit();
		session.close();
		
	}
	public void deleteCartById(int cartId){
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	Cart cart = (Cart)session.get(Cart.class, cartId);
	session.delete(cart);
	session.getTransaction().commit();
	session.close();
	}
	
/*	public void updateCart(Cart cart) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(cart);
		session.getTransaction().commit();
		session.close();
	}
	
	public void updateCartById(int cartId, Cart cart) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//session.saveOrUpdate(cartId, cart);
		session.getTransaction().commit();
		session.close();
		
	}
*/
		
	
}
	


