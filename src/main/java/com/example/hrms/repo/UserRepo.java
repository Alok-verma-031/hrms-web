package com.example.hrms.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	Optional<User> findByEmailaddressAndPassword(String emailaddress, String password);
	
	

}
