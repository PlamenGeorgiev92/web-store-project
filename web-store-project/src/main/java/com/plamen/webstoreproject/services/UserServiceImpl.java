package com.plamen.webstoreproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plamen.webstoreproject.domain.User;
import com.plamen.webstoreproject.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User saveNewUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public List<User> usersList() {
		return userRepository.findAll();
	}

}
