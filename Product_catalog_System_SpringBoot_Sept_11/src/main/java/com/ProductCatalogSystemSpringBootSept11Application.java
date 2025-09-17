package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nit.Beans.Product;
import com.nit.Beans.ProductRepository;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.nit"})
public class ProductCatalogSystemSpringBootSept11Application implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogSystemSpringBootSept11Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        productRepository.save(new Product("iPhone 13", "Electronics", 999.99, "Apple", LocalDate.of(2022,1,10)));
        productRepository.save(new Product("Galaxy S21", "Electronics", 799.99, "Samsung", LocalDate.of(2022,5,12)));
        productRepository.save(new Product("ThinkPad X1", "Computers", 1299.99, "Lenovo", LocalDate.of(2021,9,20)));
        productRepository.save(new Product("MacBook Pro", "Computers", 1999.99, "Apple", LocalDate.of(2023,3,5)));
        productRepository.save(new Product("AirPods Pro", "Accessories", 249.99, "Apple", LocalDate.of(2022,11,25)));
        productRepository.save(new Product("Pixel 6", "Electronics", 599.99, "Google", LocalDate.of(2022,10,1)));
        productRepository.save(new Product("Monitor 4K", "Electronics", 399.99, "Dell", LocalDate.of(2023,6,15)));

        System.out.println("=== findByName(\"MacBook Pro\") ===");
        List<Product> p1 = productRepository.findByName("MacBook Pro");
        p1.forEach(System.out::println);

        System.out.println("\n=== findByCategory(\"Electronics\") ===");
        List<Product> p2 = productRepository.findByCategory("Electronics");
        p2.forEach(System.out::println);

        System.out.println("\n=== findByPriceBetween(500.00, 1000.00) ===");
        List<Product> p3 = productRepository.findByPriceBetween(500.00, 1000.00);
        p3.forEach(System.out::println);

        System.out.println("\n=== findByBrandAndCategory(\"Apple\", \"Computers\") ===");
        List<Product> p4 = productRepository.findByBrandAndCategory("Apple", "Computers");
        p4.forEach(System.out::println);

        System.out.println("\n=== findByCreateDateAfter(LocalDate.of(2022,1,1)) ===");
        List<Product> p5 = productRepository.findByCreateDateAfter(LocalDate.of(2022,1,1));
        p5.forEach(System.out::println);

        System.out.println("\n=== findByNameContaining(\"Pro\") ===");
        List<Product> p6 = productRepository.findByNameContaining("Pro");
        p6.forEach(System.out::println);
    }
}
