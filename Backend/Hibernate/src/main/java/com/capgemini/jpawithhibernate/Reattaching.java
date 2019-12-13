package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattaching {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
entityManagerFactory=Persistence.createEntityManagerFactory("Test");
entityManager=entityManagerFactory.createEntityManager();
transaction=entityManager.getTransaction();
transaction.begin();
Movie record=entityManager.find(Movie.class, 101);
System.out.println(entityManager.contains(record));
entityManager.detach(record);
System.out.println(entityManager.contains(record));
Movie reattchMovie=entityManager.merge(record);
reattchMovie.setMname("Dil to bacha hai ji");
System.out.println("record updated");
transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.commit();
		}
	}
}
