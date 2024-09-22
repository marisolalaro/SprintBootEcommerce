package com.ende.ecommerce.mapper;

import com.ende.ecommerce.dto.ProductDto;
import com.ende.ecommerce.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product fromDto(ProductDto dto){
        Product product= new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        product.setImageUrl(dto.getImageUrl());
        product.setActive(dto.getActive());

        return  product;
    }
}
