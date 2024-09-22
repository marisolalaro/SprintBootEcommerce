package com.ende.ecommerce.repository;

import com.ende.ecommerce.entity.Category;
import com.ende.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ProductRepository  extends JpaRepository<Product, UUID> {

}
