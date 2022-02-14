package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.hibernate.demo.CreateStudentDemo;

public class JdbcTest {

	public static void main(String[] args) {
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker";
		
		String user="hbstudent";
		String pass="hbstudent";
		
		try {
			System.out.println("Connecting to database"+jdbcUrl);
			
			Connection myConn=DriverManager.getConnection(jdbcUrl,user,pass);
			
			System.out.println("Connection successfull!!");
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
