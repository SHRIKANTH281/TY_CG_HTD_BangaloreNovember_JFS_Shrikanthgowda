package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		//String jpql="update Movie set mname='googly' where mname='ABCD 2'";
		String jpql="update Movie set mname=:name where id=:id";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("id", 102);
		query.setParameter("name", "KGF");
		int count=query.executeUpdate();
		if(count>0) {
			System.out.println("Updated successfully");	
		}else {
			System.out.println("something went wrong");
		}
		transaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	entityManager.close();
}
}
