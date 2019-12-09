package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs =null;
		try {
			//Load the Driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded..");
			
			//Get the DBconnection via Driver
			String dburl = "jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
			conn = DriverManager.getConnection(dburl);
			System.out.println("Connection established....");
			
			//Issue SQL query via connection
			String query = "SELECT * FROM users_info";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Query isuued...");
			System.out.println("****************************************************");
			
			//Process the Result returned
			while(rs.next()) {
				System.out.println("Userid :"+ rs.getInt("userid"));
				System.out.println("UserName : "+ rs.getString("username"));
				System.out.println("Email : "+ rs.getString("email"));
				System.out.println("************************************************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//close the JDBC objects
				try {
					if(conn!= null) {
					conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
					try {
						if(stmt!= null) {
						stmt.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
						try {
							if(rs!=null) {
							rs.close();
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			}
		
	}


