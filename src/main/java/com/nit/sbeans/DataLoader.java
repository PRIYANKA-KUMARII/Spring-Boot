package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
	private EmployeeRepository repo;

	public DataLoader(EmployeeRepository repo) {
		this.repo = repo;
	}

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Employee("101","Alice Johnson", "Hr", 55000, LocalDate.of(2022, 5, 10)));
		repo.save(new Employee("102","Bob Smith", "IT", 70000, LocalDate.of(2021,3, 15)));
		repo.save(new Employee("103", "Priya", "Software", 80000, LocalDate.of(2024, 6, 20)));
		
		System.out.println("---------------------Find by Department (IT)--------------------");
		repo.findByDepartment("IT").forEach(System.out::println);
		System.out.println("---------------Find by Salary >60000-------------");
		repo.findBySalaryGreaterThan(60000).forEach(System.out::println);
		
		System.out.println("--------------Find by Joining Date after 2022-01-01----------------");
		repo.findByJoiningDateAfter(LocalDate.of(2022, 1,1)).forEach(System.out::println);
		
		System.out.println("----------------------Find by Name containing 'dav' (case-insensitive)---------");
		repo.findByNameContainingIgnoreCase("dav").forEach(System.out::println);
		
		
	}

}
