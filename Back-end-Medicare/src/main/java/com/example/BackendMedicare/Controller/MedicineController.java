package com.example.BackendMedicare.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BackendMedicare.Dto.MedicineDto;
import com.example.BackendMedicare.Service.MedicineService;
import com.example.BackendMedicare.entity.Medicine;
import com.example.BackendMedicare.config.*;


@RestController
@RequestMapping("/medicines")
//@CrossOrigin(origins = "http://localhost:4200")

public class MedicineController {
	
	@Autowired
	private MedicineService medicineService;
	
	@PostMapping("/add-medicine")
	public String addMedicine(@RequestBody MedicineDto dto) {
		return medicineService.addMedicines(dto);
		
	}
	
	@GetMapping("/getAll")
	public List<Medicine> getAllMedicine(){
		return medicineService.getAllMedicines();
	}
	
	@PutMapping("/updateMedicine")
	public String updateMedicine(@RequestBody MedicineDto dto) {
		return medicineService.updateMedicines(dto);
	}
	
	@DeleteMapping("/deleteMedicine/{id}")
	public String deleteMedicine(@PathVariable long id) {
		return medicineService.deleteMedicines(id);
	}
	
	@GetMapping("get-medicine/{id}")
	public Medicine getMedicineById(@PathVariable long id) {
		return medicineService.getMedicineById(id);

	
}
	
	@GetMapping("/get-sorted-medicine")
	public List<Medicine> getSortedMedicine(){
		return medicineService.getSortedMedicine();
	}

}
