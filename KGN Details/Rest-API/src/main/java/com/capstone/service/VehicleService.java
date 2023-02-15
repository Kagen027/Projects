package com.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.Customer;
import com.capstone.entity.Vehicle;
import com.capstone.repo.VehicleRepo;

@Service
public class VehicleService {
    
    @Autowired
    VehicleRepo vehicleRepo;

    @Autowired
    CustomerService customerService;

    //Function to save vehicle "Create" (CRUD)
    public Vehicle save(Vehicle vehicle, Integer customerId){
        Customer customer = customerService.findById(customerId);

        Vehicle savedVehicle = vehicleRepo.save(vehicle); 

        customer.getGarage().add(savedVehicle);

        customerService.save(customer);

        return savedVehicle;
    }

    //Function to update vehicle "Update" (CRUD)
    public Vehicle updateVehicleInfo(Vehicle vehicle) throws Exception {
    
        if(vehicle.getId() == null) {
            throw new Exception("Vehicle does not exsist.");
        }

        return vehicleRepo.save(vehicle);

    }

    //Functions to get/view customer "Read" (CRUD)
    public Vehicle findById(Integer vehicleId) {

        return vehicleRepo.findById(vehicleId).get();

    }

    //Functions to get/view vehicle "Delete" (CRUD)
    public void deleteById(Integer vehicleId) {

        vehicleRepo.deleteById(vehicleId);
        
    }
}
