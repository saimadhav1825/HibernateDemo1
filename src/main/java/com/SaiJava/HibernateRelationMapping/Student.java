package com.SaiJava.HibernateRelationMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollno;
	private String sname;                
	@OneToOne //-->one to one relation between two tables 
	//**private Laptop laptop;
	//public Laptop getLaptop() {
		//return laptop;
	//}
	//public void setLaptop(Laptop laptop) {
		//this.laptop = laptop;
	//}
	@OneToMany(mappedBy="std")   //--?one to many relation between two tables 
	//private java.util.List<Laptop> l=new ArrayList<Laptop>();
	//public java.util.List<Laptop> getL() {
	//	return l;
	//}
	//public void setL(java.util.List<Laptop> l) {
		//this.l = l;
	//}
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
