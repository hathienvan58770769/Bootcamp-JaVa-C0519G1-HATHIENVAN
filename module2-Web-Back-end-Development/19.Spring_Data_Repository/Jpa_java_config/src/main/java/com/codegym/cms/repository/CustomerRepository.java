package com.codegym.cms.repository;
import com.codegym.cms.entity.Customer;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository("customerRepository")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

}