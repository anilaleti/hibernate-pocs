package com.flipkart.products.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.flipkart.products.entity.Product;
import com.flipkart.products.utils.HibernateUtil;

public class ProductMain {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
  
		Product product = new Product();
		product.setId(100);
		product.setName("keyboards");
		product.setQty(6);
		session.save(product);
		transaction.commit();

	}

}
