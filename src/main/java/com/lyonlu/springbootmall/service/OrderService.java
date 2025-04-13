package com.lyonlu.springbootmall.service;

import com.lyonlu.springbootmall.dto.CreateOrderRequest;
import com.lyonlu.springbootmall.dto.OrderQueryParams;
import com.lyonlu.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
