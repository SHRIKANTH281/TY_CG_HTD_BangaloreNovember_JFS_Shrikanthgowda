package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertEmployee {
	public static void main(String[] args) {
		EmployeeInfo emp= new EmployeeInfo();
		emp.setEid(3);
		emp.setName("ramm");
		emp.setEmail("ram@gmail");
		emp.setPassword("s123");
		EmployeeOtherInfo other= new EmployeeOtherInfo();
		other.setId(11);
		other.setPcard("AB123");
		other.setFname("vishnu");
		other.setMname("laxmi");
		other.setEmployee(emp);
EntityManagerFactory entityManagerFactory=null;
EntityManager entityManager=null;
EntityTransaction transaction=null;
try {
	
    entityManagerFactory=Persistence.createEntityManagerFactory("Test");
    entityManager=entityManagerFactory.createEntityManager();
    transaction=entityManager.getTransaction();
    transaction.begin();
    entityManager.persist(other);
    System.out.println("record added");
    transaction.commit();
	
} catch (Exception e) {
	e.printStackTrace();
	transaction.rollback();
}
entityManager.close();	
}
}
