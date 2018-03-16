package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.CategoryDao;
import com.niit.Model.Category;

@Repository
//@Service
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	public CategoryDaoImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
			
	}
	
	public  CategoryDaoImpl()
	{
		System.out.println("Category dao successfully created sucess1");
		}

	
	public void insertCategory(Category category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(category);
		session.getTransaction().commit();

	}

	
	public void updateCategory(Category category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(category);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteCategory(Category category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(category);
		session.getTransaction().commit();
		session.close();
	}

	public Category getCategory(int cid) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Category category = session.get(Category.class, cid);
		return category;
	}

	public List<Category> getAllCategory() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM Category");
		List<Category> categoriesList = query.list();
		return categoriesList;
	}

		
}
