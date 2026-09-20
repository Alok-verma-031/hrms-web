package com.example.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.model.JobInfo;

public interface JobInfoRepo extends JpaRepository<JobInfo, Integer> {

	
}
