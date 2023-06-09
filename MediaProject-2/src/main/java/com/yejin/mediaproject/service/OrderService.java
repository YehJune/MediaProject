package com.yejin.mediaproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yejin.mediaproject.domain.Order;
import com.yejin.mediaproject.persistence.OrderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	@Transactional
	public void insertOrder(Order order) {
		orderRepository.save(order);
	}
	
	@Transactional(readOnly = true)
	public List<Order> getItembyUserId(Integer userId) {
		//검색 결과가 없을 때 빈 Order 객체 반환
		List<Order> findOrder = orderRepository.findByUserId(userId).orElseGet(
				new Supplier<List<Order>>() {
					@Override
					public List<Order> get() {
						return new ArrayList<Order>();
					}
				});
		return findOrder;
	}
	
}
