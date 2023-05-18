package com.example.BackendMedicare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BackendMedicare.entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
