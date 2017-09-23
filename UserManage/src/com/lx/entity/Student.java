package com.lx.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
   @Id
   @Column(length=32)
   private int sno;
   
   @Column(length=32)
   private String sname;
   
   @Column(length=32)
   private String password;
  
   @Column(length=32)
   private String major;
   
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}

public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", password=" + password + ", major=" + major + "]";
}
   
   
}
