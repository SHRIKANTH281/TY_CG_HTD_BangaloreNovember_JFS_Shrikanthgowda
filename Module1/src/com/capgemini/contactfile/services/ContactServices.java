package com.capgemini.contactfile.services;

import java.util.List;

import com.capgemini.contactfile.bean.ContactBean;

public interface ContactServices {
	public List<ContactBean> showAllContact();
	 public List<ContactBean> search(String name);
	 public boolean addContact(ContactBean c);
	 public boolean deleteContact(String name);
	 public boolean editContact(String name,long number);
}
