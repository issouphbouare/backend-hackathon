package com.example.back_hackaton.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.back_hackaton.Repo.UserRepository;
import com.example.back_hackaton.model.User;

@RestController
@CrossOrigin("*")
public class Controller {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/login/{email}", method = RequestMethod.GET)
	public User getUserByEmailPassword(@PathVariable("email") String email) {
		return userRepository.findByEmail(email);
	}

	
}
