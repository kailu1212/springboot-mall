package com.lyonlu.springbootmall.dao;

import com.lyonlu.springbootmall.dto.ProductQueryParams;
import com.lyonlu.springbootmall.dto.ProductRequest;
import com.lyonlu.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {



    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);

    void updateStock(Integer productId, Integer stock);
}
