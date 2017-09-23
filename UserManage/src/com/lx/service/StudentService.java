package com.lx.service;

import java.util.List;

import com.lx.entity.Page;
import com.lx.entity.Student;

public interface StudentService {
	
	  public void add(Student student);
	  public void del(String sno);  
	  public Student findById(String  sno);
	  public List<Student> getAll();
	  public void update(Student student);
	  public List<Student> search(String sname);
	  
	  public Page findByPage(int currentPage);
}
