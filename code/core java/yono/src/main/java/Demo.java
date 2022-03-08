import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		Scanner s=new Scanner(System.in);
		System.out.println("1. Add Department");
		System.out.println("2. Show All Department");
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			d.addDepartment();
			d.getAllDepartment();
			break;
		case 2:
			d.getAllDepartment();
			break;
		}
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
			//Statement stmt=con.createStatement();
			PreparedStatement pstmt=
			con.prepareStatement("UPDATE college SET dname=?,location=?,noofstudent=? where did=?");
			pstmt.setString(1, dName);
			pstmt.setString(2, dLocation);
			pstmt.setInt(3, noStudents);
			pstmt.setInt(4, departmentId);
			int result=pstmt.executeUpdate();
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
			//Statement stmt=con.createStatement();
			System.out.println("Enter the department ID yon wanted to delete");
			int id = s.nextInt();
			PreparedStatement pstmt=con.prepareStatement("DELETE FROM college where did=?");
			pstmt.setInt(1,id);
			int result=pstmt.executeUpdate();
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
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			System.out.println("*****************************");
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
			//Statement stmt=con.createStatement();
			PreparedStatement pstmt=con.prepareStatement("INSERT INTO college VALUES(?,?,?,?)");
			pstmt.setInt(1, departmentId);
			pstmt.setString(2, dName);
			pstmt.setString(3, dLocation);
			pstmt.setInt(4, noStudents);
			int result=pstmt.executeUpdate();
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
