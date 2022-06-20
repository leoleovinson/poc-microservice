package com.leo.microservice.productservice.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.leo.microservice.productservice.entity.Product;

@Repository
@Transactional
public class ProductHibernateRepository {
	
	@Autowired
	private SessionFactory factory;
	
	private Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}
		return session;
	}
	
	// Create CriteriaBuilder
//	CriteriaBuilder builder = getSession().getCriteriaBuilder();

	// Create CriteriaQuery
//	CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
	
	
	public Product saveProduct(Product product) {
		Long id = (Long) getSession().save(product);
		return getSession().get(Product.class, id);
	}
	
	public List<Product> getProducts(){
		Query<Product> query = getSession().createQuery("from Product", Product.class);
		return query.getResultList();
	}
	
	public Product findProductById(Long id) {
		return getSession().get(Product.class, id);
	}
	
	public Product updateProduct(Product product) {
		getSession().update(product);
		return getSession().get(Product.class, product.getProductId());
	}
	
	public Product findProductByName(String name) {
		Query<Product> query = getSession().createQuery("from Product where productName=:name", Product.class);
		query.setParameter("name", name);
		return query.uniqueResult();
	}
	
	
	
	

}
