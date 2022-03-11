package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bank.model.Bank;


public class BankDao {
	public int insertDepartment(Bank bankDetails) {
		// jdbc code to add bank
		String url="jdbc:mysql://localhost:3306/vasavi";
		String user="root";
		String password="root";
		String sql="INSERT INTO bank VALUES(?,?,?)";
		int status=0;
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,bankDetails.getId());
			pstmt.setString(2, bankDetails.getName());
			pstmt.setString(3, bankDetails.getIfsc());
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	public ArrayList<Bank> findAllBanks(){
		String url="jdbc:mysql://localhost:3306/vasavi";
		String user="root";
		String password="root";
		String sql="SELECT * FROM bank";
		ArrayList<Bank> list=new ArrayList<Bank>();
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt=con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Bank bank=new Bank();
				bank.setId(rs.getInt(1));
				bank.setName(rs.getString(2));
				bank.setIfsc(rs.getString(3));
				list.add(bank);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
}
