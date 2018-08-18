package com.qijiabin.controller;

import com.qijiabin.service.test1.UserService1;
import com.qijiabin.service.test2.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService1 userService1;
	@Autowired
	private UserService2 userService2;

	@RequestMapping("/insert")
	public String insertUser(String name, Integer age) {
		int result1 = userService1.insertUser(name, age);
		int result2 = userService2.insertUser(name, age);
		return result1 + "," + result2;
	}

}