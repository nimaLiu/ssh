package com.lx.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lx.dao.StudentDao;
import com.lx.entity.Page;
import com.lx.entity.Student;

@Transactional
//@Service("stu") 相当于在applicationContext.xml注册了一个<bean id="stu" class=""/>
public class StudentServiceImp implements StudentService {
	@Autowired
     private StudentDao studentdao;
	public void setStudentdao(StudentDao studentdao) {
		this.studentdao = studentdao;
	}
	@Override
	public void add(Student student) {
		studentdao.add(student);
	}
	@Override
	public Student findById(int sno) {
		return studentdao.findById(sno);
	}
	@Override
	public List<Student> getAll() {
		return studentdao.getAll();
	}
	@Override
	public void del(String sno) {
		studentdao.del(sno);
		
	}
	@Override
	public void update(Student student) {
		studentdao.update(student);
		
	}
	@Override
	public List<Student> search(String sname) {
		
		return studentdao.search(sname);
	}
	
	@Override
	public Page findByPage(int currentPage) {
		Page page=new Page();
		page.setCurrentPage(currentPage);//设置当前页
		page.setPageSize(3); //设置每页多少条
		page.setCount(studentdao.findCount());//总条数
		int begin=(currentPage-1)*page.getPageSize();
		page.setList(studentdao.findPageList(begin, page.getPageSize()));//每页的数据
		//总页数
		int pageNum=(int) Math.ceil((double)page.getCount()/page.getPageSize());
		page.setPageCount(pageNum);
		return page;
	}
	
	

}
