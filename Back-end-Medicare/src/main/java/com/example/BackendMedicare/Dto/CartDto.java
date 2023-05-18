package com.example.BackendMedicare.Dto;

import com.example.BackendMedicare.entity.Medicine;
import com.example.BackendMedicare.entity.User;

public class CartDto {
 private long id;
 private User user;
 private Medicine medicine;
	
	private Integer unit;
	
	private double totalPrice;

	public CartDto(long id, User user, Medicine medicine, Integer unit, double totalPrice) {
		super();
		this.id = id;
		this.user = user;
		this.medicine = medicine;
		this.unit = unit;
		this.totalPrice = totalPrice;
	}

	public CartDto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
