package com.ende.ecommerce.controller;

import com.ende.ecommerce.entity.Category;
import com.ende.ecommerce.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/{id}")
    public ResponseEntity<Category>  getById(@PathVariable UUID id){
        Category category =categoryService.getById(id);
        return  ResponseEntity.status(HttpStatus.OK).body(category);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAll(){
        List<Category> categories = categoryService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(categories);
    }

}






















