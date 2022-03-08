package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.getAllDepartment();
	}
	public void updateByDepartmentId() {
		String url="jdbc:mysql://localhost:3306/vasavi";
		String user="root";
		String password="root";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the department ID you wsnt to update: ");
		int departmentId = s.nextInt();
		s.nextLine();
		System.out.println("New Department Name");
		String dName=s.nextLine();
		System.out.println("New Department Location");
		String dLocation=s.nextLine();
		System.out.println("Change No Of Students:");
		int noStudents=s.nextInt();
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
			int result=stmt.executeUpdate
			("UPDATE college SET dname='"+dName+"',location='"+dLocation+"',noofstudent="+noStudents+" where did="+departmentId+"");
			if(result!=0) {
				System.out.println("Department Updated");
			}else {
				System.out.println("Department Not Updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteDepartmentById() {
		String url="jdbc:mysql://localhost:3306/vasavi";
		String user="root";
		String password="root";
		Scanner s=new Scanner(System.in);
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
			System.out.println("Enter the department ID yon wanted to delete");
			int id = s.nextInt();
			int result=stmt.executeUpdate("DELETE FROM college where location="+id+"");
			if(result!=0) {
				System.out.println("Department is deleted");
			}else {
				System.out.println("Department is not deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getAllDepartment() {
		String url="jdbc:mysql://localhost:3306/vasavi";
		String user="root";
		String password="root";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM college");
			while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addDepartment() {
		String url="jdbc:mysql://localhost:3306/vasavi";
		String user="root";
		String password="root";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the department ID: ");
		int departmentId = s.nextInt();
		s.nextLine();
		System.out.println("Department Name");
		String dName=s.nextLine();
		System.out.println("Department Location");
		String dLocation=s.nextLine();
		System.out.println("No Of Students:");
		int noStudents=s.nextInt();
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
			int result=stmt.executeUpdate("INSERT INTO college VALUES("+departmentId+",'"+dName+"','"+dLocation+"',"+noStudents+")");
			if(result!=0) {
				System.out.println("Detaperment details added successfully");
			}else {
				System.out.println("Detaperment details not added successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
