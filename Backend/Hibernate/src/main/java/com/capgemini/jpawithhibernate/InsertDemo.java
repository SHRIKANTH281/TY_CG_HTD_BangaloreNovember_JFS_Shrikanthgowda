package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;
import com.capgemini.jpawithhibernate.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {
		Product product=new Product();
		product.setPid(101);
		product.setPname("salt");

		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(product);
			System.out.println("record saved");
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}
}