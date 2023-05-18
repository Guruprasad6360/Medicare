package com.example.BackendMedicare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BackendMedicare.Dto.AdminDto;
import com.example.BackendMedicare.Service.AdminService;
import com.example.BackendMedicare.entity.Admin;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200/")
public class AdminController {
  @Autowired
  private AdminService adminService;
  
  @PostMapping("/add-admin")
  public String addAdmin(@RequestBody AdminDto adminDto) {
	  return adminService.addAdmin(adminDto);
  }
  
  @GetMapping("/getAll")
  public List<Admin> getAllAdmins(){
	  return adminService.getAllAdmin();
  }
}
