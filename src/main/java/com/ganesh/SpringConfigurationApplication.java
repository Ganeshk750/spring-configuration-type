package com.ganesh;

import com.ganesh.model.User;
import com.ganesh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringConfigurationApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringConfigurationApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		    User user1 = new User("John", "john@domain.com");
			User user2 = new User("Julie", "julie@domain.com");
			userRepository.save(user1);
			userRepository.save(user2);
		    userRepository.findAll().forEach(user -> System.out.println("Name: "+ user.getName() + " Email: "+ user.getEmail()));
	}



}
