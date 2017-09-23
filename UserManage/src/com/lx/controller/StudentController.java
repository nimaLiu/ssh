package com.lx.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lx.entity.Page;
import com.lx.entity.Student;
import com.lx.service.StudentService;

@Controller
public class StudentController {
	 @Resource(name="studentService")
    private  StudentService StudentService;
	
	@RequestMapping("/all")
	public String getAll(Model model){
		return "redirect:/page?currentPage=1";
	}
	
	@RequestMapping("/page")
    public String doPage(String currentPage,Model model){
	 Page page=StudentService.findByPage(Integer.parseInt(currentPage));
		model.addAttribute("page", page);
		return "page";
	}
    
	@RequestMapping("/login")
    public String doIndex(){
		
	   return "login";
	}
	
	@RequestMapping("/doLogin")
    public String doLogin(String sno,String password,Model model){
	  Student student2= StudentService.findById(sno);
	  if (student2!=null&&student2.getPassword().equals(password)) {
		 return "redirect:/all";
	}else{
		model.addAttribute("tip", "�û�������������󣡣�");
		return "login";
	}
	  
	  
	}
	//��ת��ע��ҳ��
	@RequestMapping("/regist")
	public String registPage(){
		return "regist";
	}
	
	@RequestMapping("/doRegist")
	public String doRegist(Student student){
		StudentService.add(student);
		return "login";
	}
	
	

	@RequestMapping("/add")
    public String addPage(){
	    return "add";
	}
	
	@RequestMapping("/doAdd")
    public String doAdd(Student student){
	StudentService.add(student);
	return "redirect:/all";
	
	}
	
	@RequestMapping("/del")
	public String del( @RequestParam("sno") String sno){
		StudentService.del(sno);
		return "redirect:/all";
	}
	
	@RequestMapping("/edit")
	public String editPage(String sno,Model model){
		Student stu=StudentService.findById(sno);
		model.addAttribute("stu", stu);
		return "edit";
	}
	
	@RequestMapping("/doEdit")
    public String doEdit(Student student){
	StudentService.update(student);
	return "redirect:/all";
	
	}
	
	@RequestMapping("/search")
    public String doSearch(String sname,Model model){
	 List<Student> students=StudentService.search(sname);
		model.addAttribute("all", students);
		return "search";
	}
	

	
}