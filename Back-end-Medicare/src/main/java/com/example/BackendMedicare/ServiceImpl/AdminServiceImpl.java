package com.example.BackendMedicare.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BackendMedicare.Dto.AdminDto;
import com.example.BackendMedicare.Repository.AdminRepository;
import com.example.BackendMedicare.Service.AdminService;
import com.example.BackendMedicare.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService{
  
	@Autowired
	private AdminRepository adminRepository;
	@Override
	public String addAdmin(AdminDto adminDto) {
		Admin admin=new Admin();
		admin.setEmail(adminDto.getEmail());
		admin.setPassword(adminDto.getPassword());
		adminRepository.save(admin);
		return "New Admin Data Saved";
	}

	@Override
	public List<Admin> getAllAdmin() {
		return adminRepository.findAll();
	}
  
}
