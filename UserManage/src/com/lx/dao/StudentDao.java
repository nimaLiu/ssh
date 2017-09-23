package com.lx.dao;

import java.util.List;

import com.lx.entity.Page;
import com.lx.entity.Student;

public interface StudentDao {
	
      public void add(Student student);
      public void del(String sno);
      public Student findById(String sno);
      public List<Student> getAll();
      public void update(Student student);
      public List<Student> search(String sname);
      
      //获得每一页的记录
      public List<Student> findByPage(int begin,int pageSize);
      //获得总记录数
      public  int findCount();
}
