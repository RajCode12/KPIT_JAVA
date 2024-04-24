package com.kpit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kpit.pojo.Customer;

@Repository
public interface SavingAccountRepo extends JpaRepository<Customer,Integer> {

}
