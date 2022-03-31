package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.demo.model.Customer;

public class CustomerDao {
	public int customerRegistration(Customer c) {
		String url = "jdbc:mysql://localhost:3306/webapp";
		String user = "root";
		String password = "root";
		String sql = "INSERT INTO customer VALUES(?,?,?,?,?)";
		int status = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getPassword());
			pstmt.setString(3, c.getEmail());
			pstmt.setString(4, c.getPhone());
			pstmt.setString(5, c.getGender());
			status = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}
	public ArrayList<Customer> getCustomers(){
		String url = "jdbc:mysql://localhost:3306/webapp";
		String user = "root";
		String password = "root";
		String sql = "SELECT * FROM customer";
		int status = 0;
		ArrayList<Customer> alist=new ArrayList<Customer>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Customer c=new Customer();
				c.setName(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setEmail(rs.getString(3));
				c.setPhone(rs.getString(4));
				c.setGender(rs.getString(5));
				alist.add(c);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alist;
		
	}
}
