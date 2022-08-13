package com.example.API_DB02;

import com.example.API_DB02.model.Product;
import com.example.API_DB02.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ApiDb02Application implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiDb02Application.class, args);
	}

	@Override
	public void run(String... args)throws Exception{
		productRepository.save(new Product("omar","Developer"));
		productRepository.save(new Product("moaz","Spring"));
		productRepository.save(new Product("joo","HHHHHhho"));
		productRepository.save(new Product("Abdo","ssssssss"));
		productRepository.save(new Product("hhhhheeeee","aaaaa"));

	}

}
