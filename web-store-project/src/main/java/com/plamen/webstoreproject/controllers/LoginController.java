package com.plamen.webstoreproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.plamen.webstoreproject.loginform.LoginForm;
import com.plamen.webstoreproject.repositories.UserRepository;

@Controller
public class LoginController {
	private final UserRepository userRepository;

	public LoginController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("loginForm") LoginForm loginForm, Model model) {
		System.out.println("submit pressed");
		String username = loginForm.getUsername();
		System.out.println(username);
		System.out.println(userRepository.findByuserName(username).getUserEmail());
		return "home";
	}

}
