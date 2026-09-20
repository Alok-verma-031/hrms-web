
package com.example.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.model.AdminInfo;

public interface AdminInfoRepo extends JpaRepository<AdminInfo, String> {

}