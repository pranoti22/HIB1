package com.perennial.HIBday1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
	private String  fName;
	private String  lName;
	private int rollno;
	private Address addr;
	private Set<Subjects> subject=new LinkedHashSet<Subjects>();
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Set<Subjects> getSubject() {
		return subject;
	}
	public void setSubject(Set<Subjects> subject) {
		this.subject = subject;
	}
	

}
