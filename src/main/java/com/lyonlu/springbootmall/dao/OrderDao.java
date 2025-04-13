package com.lyonlu.springbootmall.dao;

import com.lyonlu.springbootmall.model.Order;
import com.lyonlu.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
