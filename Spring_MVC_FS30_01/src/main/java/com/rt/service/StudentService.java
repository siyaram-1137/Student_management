package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.StudentDao;
import com.rt.dto.StudentDTO;
import com.rt.entities.Student;


@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	public void addStudent(Student s, String loggedInUser) {
		dao.addStudent(s,loggedInUser);
	}

	public void updateStudent(Student s) {
		dao.updateStudent(s);
	}

	public void removeStudent(int id) {
		dao.removeStudent(id);
	}

	public StudentDTO getStudent(int id) {
		
		Student s = dao.getStudent(id);
		
		StudentDTO sd = new StudentDTO();
		
		sd.setId(s.getId());
		sd.setName(s.getName());
		sd.setMobile(s.getMobile());
		
		return sd;
	}

	public List<Student> getAllStudents(String loggedInUser) {
		return dao.getAllStudents(loggedInUser);
	}
	
}
