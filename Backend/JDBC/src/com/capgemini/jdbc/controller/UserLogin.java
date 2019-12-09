package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin {
	public static void main(String[] args) {
		UserServices services = UserFactory.insatnceOfUserServices();
		
		UserBean user= new UserBean();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter username");
		user.setUsername(sc.nextLine());
		System.out.println("enter password");
		user.setPassword(sc.nextLine());
		user=services.userLogin(user.getUsername(),user.getPassword());
		
		if(user!= null) {
			System.out.println("userid is "+user.getUserid());
			System.out.println("username is "+user.getUsername());
			System.out.println("email is "+user.getEmail());
			}
		else {
			System.out.println("enter correct details");
		}
		
}
}
