package com.pcrepairservice.pcservice.services;

import com.pcrepairservice.pcservice.models.dtos.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);

    List<ProductDTO> getAllProducts();

    ProductDTO updateProductById(long productId, ProductDTO productDTO);

    void deleteProductById(long productId);
}