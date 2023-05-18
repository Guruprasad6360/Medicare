package com.example.BackendMedicare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BackendMedicare.Service.CartService;
import com.example.BackendMedicare.Service.MedicineService;
import com.example.BackendMedicare.Service.UserService;
import com.example.BackendMedicare.entity.Cart;
import com.example.BackendMedicare.entity.Medicine;
import com.example.BackendMedicare.entity.User;



@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {
	
	
	@Autowired
	private CartService cartService;
	@Autowired
	private UserService userService;
	@Autowired
	private MedicineService medicineService;
	
	@GetMapping("getall/{userId}")
	public List<Cart> getCart(@PathVariable long userId) {
		return cartService.getAllByUserCart(userId);
	}

	@GetMapping("/add/{medicineId}/{userId}")
	public ResponseEntity<Cart> addCart(@PathVariable long medicineId,@PathVariable long userId) {

		Medicine medicine = medicineService.getMedicineById(medicineId);
		User user = userService.getUser(userId);
		Cart cart = new Cart(user, medicine);
		cart.setUnit(1);
		cart.setTotalPrice(cart.getUnit()*medicine.getPrice());
		Cart addCart = cartService.addToCart(cart);
		return new ResponseEntity<Cart>(addCart, HttpStatus.CREATED);

	}

	@DeleteMapping("/delete/{cartId}")
	public ResponseEntity<?> deletCart(@PathVariable long cartId) {

		cartService.deleteCart(cartId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update-cart/{cid}")
	public void updateCart(@RequestBody Cart cart, @PathVariable long cid) {
		cartService.updateCart(cart, cid);
		
	}

}