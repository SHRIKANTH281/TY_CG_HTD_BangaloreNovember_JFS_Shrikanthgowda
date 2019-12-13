package com.capgemini.contactfile.factory;

import com.capgemini.contactfile.dao.ContactDAO;
import com.capgemini.contactfile.dao.ContactDaoImpl;
import com.capgemini.contactfile.services.ContactServices;
import com.capgemini.contactfile.services.ContactServicesImpl;

public class ContactFactory {
	public static ContactDAO instanceOfContactDaoImpl() {
		 ContactDAO dao= new ContactDaoImpl();
		 return dao;
	 }
	 public static ContactServices insatnceOfContactServices() {
		 ContactServices services= new ContactServicesImpl();
		 return services;
	 }
}
