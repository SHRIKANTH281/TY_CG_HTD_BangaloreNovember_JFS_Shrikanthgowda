package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class TestManyToMany {
public static void main(String[] args) {
	EmployeeInfo info=new EmployeeInfo();
	info.setEid(20);
	info.setName("kush");
	info.setEmail("kush@gmail.com");
	info.setPassword("k123");
	EmployeeInfo info1=new EmployeeInfo();
	info1.setEid(22);
	info1.setName("kushi");
	info1.setEmail("kushi@gmail.com");
	info1.setPassword("k321");
	ArrayList<EmployeeInfo> aList= new  ArrayList<EmployeeInfo>();
	aList.add(info);
	aList.add(info1);
	TrainingInfo tInfo= new TrainingInfo();
	tInfo.setTid(100);
	tInfo.setTname("Java FS");
	tInfo.setEList(aList);
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(tInfo);
		System.out.println("record saved");
		transaction.commit();
	}catch (Exception e) {
		e.printStackTrace();
	}
	entityManager.close();
}
}
