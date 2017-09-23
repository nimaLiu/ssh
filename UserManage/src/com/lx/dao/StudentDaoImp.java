package com.lx.dao;

import java.util.List;

import javax.persistence.criteria.From;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lx.entity.Page;
import com.lx.entity.Student;

public class StudentDaoImp implements StudentDao {
	@Autowired
     private  SessionFactory sessionfactory;
     
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public void add(Student student) {
		sessionfactory.getCurrentSession().save(student);
	}

	@Override
	public Student findById(String sno) {
		Student student2 =null;
	    Session session=sessionfactory.getCurrentSession();
	    //HQL语句from后面跟的是实体名
	    Query query = session.createQuery("from Student where sno= ?");
	    student2= (Student) query.setInteger(0, Integer.parseInt(sno)).uniqueResult();
		return student2;
	}

	@Override
	public List<Student> getAll() {
		  Session session=sessionfactory.getCurrentSession();
		  List<Student> students=session.createQuery("from Student").list();
		  return students;
	}

	@Override
	public void del(String sno) {
		Query query=sessionfactory.getCurrentSession().createQuery("delete from Student where sno= ?");
		query.setInteger(0, Integer.parseInt(sno));
		query.executeUpdate();
	
	    
	}

	@Override
	public void update(Student student) {
		Session session=sessionfactory.getCurrentSession();
	     session.update(student);
		
		
	}

	@Override
	public List<Student> search(String sname) {
	    Query query = sessionfactory.getCurrentSession().createQuery("from Student where sname like ?");
	    query.setString(0, sname+"%");
	    List<Student> students=query.list();
	    return students;
	}

	@Override
	public List<Student> findByPage(int begin,int pageSize) {
		Query query= sessionfactory.getCurrentSession().createQuery("from Student");
		query.setFirstResult(begin);
		query.setMaxResults(pageSize);
		return query.list();
		
	}
	
	public  int findCount(){
		Query query=sessionfactory.getCurrentSession().createQuery("select count(sno) from Student");
		int count= ((Number)query.iterate().next()).intValue();
		return count;
	}
	
}
