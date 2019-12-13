package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BidirectionalTest {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		//transaction=entityManager.getTransaction();
		//transaction.begin();
		EmployeeInfo info=entityManager.find(EmployeeInfo.class,3 );
		System.out.println(info.getOther().getPcard());
		//System.out.println("record saved");
		//transaction.commit();
	}catch (Exception e) {
		e.printStackTrace();
	}
	entityManager.close();
}
}
