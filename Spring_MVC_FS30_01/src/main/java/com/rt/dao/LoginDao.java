package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.entities.Student;

@Repository
public class LoginDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean checkUser(String username, String password) {
		
		Object args[] = {username,password};
		
		int rs = jdbcTemplate.queryForObject("select count(*) from users where username = ? and password = ?",args, new RowMapper<Integer>() {

			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt(1);
			}

		});
		
		if(rs >= 1) {
			return true;
		}
		
		return false;
	}

}
