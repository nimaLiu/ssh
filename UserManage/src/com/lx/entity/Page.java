package com.lx.entity;

import java.util.List;

public class Page {
	//��ǰҳ
     private int currentPage;
     //ÿҳ������
     private int pageSize;
     //�ܼ�¼��
     private int count;
     //��ҳ��
     private int pageCount;
     //ÿҳ������
     private List<Student> list;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
     
}
