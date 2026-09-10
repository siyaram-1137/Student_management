package com.rt.cntrl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.dto.StudentDTO;
import com.rt.entities.Student;
import com.rt.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@RequestMapping("/addUser")
	public String addUser(HttpSession session, @ModelAttribute Student s, Model m ) {

		String loggedInUser = (String) session.getAttribute("user");
		
		ss.addStudent(s,loggedInUser);
		
		return "redirect:getAllStudents";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student s, Model m ) {

		ss.updateStudent(s);
		
		return "update";
	}
	
	@RequestMapping("/removeStudent")
	public String removeStudent(@RequestParam int id, Model m ) {

		ss.removeStudent(id);
		
		return "delete";
	}
	
	@RequestMapping("/getStudent")
	public String getStudent(@RequestParam int id, Model m ) {

		StudentDTO s = ss.getStudent(id);
		
		m.addAttribute("std",s);
		
		return "select";
	}

//	@RequestMapping("/getStudent")
//	public String getStudent(@RequestParam int id, Model m ) {
//
//		Student s = ss.getStudent(id);
//		
//		m.addAttribute("std",s);
//		
//		return "select";
//	}

	@RequestMapping("/getAllStudents")
	public String getAllStudents(HttpSession session, Model m ) {
		
		String loggedInUser = (String) session.getAttribute("user");

		List<Student> list = ss.getAllStudents(loggedInUser);
		
		m.addAttribute("stdList",list);
		
		return "display";
	}

}
