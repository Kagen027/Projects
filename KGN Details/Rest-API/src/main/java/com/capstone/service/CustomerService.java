package com.capstone.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.Customer;
import com.capstone.entity.Vehicle;
import com.capstone.repo.CustomerRepo;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepo customerRepo;
   
    //Function to save customer "Create" (CRUD)
    public Customer save(Customer customer){

        return customerRepo.save(customer);
    }


    //Function to update customer "Update" (CRUD)
    public Customer updateCustomerInfo(Customer customer) throws Exception {
        
        if(customer.getId() == null) {
            throw new Exception("Customer does not exsist.");
        }

        return customerRepo.save(customer);

    }

    //Functions to get/view customer "Read" (CRUD)
    public Customer getByEmailAndPassword(String email, String password) throws Exception {
        Boolean doesItMatch = false;
        
        if(findByEmail(email) == null) {
            throw new Exception("No account registered with this email address");
        }

        if (customerRepo.getByEmailAndPassword(email, password) != null) {
            doesItMatch = true;
          }

        if(doesItMatch) {
            return customerRepo.getByEmailAndPassword(email, password);
        } else {
            throw new Exception("Invalid Password");
        }

    }

    public List<Vehicle> viewGarage (Integer customerId){
        Customer customer = customerRepo.findById(customerId).orElseThrow(() -> new EntityNotFoundException("Customer with id " + customerId + " not found"));
        return customer.getGarage();
    }

    public Customer findById(Integer customerId) {

        return customerRepo.findById(customerId).get();

    }

    public Customer findByEmail(String email) {

        return customerRepo.getByEmail(email);

    }

    //Functions to get/view customer "Delete" (CRUD)
    public void deleteById(Integer customerId) {

        customerRepo.deleteById(customerId);

    }
}

