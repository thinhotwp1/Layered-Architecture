package com.example.layeredarchitecture.service;

import com.example.layeredarchitecture.dto.OrderRequest;
import com.example.layeredarchitecture.dto.OrderResponse;

public interface OrderService {
    OrderResponse createOrder(OrderRequest request);
}
