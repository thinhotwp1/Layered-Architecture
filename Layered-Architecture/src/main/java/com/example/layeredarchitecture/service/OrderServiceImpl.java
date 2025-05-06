package com.example.layeredarchitecture.service;

import com.example.layeredarchitecture.dto.OrderRequest;
import com.example.layeredarchitecture.dto.OrderResponse;
import com.example.layeredarchitecture.model.Order;
import com.example.layeredarchitecture.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        Order order = new Order();
        order.setProduct(request.getProduct());
        order.setQuantity(request.getQuantity());
        order.setTotalPrice(request.getPrice().multiply(BigDecimal.valueOf(request.getQuantity())));
        orderRepository.save(order);

        return new OrderResponse(order.getId(), order.getProduct(), order.getTotalPrice());
    }
}
