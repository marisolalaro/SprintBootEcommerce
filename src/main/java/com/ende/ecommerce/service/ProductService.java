package com.ende.ecommerce.service;

import com.ende.ecommerce.dto.ProductDto;
import com.ende.ecommerce.entity.Product;

public interface ProductService {
    Product create(ProductDto product);
}
