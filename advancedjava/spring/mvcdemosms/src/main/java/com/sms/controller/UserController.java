package com.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sms.model.User;

@Controller
public class UserController {
	@RequestMapping("/user") // api
	@ResponseBody
	public User user() {
		return new User(300, "abc", "4646666");
	}
	@RequestMapping("/user/greet") //api
	@ResponseBody
	public String greet() {
		return "welcome restfull app world";
	}
	

}
