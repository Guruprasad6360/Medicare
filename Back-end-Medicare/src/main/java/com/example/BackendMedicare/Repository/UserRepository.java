package com.example.BackendMedicare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BackendMedicare.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
 
}
