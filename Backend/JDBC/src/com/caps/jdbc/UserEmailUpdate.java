package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		//Load the Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");

			//Get DB connection
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter the DB user and password"); 
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection Established...");

			//Issue SQL query
			String query="update users_info set email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter Userid...");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the new email...");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter password to update...");
			pstmt.setString(3, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("Query Issued.......");

			//Process the results returned
			if(count> 0) {
				System.out.println("Query OK, "+count+" Rows effected");
			}else
				System.out.println("Something went wrong....");
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//close all the JDBC objects
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}
}
