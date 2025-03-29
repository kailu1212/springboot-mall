package com.lyonlu.springbootmall.service;

import com.lyonlu.springbootmall.constant.ProductCategory;
import com.lyonlu.springbootmall.dto.ProductRequest;
import com.lyonlu.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);


}
