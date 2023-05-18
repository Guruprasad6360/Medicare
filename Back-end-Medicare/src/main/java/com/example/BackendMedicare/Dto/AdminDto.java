package com.example.BackendMedicare.Dto;

public class AdminDto {
  private long id;
  private String email;
  private String password;
public AdminDto() {
	super();
}
public AdminDto(long id, String email, String password) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
  
}
