package com.ende.ecommerce.service;

import com.ende.ecommerce.entity.Category;

import java.util.UUID;

public interface CategoryService {

    Category getById(UUID id);

}
