package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		//String jpql="delete from Movie where mid=101";
		String jpql="delete from Movie where mid=:id";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("id", 106);
		
		int count=query.executeUpdate();
		if(count>0) {
			System.out.println("Deleted Successfully");
		}else {
			System.out.println("Something went wrong");
		}
		transaction.commit();
		
	} catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	entityManager.close();
}
}
