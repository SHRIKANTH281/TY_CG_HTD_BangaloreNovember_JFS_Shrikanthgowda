package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class TestManyToOne {
public static void main(String[] args) {
	EmployeeInfo info=new EmployeeInfo();
	info.setEid(12);
	info.setEmail("amit@gmail.com");
	info.setName("amit");
	info.setPassword("a134");
	EmployeeExperience exp= new EmployeeExperience();
	exp.setExpId(11);
	exp.setCname("capgemini");
	exp.setNoOfYear(2);
	exp.setEmployee(info);
	EmployeeExperience exp1= new EmployeeExperience();
	exp1.setExpId(12);
	exp1.setCname("infosys");
	exp1.setNoOfYear(2);
	exp1.setEmployee(info);
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(exp);
		entityManager.persist(exp1);
		System.out.println("record saved");
		transaction.commit();
	}catch (Exception e) {
		e.printStackTrace();
	}
	entityManager.close();
}
}
