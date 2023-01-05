package com.dealership.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealership.entity.User;
import com.dealership.entity.Vehicle;
import com.dealership.repo.UserRepo;

//Service is to do logic and CRUD
@Service
public class Userservice {
    
    @Autowired
    UserRepo userRepo;
    
    @Autowired
    VehicleService vehicleService;

    public User save( User user) {
        return userRepo.save(user);
    }

    public User getUsernameAndPassword(User user){
        return userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    public User findUserById(Integer userId) {
        return userRepo.findById(userId).get();
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User buyVehicle(Integer userId, String vin){
        
        User loggedInUser = findUserById(userId);

        Vehicle vehicle = vehicleService.getVehicleByVin(vin);

        vehicle.setDateSold(LocalDate.now());

        vehicle.setSold(true);

        vehicle.setUsernum(userId);

        loggedInUser.getGarage().add(vehicle);

        return save(loggedInUser);
    }

    public List<User> getUserPurchases(){
        
        List<User> allUsers = findAllUsers();

        List<User> owners = new ArrayList<User>();
        for (User user: allUsers){
            if(!user.getGarage().isEmpty()){
                owners.add(user);
            }
        }

        return owners;
    }
   

}
