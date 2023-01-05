package com.dealership.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealership.entity.Vehicle;
import com.dealership.repo.VehicleRepo;

@Service
public class VehicleService {
    
    @Autowired 
    VehicleRepo vehicleRepo;

    public Vehicle save( Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    public List<Vehicle> getAllVehicles(){
       return vehicleRepo.findAll();
    }

    public List<Vehicle> getUsedVehicles(){
        return vehicleRepo.findUsed(true);
     }

    public List<Vehicle> getNewVehicles(){
        return vehicleRepo.findNew(false);
    }
    public List<Vehicle> getSoldVehicles(){
        return vehicleRepo.findSold(true);
    }

    public Vehicle getVehicleId(Integer Id){
        return vehicleRepo.findById(Id).get();
    }

    public List<Vehicle> getByMake(String make) {
        return vehicleRepo.getByMake(make);
    }
    public List<Vehicle> getNewByMake(String make, Boolean used){
        return vehicleRepo.getNewByMake(make, used);
    }
    
    public Vehicle getVehicleByVin(String vin){
        return vehicleRepo.getVehicleByVin(vin);
    }

    public boolean over120(Vehicle vehicle){
        
        Vehicle currentVehicle = vehicle;
        String vehicleDate = currentVehicle.getDateArrived();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/d/yyyy");
        LocalDate localvehicleDate = LocalDate.parse(vehicleDate, formatter);
        
        LocalDate currentDate = LocalDate.now();
        LocalDate minus120 = currentDate.minusDays(120);

        if (localvehicleDate.isBefore(minus120)) {
            System.out.println("Over 120 Days");
            return true;
        }
        return false;

    }

    public Integer tenPercent(Vehicle vehicle){
        Vehicle currentVehicle = vehicle;
        
        Integer tenPerc = currentVehicle.getPrice()/10;
        Integer newPrice = currentVehicle.getPrice()-tenPerc;

        return newPrice;
    }

    public List<String> getListOfMakes(List<Vehicle> carList) {

        List<String> listOfMakes = new ArrayList<String>();
        for (Vehicle vehicle : carList) {
            // add the make to the listOfMakes if its not in there already
            if(!listOfMakes.contains(vehicle.getMake())) {

                listOfMakes.add(vehicle.getMake());

            }
        }

        return listOfMakes;

    }

}
