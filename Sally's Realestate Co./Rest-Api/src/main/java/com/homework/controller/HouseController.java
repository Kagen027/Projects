package com.homework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.homework.entity.House;
import com.homework.service.HouseService;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin("*")
public class HouseController {

    @Autowired
    HouseService houseService;

    @RequestMapping(
        value = "/createHouse",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )

    public ResponseEntity<Object> createHouse(@RequestBody House house){
        try{
            House createHouse = houseService.createHouse(house);

            return new ResponseEntity<>(createHouse, HttpStatus.CREATED);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @RequestMapping(
        value = "/viewHouses",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> viewHouses(){
        try{
            List<House> viewAllHouses = houseService.viewAllHouse();

            return new ResponseEntity<>(viewAllHouses, HttpStatus.FOUND);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(
        value = "/viewHousesForSale",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> viewHousesForSale(){
        try{
            List<House> viewForSaleHouses = houseService.viewAllHousesForSale();

            return new ResponseEntity<>(viewForSaleHouses, HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(
        value = "/viewHousesForSaleUnderNinety",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> viewHousesForSaleUnderNinety(){
        try{
            List<House> viewHousesForSaleUnderNinety = houseService.viewHousesForSaleUnderNinety();

            return new ResponseEntity<>(viewHousesForSaleUnderNinety, HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(
        value = "/viewHousesForSaleOverNinety",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> viewHousesForSaleOverNinety(){
        try{
            List<House> viewHousesForSaleOverNinety = houseService.viewHousesForSaleOverNinety();

            return new ResponseEntity<>(viewHousesForSaleOverNinety, HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(
        value = "/getByHouseId/{houseId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getByHouseId(@PathVariable Integer houseId){
        try{
            House viewAllHouseById = houseService.getByHouseId(houseId);

            return new ResponseEntity<>(viewAllHouseById, HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(
        value = "/changeHouse",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )

    public ResponseEntity<Object> changeHouse(@RequestBody House house){
        try{
            House changeHouse = houseService.changHouse(house);

            return new ResponseEntity<>(changeHouse, HttpStatus.ACCEPTED);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @RequestMapping(
        value = "/deleteByHouseId/{houseId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.DELETE
    )
    public ResponseEntity<Object> deleteByHouseId(@PathVariable Integer houseId){
        try{
            houseService.deleteByHouseId(houseId);

            return new ResponseEntity<>( HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    
}
