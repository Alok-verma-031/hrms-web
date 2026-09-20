package com.example.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.model.Enquiry;

public interface EnquiryRepo extends JpaRepository<Enquiry, Integer> {

}
