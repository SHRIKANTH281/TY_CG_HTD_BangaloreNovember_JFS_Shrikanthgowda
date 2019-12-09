package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try{
			//Load the driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			//Get the DBconnection via Driver
			String dbUrl= "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter username and password");
			String dbuser=sc.nextLine();
			String dbPass=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,dbuser,dbPass);
			System.out.println("connection established...");
			//Issue the SQL query via connection
			String query = "SELECT * FROM users_info WHERE userid= ? AND password= ? ";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter the UserId....");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the password....");
			pstmt.setString(2, sc.nextLine());
			rs=pstmt.executeQuery();
			System.out.println("Query issued and excuted");
			System.out.println("************************************");
			//process the results returned
			if(rs.next()) {
				System.out.println("Userid :"+ rs.getInt(1));
				System.out.println("UserName : "+ rs.getString(2));
				System.out.println("Email : "+ rs.getString(3));
			}else
				System.err.println("Something went wrong");
		} catch( SQLException e) {
			e.printStackTrace();
		}
		//Close all JDBC objects
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
			try {
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}