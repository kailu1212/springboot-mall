package com.lyonlu.springbootmall.dao;

import com.lyonlu.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
