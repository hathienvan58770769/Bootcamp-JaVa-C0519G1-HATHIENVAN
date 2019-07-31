package com.codegym.employees.repository;

import com.codegym.employees.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



@Repository("employeeRepository")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    public Page<Employee> findAll(Pageable pageable);
    public Page<Employee> findAllByIdContaining(int id,Pageable pageable);
    public Page<Employee> findAllByFullNameContaining(String fullName,Pageable pageable);
    /*
    public Page<Employee> findAllByIdOrFullNameContaining(int id,String fullName,Pageable pageable);
    */

}