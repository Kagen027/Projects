package com.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

    @Query(value="select * from customer where email = ?1", nativeQuery = true)
    public Customer getByEmail(String email);

    @Query(value="select * from customer where email = ?1 and password = ?2", nativeQuery = true)
    public Customer getByEmailAndPassword(String email, String password);
    
}