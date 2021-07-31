package com.plamen.webstoreproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plamen.webstoreproject.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByuserName(String userName);
}
