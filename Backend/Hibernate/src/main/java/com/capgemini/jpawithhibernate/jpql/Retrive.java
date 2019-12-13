package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrive {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityManagerFactory entityManagerFactory=null;
	EntityTransaction transaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		//String jpql="from Movie";
		String jpql="select mname from Movie";
		Query query=entityManager.createQuery(jpql);
		List<String> record=query.getResultList();
		for (String s : record) {
			//System.out.println("Movie Id="+movie.getMid());
			//System.out.println("Movie Name="+movie.getMname());
			//System.out.println("Movie Rating= "+movie.getRating());
			System.out.println("movie name "+s);
			System.out.println("-----------------------------------");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	entityManager.close();
}
}
