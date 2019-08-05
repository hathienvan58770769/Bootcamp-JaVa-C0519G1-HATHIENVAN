package com.codegym.employees.service;

import com.codegym.employees.entity.Employee;
import com.codegym.employees.exception.ResourceNotFoundException;
import com.codegym.employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Qualifier("employeeRepository")
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public Page<Employee> getEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    /*
    @Override
    @Transactional
    public Page<Employee> findAllByIdOrFullNameContaining(int id,String fullName,Pageable pageable){
        return employeeRepository.findAllByIdOrFullNameContaining(id, fullName,pageable);
    }
*/
    @Override
    @Transactional
    public Page<Employee> findAllByIdContaining(int id, Pageable pageable) {
        return employeeRepository.findAllByIdContaining(id,pageable);
    }
    @Override
    @Transactional
    public Page<Employee> findAllByFullNameContaining(String fullName,Pageable pageable) {
        return employeeRepository.findAllByFullNameContaining(fullName, pageable);
    }
    @Override
    @Transactional
    public void saveEmployee(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) throws ResourceNotFoundException {
        return employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(id));
    }


    @Override
    @Transactional
    public void deleteEmployee(int theId) {
        employeeRepository.deleteById(theId);
    }
}