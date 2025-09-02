package com.nit.sbeans;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    List<Employee> findByDepartment(String department);

    List<Employee> findBySalaryGreaterThan(double salary); // ✅ FIXED method name

    List<Employee> findByJoiningDateAfter(LocalDate date);

    List<Employee> findByNameContainingIgnoreCase(String keyword);


}
