package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.UserDao;
import com.niit.Model.Supplier;
import com.niit.Model.User;
import com.niit.config.HibernateConfig;

public class UserDaoImpl implements UserDao {
	private HibernateConfig config;
	 @Autowired
	    SessionFactory sessionFactory;
		@Autowired
		public  UserDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
			
		}
		public   UserDaoImpl() {
			System.out.println("user dao successfully created");
			}
		
		@Transactional
	    @Override

	public  void  insertUser(User user) {
		/*config = new HibernateConfig();

		Session session = config.getSessionFac(config.getH2Data()).openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return true;*/
			Session session =sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();
			
		
		
	}
		@Override
		public List<User> getAllUser( )
		 {
			
		Session session =sessionFactory.openSession();
		Query query=session.createQuery("from User");
		query.list();
		List<User> user=query.list();
		
		return user;
		
		
		}
		@Override
		public User getUser(int  id) {
			Session session =sessionFactory.openSession();
			User user=(User)session.get(User.class, id);
			return user;
			
			
	}
		@Override
		public void updateUser(User user) {
			Session session =sessionFactory.openSession();
			session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
			
			
			
		}

		@Override
		public void deleteUser(User user) {
			Session session =sessionFactory.openSession();
			session.beginTransaction();
			session.delete(user);
			session.getTransaction().commit();
		}

}
