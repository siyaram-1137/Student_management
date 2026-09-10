package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.LoginDao;

@Service
public class LoginService {
	
	@Autowired
	LoginDao ld;

	public boolean checkUser(String username, String password) {
		return ld.checkUser(username,password);
	}

}
