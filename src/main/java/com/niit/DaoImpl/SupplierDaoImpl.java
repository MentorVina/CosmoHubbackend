package com.niit.DaoImpl;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.SupplierDao;

import com.niit.Model.Supplier;


@Repository
@Service
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public SupplierDaoImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	public   SupplierDaoImpl() {
		System.out.println("Supplier dao successfully created");
		}

	@Transactional
	public void insertSupplier(Supplier supplier) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(supplier);
		session.getTransaction().commit();
		session.close();
	}

	@Transactional
	public void updateSupplier(Supplier supplier) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(supplier);
		session.getTransaction().commit();
		session.close();
	}

	@Transactional
	public void deleteSupplier(Supplier supplier) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(supplier);
		session.getTransaction().commit();
	}
	
	@Transactional
	public List<Supplier> getAllSupplier(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query<Supplier> query = session.createQuery("FROM Supplier");
		List<Supplier> supplierList = query.list();
		session.getTransaction().commit();
		return supplierList;
	}

	@Transactional
	public Supplier getSupplier(int sid) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Supplier supplier = session.get(Supplier.class, sid);
		session.getTransaction().commit();
		return supplier;
	}



}
