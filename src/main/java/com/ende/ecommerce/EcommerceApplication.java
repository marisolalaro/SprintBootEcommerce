package com.ende.ecommerce;

import com.ende.ecommerce.entity.Category;
import com.ende.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

	@Autowired
	CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category = new Category();
		category.setName("sport");
		category.setDescription("mochilas");

		Category category1 = new Category();
		category1.setName("sport");
		category1.setDescription("mochilas");

		Category categorySave = categoryRepository.save(category);
		Category categorySave1 = categoryRepository.save(category1);
		System.out.println(categorySave.getId().toString());
		System.out.println(categorySave1.getId().toString());
	}
}








