package com.codegym.employees.repository;

import com.codegym.employees.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



@Repository("employeeRepository")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    public Iterable<Employee> findAll();
    public Iterable<Employee> findAllByIdContaining(int id);

    public Iterable<Employee> findAllByFullNameContaining(String fullName);
}