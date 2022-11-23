package com.example.back_hackaton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.back_hackaton.model.User;

@SpringBootApplication
public class Back_hackatonApplication implements CommandLineRunner {
	@Autowired
    private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(Back_hackatonApplication.class, args);
		
		
	}
	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(User.class);
		// TODO Auto-generated method stub
		
	}
	

}
