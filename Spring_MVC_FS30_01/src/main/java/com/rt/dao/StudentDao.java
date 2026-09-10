package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.entities.Student;

@Repository
public class StudentDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void addStudent(Student s, String loggedInUser) {
		
		Object args[] = {s.getName(),s.getMobile(),s.getAddress(),loggedInUser};
		
		int rs = jdbcTemplate.update("insert into student_data(name,mobile,location,user) values(?,?,?,?)",args);
		
		System.out.println(rs);
		
	}

	public void updateStudent(Student s) {
		
		Object args[] = {s.getName(),s.getMobile(),s.getAddress(), s.getId()};
		
		int rs = jdbcTemplate.update("update student_data set name = ?, mobile = ?, location = ? where id = ?",args);
		
		System.out.println(rs);
	}

	public void removeStudent(int id) {
		
		Object args[] = {id};
		
		int rs = jdbcTemplate.update("delete from student_data where id = ?",args);
		
		System.out.println(rs);
	}

	public Student getStudent(int id) {
		
		Object args[] = {id};
		
		Student rs = jdbcTemplate.queryForObject("select * from student_data where id = ?",args, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student(rs.getInt("id"),rs.getString("name"),rs.getString("mobile"),rs.getString("location"));
				return s;
			}
			
		});
		
		return rs;
	}

	public List<Student> getAllStudents(String loggedInUser) {
		
		Object args[] = {loggedInUser};
		
		List<Student> list = jdbcTemplate.query("select * from student_data where user = ?",args, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student(rs.getInt("id"),rs.getString("name"),rs.getString("mobile"),rs.getString("location"));
				return s;
			}
			
		});
		
		return list;
	}

}
