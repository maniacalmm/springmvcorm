package com.dexian.spring.springmvcorm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dexian.spring.springmvcorm.user.entity.User;
import com.dexian.spring.springmvcorm.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("regpage")
	public String showRegPage() {
		System.out.println("hitting register page");
		return "userReg";
	}
	
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap mm) {
		System.out.println("hitting post route");
		int save = service.save(user);
		mm.addAttribute("save", "User created with Id " + save);
		return "userReg";
	}
	
	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

}
