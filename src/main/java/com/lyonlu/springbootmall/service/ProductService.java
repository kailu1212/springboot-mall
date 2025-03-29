package com.lyonlu.springbootmall.service;

import com.lyonlu.springbootmall.dto.ProductRequest;
import com.lyonlu.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);
}
