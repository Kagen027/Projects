package com.capstone.controller;

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

import com.capstone.entity.Vehicle;
import com.capstone.service.VehicleService;

@RestController
@CrossOrigin("*")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;


    //Post Mapping for creating vehicle
        @RequestMapping(
        //Value is the path of the endpoint, Must Be Unique
        value="/createVehicle/{customerId}",
        //Consumes JSON tells frontend what language it reading
        consumes = MediaType.APPLICATION_JSON_VALUE,
        //Produces JSON tells frontend what language it is sending 
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> create(@RequestBody Vehicle vehicle, @PathVariable Integer customerId){
        try{
            Vehicle createdVehicle = vehicleService.save(vehicle, customerId);

            return new ResponseEntity<>(createdVehicle, HttpStatus.CREATED);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }catch(Error e){
            System.out.println(e.getMessage());
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Get mapping to get a vehicle by ID
    @RequestMapping(
        value="/getVehicleById/{vehicleId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getVehicleById(@PathVariable Integer vehicleId) {

        try {

            Vehicle vehicle = vehicleService.findById(vehicleId);
       
            return new ResponseEntity<>(vehicle, HttpStatus.OK);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    //Delete method to delete vehicle by ID
    @RequestMapping(
        value="/deleteVehicleById/{vehicleId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.DELETE
    )
    public ResponseEntity<Object> deleteStudentById(@PathVariable Integer vehicleId) {

        try {

            vehicleService.deleteById(vehicleId);
       
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
