package com.perennial.HIBday1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory  = new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		Transaction txn=session.beginTransaction();
		Address adr1= new Address();
		
		Student s1=new Student();
		s1.setfName("Pranoti");
		s1.setlName("Patil");
		s1.setRollno(1);
		adr1.setAddr_id(1);
		
		adr1.setCity("kolhapur");
		adr1.setCountry("india");
		adr1.setPin(745362);
		s1.setAddr(adr1);
		
		Student s2=new Student();
		s2.setfName("Sakshi");
		s2.setlName("Raut");
		s2.setRollno(2);

		Student s3=new Student();
		s3.setfName("Anup");
		s3.setlName("Miraje");
		s3.setRollno(3);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		//session.save(adr1);
		//Student s=new 
		//System.out.println(s1.toString());
		
		txn.commit();
		


	}

}
