package com.ende.ecommerce.service;

import com.ende.ecommerce.entity.Category;
import com.ende.ecommerce.repository.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements  CategoryService{

    private CategoryRepository categoryRepository;

    @Override
    public Category getById(UUID id) {
         Category  category= categoryRepository.findById(id).orElseThrow(() ->new EntityNotFoundException("Category not found"));
        return category;
    }
}
