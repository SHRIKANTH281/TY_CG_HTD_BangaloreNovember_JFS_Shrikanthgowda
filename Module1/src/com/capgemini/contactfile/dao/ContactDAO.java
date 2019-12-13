package com.capgemini.contactfile.dao;

import java.util.List;

import com.capgemini.contactfile.bean.ContactBean;

public interface ContactDAO {
 public List<ContactBean> showAllContact();
 public List<ContactBean> search(String name);
 public boolean addContact(ContactBean c);
 public boolean deleteContact(String name);
 public boolean editContact(String name,long number);
}
