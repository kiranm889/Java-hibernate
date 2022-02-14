package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity1.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		
		//create session factory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			
			//create student obj
			Student s1=new Student("Ikkat","lo","ikkatlo@gmail.com");
			
			
			//start transaction
			session.beginTransaction();
			
			session.save(s1);
			//commit transaction
			session.getTransaction().commit();
			
			
			
			
			
			
		} finally {
			factory.close();
		}
		
		

	}

}
