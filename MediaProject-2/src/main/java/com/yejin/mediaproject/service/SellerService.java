package com.yejin.mediaproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yejin.mediaproject.domain.RoleType;
import com.yejin.mediaproject.domain.Seller;
import com.yejin.mediaproject.persistence.SellerRepository;

import java.util.List;
import java.util.function.Supplier;

@Service
public class SellerService {
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional
	public void insertSeller(Seller  seller) {
		sellerRepository.save(seller);
	}
	
	@Transactional(readOnly = true)
	public Seller getSeller(String username) {
		//검색 결과가 없을 때 빈 Seller 객체 반환
		Seller findSeller = sellerRepository.findByUsername(username).orElseGet(
				new Supplier<Seller>() {
					@Override
					public Seller get() {
						return new Seller();
					}
				});
		return findSeller;
	}
	
	@Transactional(readOnly = true)
	public List<Seller> getSellerList(){
		return sellerRepository.findAll();
	}
}
