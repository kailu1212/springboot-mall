package com.lyonlu.springbootmall.service;

import com.lyonlu.springbootmall.dto.CreateOrderRequest;
import com.lyonlu.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
