package com.myresto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myresto.domaine.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
