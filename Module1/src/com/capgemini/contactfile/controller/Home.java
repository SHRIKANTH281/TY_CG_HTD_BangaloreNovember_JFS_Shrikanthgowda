package com.capgemini.contactfile.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.contactfile.bean.ContactBean;
import com.capgemini.contactfile.factory.ContactFactory;
import com.capgemini.contactfile.services.ContactServices;

public class Home {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<ContactBean> list= new ArrayList<ContactBean>();
		ContactServices services=ContactFactory.insatnceOfContactServices();
		ContactBean bean= new ContactBean();
		while(true) {
			System.out.println("Enter the choice");
			System.out.println("-----------------");
			System.out.println("1.List all Name");
			System.out.println("2.Search Contact");
			System.out.println("3.Operation");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:list=services.showAllContact();
			
			if(list != null) {
				for (ContactBean c : list) {
					System.out.println(c);
				}
			}

				break;
			case 2:System.out.println("Enter the Name to Search");
			       bean.setName(sc.next());
			       list=services.search(bean.getName());
			       if(list != null) {
			    	   for (ContactBean contactBean : list) {
						System.out.println(contactBean);
					}
			       }
				
				break;

			case 3:System.out.println("Enter the Choice");
			System.out.println("1.Add Contact");
			System.out.println("2.Delete Contact");
			System.out.println("3.edit Contact");
			int s=sc.nextInt();
			switch (s) {
			case 1:System.out.println("Enter the Name");
			bean.setName(sc.next());
			System.out.println("Enter the Number");
			bean.setNumber(sc.nextLong());
			System.out.println("Enter the Group");
			bean.setGroup(sc.next());
			if(services.addContact(bean)) {
				System.out.println("Contact added sucessfully");
			}else {
				System.out.println("something went wrong");
			}
			break;
			case 2:System.out.println("Enter the Contact name to delete");
			bean.setName(sc.next());
			if(services.deleteContact(bean.getName())) {
				System.out.println("deleted sucessfully");
			}else {
				System.out.println("something went wrong");
			}

			break;
			case 3:System.out.println("Enter Contact name ");
			String name=sc.next();
			System.out.println("Edit the number");
			bean.setNumber(sc.nextInt());
			if(services.editContact(name, bean.getNumber())) {
				System.out.println("Number edited Successfully");
			}else {
				System.out.println("something went wrong");
			}
			case 4:main(args);
			break;


			default:
				break;
			}


			break;


			default:
				break;
			}
		}
	}
}