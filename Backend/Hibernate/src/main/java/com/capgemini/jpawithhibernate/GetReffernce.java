package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class GetReffernce {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager= null;
	EntityTransaction transaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		Movie record=entityManager.getReference(Movie.class, 101);
		//Movie record=entityManager.find(Movie.class, 111);
		System.out.println(record.getClass());
		System.out.println("Id------"+record.getMid());
		System.out.println("name-----"+record.getMname());
		System.out.println("raing----"+record.getRating());
		entityManager.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
