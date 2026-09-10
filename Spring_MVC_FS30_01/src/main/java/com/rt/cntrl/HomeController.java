package com.rt.cntrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
//	@RequestMapping("/")
//	public String indexPage() {
//		return "login";
//	}
	
	@RequestMapping("/")
	public String indexPage() {
		return "login";
	}
	
	@RequestMapping("/addJsp")
	public String addJsp() {
		return "register";
	}
	
	@RequestMapping("/updateJsp")
	public String updateJsp() {
		return "update";
	}
	
	@RequestMapping("/deleteJsp")
	public String deleteJsp() {
		return "delete";
	}
	
	@RequestMapping("/selectJsp")
	public String selectJsp() {
		return "select";
	}
	
	

}
