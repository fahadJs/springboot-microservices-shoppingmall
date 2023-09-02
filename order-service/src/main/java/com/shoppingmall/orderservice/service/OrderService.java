package com.shoppingmall.orderservice.service;

import com.shoppingmall.orderservice.dto.OrderRequest;

public interface OrderService {
    public void placeOrder(OrderRequest orderRequest);
}
