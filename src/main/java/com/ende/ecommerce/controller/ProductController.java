package com.ende.ecommerce.controller;

import com.ende.ecommerce.dto.ProductDto;
import com.ende.ecommerce.entity.Category;
import com.ende.ecommerce.entity.Product;
import com.ende.ecommerce.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;


    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductDto productDto){
        Product product =productService.create(productDto);
        return  ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product>  getById(@PathVariable UUID id){
        Product product =productService.getById(id);
        return  ResponseEntity.status(HttpStatus.OK).body(product);
    }


}
