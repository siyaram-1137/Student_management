package com.rt.cntrl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Logout {
	
	@RequestMapping("/logout")
	public String logout(HttpSession session, Model m  ) {
		
		session.invalidate();
		
		return "login";
		
	}

}
