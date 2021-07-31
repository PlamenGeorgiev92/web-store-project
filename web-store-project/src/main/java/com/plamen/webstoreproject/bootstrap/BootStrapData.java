package com.plamen.webstoreproject.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.plamen.webstoreproject.domain.User;
import com.plamen.webstoreproject.repositories.UserRepository;
@Component
public class BootStrapData implements CommandLineRunner{
	
	private final UserRepository userRepository;
	
	public BootStrapData(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Started in Bootstrap");
		
//		User plamen = new User("plamen","plamen@plamen.com", "12345678");
//		userRepository.save(plamen); System.out.println("User: " +
//		plamen.getUserName() + " created!");
		 
		
	}

	

}
