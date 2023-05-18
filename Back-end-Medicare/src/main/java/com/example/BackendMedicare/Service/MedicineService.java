package com.example.BackendMedicare.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.BackendMedicare.Dto.MedicineDto;
import com.example.BackendMedicare.entity.Medicine;



public interface MedicineService {
	
	public String addMedicines(MedicineDto medicineDto);
	
	public List<Medicine> getAllMedicines();
	
	public String updateMedicines(MedicineDto medicineDto);
	
	public String deleteMedicines(Long id);
	
	public Medicine getMedicineById(long id);
	
	
	
	public List<Medicine> getSortedMedicine();

}