package com.example.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.model.AppliedJob;

public interface AppliedJobRepo extends JpaRepository<AppliedJob, Integer> {
  // check if user already applied for same job
	boolean existsByJobidAndEmailaddress(int jobid,String emailaddress);
}
