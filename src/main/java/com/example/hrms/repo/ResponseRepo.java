package com.example.hrms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.model.Response;

public interface ResponseRepo extends JpaRepository<Response, Integer>{
	
	List<Response> findByResponsetype(String responsetype);

}