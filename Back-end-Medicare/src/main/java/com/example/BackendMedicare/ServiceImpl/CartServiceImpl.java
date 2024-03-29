package com.example.BackendMedicare.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BackendMedicare.Repository.CartRepository;
import com.example.BackendMedicare.Service.CartService;
import com.example.BackendMedicare.entity.Cart;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> getAllByUserCart(long id) {
		// TODO Auto-generated method stub
		return cartRepository.findAllByUserId(id);
	}

	@Override
	public void deleteCart(long id) {
		// TODO Auto-generated method stub
		cartRepository.deleteById(id);
	}

	@Override
	public void updateCart(Cart cart, long cid) {
		// TODO Auto-generated method stub
		
		Cart updated=cartRepository.findById(cid).get();
		updated=cart;
		cartRepository.save(updated);
		
	}

	

}