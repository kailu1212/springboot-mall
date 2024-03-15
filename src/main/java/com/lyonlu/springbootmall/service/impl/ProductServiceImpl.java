package com.lyonlu.springbootmall.service.impl;

import com.lyonlu.springbootmall.dao.ProductDao;
import com.lyonlu.springbootmall.model.Product;
import com.lyonlu.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}