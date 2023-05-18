package com.example.BackendMedicare.Service;

import java.util.List;

import com.example.BackendMedicare.entity.Cart;

public interface CartService {
	
	public Cart addToCart(Cart cart);
	
	public List<Cart> getAllByUserCart(long id);
	
	public void deleteCart(long id);
	
	public void updateCart(Cart cart, long cid);

}