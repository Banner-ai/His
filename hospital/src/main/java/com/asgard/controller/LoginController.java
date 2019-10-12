package com.asgard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asgard.model.Permission;
import com.asgard.model.Role;
import com.asgard.model.User;
import com.asgard.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService ls;
	
	@RequestMapping("login.do")
	public String login(String username,String password,String verify,Model model) {
	 	User user = ls.loginUser(username,password);
	 	
	 	
	 	if(user != null) {
	 		if(verify=="7236") {
	 			return "index.jsp";
	 		}
	 	}
	 	Role role = ls.jurisdiction(user.getId());
	 	System.out.println(role);
	 	model.addAttribute("r",role);
	 	
	 	
		return "redirect:login.jsp";
		
	}
	
}
