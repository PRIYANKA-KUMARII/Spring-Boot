
	package com.nit.Beans;

	import java.time.LocalDate;
	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface ProductRepository extends JpaRepository<Product, Long> {

	    List<Product> findByName(String name);

	    List<Product> findByCategory(String category);

	    List<Product> findByPriceBetween(Double min, Double max);

	    List<Product> findByBrandAndCategory(String brand, String category);

	    List<Product> findByCreateDateAfter(LocalDate date);

	    List<Product> findByNameContaining(String namePart);
	}


