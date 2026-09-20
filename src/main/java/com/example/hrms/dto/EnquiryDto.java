package com.example.hrms.dto;

public class EnquiryDto {
   private int id;
   private String name;
   private String address;
   private String contactno;
   private String emailaddress;
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
