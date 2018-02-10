
package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.Dao.CategoryDao;
import com.niit.Dao.ProductDao;
import com.niit.Dao.SupplierDao;
import com.niit.Dao.UserDao;
import com.niit.DaoImpl.CategoryDaoImpl;
import com.niit.DaoImpl.ProductDaoImpl;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.DaoImpl.UserDaoImpl;
import com.niit.Model.*;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class HibernateConfig {
	
	@Bean(name = "datasource")

	public DataSource getH2Data() {
		System.out.println("hibernate bean initiated");

		DriverManagerDataSource dsource = new DriverManagerDataSource();
		dsource.setDriverClassName("org.h2.Driver");
		dsource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dsource.setUsername("sa");
		dsource.setPassword("");
		System.out.println("H2 connected");
		return dsource;
	}

	private Properties gethiberProp() {

		Properties p = new Properties();
		p.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		p.put("hibernate.hbm2ddl.auto", "update");
		p.put("hibernate.show_sql", "true");
		System.out.println("Data table created in H2");
		return p;
	}

	// @SuppressWarnings("deprecation")
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFac(DataSource datasource) {
		LocalSessionFactoryBuilder sb = new LocalSessionFactoryBuilder(datasource);
		System.out.println(" Vina User.class");
		sb.addAnnotatedClass(User.class);
		System.out.println("Category.class");

		sb.addAnnotatedClass(Category.class);
		System.out.println("Product");

		sb.addAnnotatedClass(Product.class);
		System.out.println("Supplier.class");

		sb.addAnnotatedClass(Supplier.class);
		sb.addProperties(gethiberProp());

		return sb.buildSessionFactory();

	}
	@Autowired
	@Bean(name = "userDaoImpl")
	public UserDaoImpl getUserData(SessionFactory sf) {
		return new UserDaoImpl(sf);
	}

	@Autowired
	@Bean(name = "categoryDaoImpl")
	public CategoryDaoImpl getCategoryData(SessionFactory sf) {
		return new CategoryDaoImpl(sf);
	}
	@Autowired
	@Bean(name = "supplierDaoImpl")
	public SupplierDaoImpl getSupplierData(SessionFactory sf) {
		return new SupplierDaoImpl(sf);
	}
	@Autowired
	@Bean(name = "productDaoImpl")
	public ProductDaoImpl getProductData(SessionFactory sf) {
		return new ProductDaoImpl(sf);
	}

	@Autowired
	@Bean(name = "transcationManager")
	public HibernateTransactionManager gettrans(SessionFactory sf) {
		HibernateTransactionManager tm = new HibernateTransactionManager(sf);
		return tm;
	}

}