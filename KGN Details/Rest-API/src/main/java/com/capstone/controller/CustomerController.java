package com.capstone.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Customer;
import com.capstone.entity.Vehicle;
import com.capstone.service.CustomerService;

@RestController
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    //Post Mapping for creating customer
        @RequestMapping(
        //Value is the path of the endpoint, Must Be Unique
        value="/createCustomer",
        //Consumes JSON tells frontend what language it reading
        consumes = MediaType.APPLICATION_JSON_VALUE,
        //Produces JSON tells frontend what language it is sending 
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> create(@RequestBody Customer customer){
        try{
            Customer createdCustomer = customerService.save(customer);

            return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    //Post Mapping "Because signin has sensitive info" for sign in

    @RequestMapping(
        //Value is the path of the endpoint, Must Be Unique
        value="/signIn",
        //Consumes JSON tells frontend what language it reading
        consumes = MediaType.APPLICATION_JSON_VALUE,
        //Produces JSON tells frontend what language it is sending 
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> signIn(@RequestBody Customer customer){
        try{
            Customer signedInCustomer = customerService.getByEmailAndPassword(customer.getEmail(),customer.getPassword());

            return new ResponseEntity<>(signedInCustomer, HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    //Get mapping to get a customer by ID
    @RequestMapping(
        value="/getCustomerById/{customerId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getCustomerById(@PathVariable Integer customerId) {

        try {

            Customer customer = customerService.findById(customerId);
       
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping(
        value="/getCustomerByEmail/{email}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getCustomerByEmail(@PathVariable String email) {

        try {

            Customer customer = customerService.findByEmail(email);
       
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    //get customer's garage
    @RequestMapping(
        value="/getCustomerGarage/{customerId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getCustomerGarage(@PathVariable Integer customerId) {

        try {

            List<Vehicle> garage  = customerService.viewGarage(customerId);
            return new ResponseEntity<>(garage, HttpStatus.OK);
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    //Delete method to delete customer by ID
    @RequestMapping(
        value="/deleteCustomerById/{customerId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.DELETE
    )
    public ResponseEntity<Object> deleteStudentById(@PathVariable Integer customerId) {

        try {

            customerService.deleteById(customerId);
       
            return new ResponseEntity<>("Your Account has been permenetly deleted.", HttpStatus.NO_CONTENT);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}