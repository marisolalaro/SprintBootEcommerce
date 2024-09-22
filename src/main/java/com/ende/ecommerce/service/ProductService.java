package com.ende.ecommerce.service;

import com.ende.ecommerce.dto.ProductDto;
import com.ende.ecommerce.entity.Product;

import java.util.UUID;

public interface ProductService {
    Product create(ProductDto product);

    Product getById(UUID id);

}
