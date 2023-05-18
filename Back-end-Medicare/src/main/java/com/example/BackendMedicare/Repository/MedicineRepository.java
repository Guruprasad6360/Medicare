package com.example.BackendMedicare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BackendMedicare.entity.*;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}