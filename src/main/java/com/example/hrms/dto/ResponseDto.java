package com.example.hrms.dto;

public class ResponseDto {
  private int id;
  private String responsetype;
  private String subject;
  private String responsetext;
  
  
  public int getId() {
	return id;
}
  public void setId(int id) {
	this.id = id;
  }
  public String getResponsetype() {
	return responsetype;
  }
  public void setResponsetype(String responsetype) {
	this.responsetype = responsetype;
  }
  public String getSubject() {
	return subject;
  }
  public void setSubject(String subject) {
	this.subject = subject;
  }
  public String getResponsetext() {
	return responsetext;
  }
  public void setResponsetext(String responsetext) {
	this.responsetext = responsetext;
  }
 
  
}
