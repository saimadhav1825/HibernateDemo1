package com.SaiJava.HibernateRelationMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollno;
	private String sname;
	private String marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", marks=" + marks + "]";
	}

}
