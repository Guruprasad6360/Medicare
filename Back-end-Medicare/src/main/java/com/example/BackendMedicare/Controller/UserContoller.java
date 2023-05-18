package com.example.BackendMedicare.Controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BackendMedicare.Dto.UserDto;
import com.example.BackendMedicare.Service.UserService;
import com.example.BackendMedicare.entity.User;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserContoller {
  @Autowired
  public UserService userService;
  
  @PostMapping("/add-user")
  public String AddUser(@RequestBody UserDto dto) {
	  return userService.addUser(dto);
  }
  @GetMapping("/getAll")
  public List<User> getAllUser(){
	  return userService.getAllUser();
  }
  @PutMapping("/updateUser")
  public String updateUser(@RequestBody UserDto dto) {
	  return userService.updateUser(dto);
  }
  @DeleteMapping("/deleteUser/{id}")
  public String deleteUser(@PathVariable long id) {
	  return userService.deleteUser(id);
  }
  @GetMapping("/get-user/{id}")
  public User getUserById(@PathVariable long id) {
	  return userService.getUser(id);
  }
}