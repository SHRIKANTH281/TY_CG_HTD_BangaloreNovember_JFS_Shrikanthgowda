package com.capgemini.contactfile.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.contactfile.bean.ContactBean;

public class ContactDaoImpl implements ContactDAO {
	FileReader reader;
	Properties prop;
	ContactBean bean;
	List<ContactBean> list=new ArrayList<ContactBean>();
	public ContactDaoImpl() {
		try {
			reader= new FileReader("module1.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ContactBean> showAllContact() {
		try(Connection conn= DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))) {
			while(rs.next()) {
				bean.setName(rs.getString(1));
				bean.setNumber(rs.getLong(2));
				bean.setGroup(rs.getString(3));
				
				list.add(bean);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ContactBean> search(String name) {
		try(Connection conn= DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("searchQuery"))) {
			while(rs.next()) {
				bean.setName(rs.getString(1));
				bean.setNumber(rs.getLong(2));
				bean.setGroup(rs.getString(3));
				
				list.add(bean);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addContact(ContactBean c) {
		try(Connection conn= DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("addQuery"))) {
			pstmt.setString(1, c.getName());
			pstmt.setLong(2, c.getNumber());
			pstmt.setString(3, c.getGroup());

			int count = pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteContact(String name) {
		try(Connection conn= DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteQuery"))) {
			pstmt.setString(1, name);

			int count = pstmt.executeUpdate();

			if(count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean editContact(String name, long number) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateQuery"))){

			pstmt.setLong(1,number);
			pstmt.setString(2,name);
			int count=pstmt.executeUpdate();

			if(count >0) {
				return true;
			} else {
				return false;
			}


		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
