package com.example.hrms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="appliedjob")
public class AppliedJob {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int jobid;
	@Column(length=100)
	private String title;
	@Column(length=500)
	private String description;
	@Column(length=50)
	private String name;
	@Column(length=15)
	private String contactno;

	@Column(length=50)
	private String emailaddress;
	@Column(length=100)
	private String qualification;
	
	@Column(length=50)
	private String experience;
	
	@Column(length=500)
	private String keyskill;
	
	@Column(length=30)
	private String applieddate;
	
	@Column(length=50)
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getKeyskill() {
		return keyskill;
	}

	public void setKeyskill(String keyskill) {
		this.keyskill = keyskill;
	}

	public String getApplieddate() {
		return applieddate;
	}

	public void setApplieddate(String applieddate) {
		this.applieddate = applieddate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
