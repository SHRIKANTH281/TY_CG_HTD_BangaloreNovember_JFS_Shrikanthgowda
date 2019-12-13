package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class BidirectionalTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			EmployeeInfo info=entityManager.find(EmployeeInfo.class,12 );
			//System.out.println(info.getExp().get(12);
			System.out.println("record saved");
		}catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}
}
