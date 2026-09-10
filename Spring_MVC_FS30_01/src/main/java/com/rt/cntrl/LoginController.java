package com.rt.cntrl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@RequestMapping("/login")
	public String login(HttpSession session, @RequestParam String username, @RequestParam String password, Model m ) {

		boolean isValid = ls.checkUser(username,password);
		
		if(isValid) {
			session.setAttribute("user", username);
			m.addAttribute("user",username);
			return "index";
		}else {
			m.addAttribute("msg","wrong user name or password");
			return "login";
		}
		
	}

}
