package com.example.back_hackaton.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.back_hackaton.model.User;
@RepositoryRestResource
@CrossOrigin("*")
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
	

}
