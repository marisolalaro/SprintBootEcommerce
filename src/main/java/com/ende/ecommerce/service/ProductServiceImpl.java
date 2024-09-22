package com.ende.ecommerce.service;

import com.ende.ecommerce.dto.ProductDto;
import com.ende.ecommerce.entity.Category;
import com.ende.ecommerce.entity.Product;
import com.ende.ecommerce.exception.EntityNotFoundException;
import com.ende.ecommerce.mapper.ProductMapper;
import com.ende.ecommerce.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;
    private CategoryService categoryService;
    private ProductMapper productMapper;
    @Override
    public Product create(ProductDto dto) {

        Category category= categoryService.getById(dto.getCategoryId());
        Product product = productMapper.fromDto(dto);
        product.setCategory(category);

        return productRepository.save(product);
    }

    @Override
    public Product getById(UUID id) {
        Product product = productRepository.findById(id).orElseThrow(() ->new EntityNotFoundException("Product",id));
        return product;
    }
}
