package com.example.BackendMedicare.Service;

import java.util.List;

import com.example.BackendMedicare.Dto.AdminDto;
import com.example.BackendMedicare.entity.Admin;

public interface AdminService {
   public String addAdmin(AdminDto adminDto);
   public List<Admin> getAllAdmin();
}
