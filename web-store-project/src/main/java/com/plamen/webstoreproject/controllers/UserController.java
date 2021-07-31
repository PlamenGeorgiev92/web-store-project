package com.plamen.webstoreproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plamen.webstoreproject.domain.User;
import com.plamen.webstoreproject.services.UserService;

@Controller
public class UserController {

	@Autowired
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "users", method = RequestMethod.POST)
	@ResponseBody
	public User saveNewUser(@RequestBody User user) {
		return userService.saveNewUser(user);
	}

	@RequestMapping(value = "users", method = RequestMethod.GET)
	@ResponseBody
	public List<User> usersList() {
		return userService.usersList();

	}
}
