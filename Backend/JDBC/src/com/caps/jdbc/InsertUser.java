package com.caps.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//Load the driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver has been loaded....");

			//Get the DB connection via driver
			String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user =sc.nextLine();
			String password= sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection Established...");
			
			//Issue SQL query
			String query="INSERT into users_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter the UserId...");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the UserName...");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter the Email...");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter the password");
			pstmt.setString(4, sc.nextLine());
			
			int count = pstmt.executeUpdate();
			if(count > 0) {
				System.out.println("user data inserted...");
			}else
			{
				System.err.println("something went wrong...");
			}
			//Process the results returned 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//Close all the JDBC objects
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
