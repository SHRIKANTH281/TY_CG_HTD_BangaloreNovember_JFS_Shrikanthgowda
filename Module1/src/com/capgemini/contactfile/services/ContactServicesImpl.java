package com.capgemini.contactfile.services;

import java.util.List;

import com.capgemini.contactfile.bean.ContactBean;
import com.capgemini.contactfile.dao.ContactDAO;
import com.capgemini.contactfile.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices {
	ContactDAO dao=ContactFactory.instanceOfContactDaoImpl();

	@Override
	public List<ContactBean> showAllContact() {
		return dao.showAllContact();
	}

	@Override
	public List<ContactBean> search(String name) {
		return dao.search(name);
	}

	

	@Override
	public boolean addContact(ContactBean c) {
		return dao.addContact(c);
	}

	@Override
	public boolean deleteContact(String name) {
		return dao.deleteContact(name);
	}


	@Override
	public boolean editContact(String name, long number) {
		return dao.editContact(name, number);
	}

}
