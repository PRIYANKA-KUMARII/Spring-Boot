package com.nit.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Book;
import com.nit.sbeans.Library;

@Configuration

public class AppConfig {
	@Bean
	public Book book() {
		return new Book("Spring in Action");
		
	}
	@Bean
	public Library Library (Book book) {
		return new Library(book);
		
	}
	

}
