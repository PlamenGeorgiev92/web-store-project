package com.plamen.webstoreproject.services;

import java.util.List;

import com.plamen.webstoreproject.domain.User;

public interface UserService {

	public User saveNewUser(User user);

	public List<User> usersList();

}
