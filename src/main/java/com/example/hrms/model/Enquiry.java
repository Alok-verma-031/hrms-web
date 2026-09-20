package com.example.hrms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="enquiries")
public class Enquiry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
	@Column(length=50)
 private String name;
	@Column(length=100)
 private String address;
	@Column(length=50)
 private String contactno;
	@Column(length=50)
 private String emailaddress;
	@Column(length=500)
 private String enquirytext;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getEnquirytext() {
		return enquirytext;
	}
	public void setEnquirytext(String enquirytext) {
		this.enquirytext = enquirytext;
	}
	
	
}
