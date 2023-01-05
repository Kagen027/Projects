package com.dealership.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dealership.entity.User;
import com.dealership.entity.Vehicle;
import com.dealership.service.Userservice;
import com.dealership.service.VehicleService;

@Controller
public class VehicleController {
   
    @Autowired
    Userservice userservice;
    @Autowired
    VehicleService vehicleService;

    @GetMapping("/usedListing")
    public String usedListing(HttpSession session, Model model){
                
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            // System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }

        List<Vehicle> allVehicles = vehicleService.getUsedVehicles();
        List<String> listOfMakes = vehicleService.getListOfMakes(allVehicles);
        
        
        model.addAttribute("allVehicles", allVehicles);
        model.addAttribute("filterList", listOfMakes);
        model.addAttribute("activeFilter", "Make");


        return "usedListing";

    }


    @GetMapping("/newListing")
    public String newListing(HttpSession session, Model model){
                
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");


        if(loggedInUserId != null) {
            //System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }


        List<Vehicle> allVehicles = vehicleService.getNewVehicles();
        List<String> listOfMakes = vehicleService.getListOfMakes(allVehicles);
        
        
        model.addAttribute("allVehicles", allVehicles);
        model.addAttribute("filterList", listOfMakes);
        model.addAttribute("activeFilter", "Make");
        
        return "newListing";

    }

    @GetMapping("/vehicleByMakeNew/{carMake}")
    public String ByMakeNew(@PathVariable("carMake") String make, Model model, HttpSession session) {

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            //System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }

    
            List<Vehicle> allVehicles1 = vehicleService.getNewVehicles();
            List<String> listOfMakes = vehicleService.getListOfMakes(allVehicles1);
            List<Vehicle> allVehicles = vehicleService.getNewByMake(make,false);

           
            model.addAttribute("allVehicles", allVehicles);
            model.addAttribute("filterList", listOfMakes);
            model.addAttribute("activeFilter", "Reset");

            return "newListing";
        
    }

    @GetMapping("/vehicleByMakeUsed/{carMake}")
    public String ByMakeUsed(@PathVariable("carMake") String make, Model model, HttpSession session) {

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            //System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }

    
            List<Vehicle> allVehicles1 = vehicleService.getNewVehicles();
            List<String> listOfMakes = vehicleService.getListOfMakes(allVehicles1);
            List<Vehicle> allVehicles = vehicleService.getNewByMake(make,true);

           
            model.addAttribute("allVehicles", allVehicles);
            model.addAttribute("filterList", listOfMakes);
            model.addAttribute("activeFilter", "Reset");

            return "usedListing";
        
    }


    @GetMapping("/details/{vehicleId}")
    public String details(@PathVariable("vehicleId") Integer vehicleId,HttpSession session, Model model){

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            //System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }

        Vehicle vehicle = vehicleService.getVehicleId(vehicleId);
        // System.out.println(vehicleId);
        Integer vehicleOwner = vehicle.getUsernum();
            if (vehicleOwner != null){
                User owner = userservice.findUserById(vehicleOwner);
                model.addAttribute("owner", owner);
            }

        
        // Finding if car has been on lot for over 120 days
        Boolean over120 = vehicleService.over120(vehicle);
        //System.out.println(over120);
        

        // Finding what 10% discount is for vehicle that is over 120 days
        Integer reducePrice = vehicleService.tenPercent(vehicle);
        // System.out.println(reducePrice);


        model.addAttribute("vehicle", vehicle);
        model.addAttribute("over120", over120);
        model.addAttribute("reducePrice", reducePrice);

        return "details";
    }

    @GetMapping("/reports")
    public String reports(HttpSession session, Model model){
                
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            //System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
            if(loggedInUser.getIsAdmin() == true){
               
                List<Vehicle> allVehicles = vehicleService.getAllVehicles();
                model.addAttribute("allVehicles", allVehicles);
               
                List<Vehicle> soldVehicles = vehicleService.getSoldVehicles();
                model.addAttribute("soldVehicles", soldVehicles);
               
                return "reports";
            }
        }
        return "index";
    }
    @GetMapping("/addVehicle")
    public String addVehicle(Model model, HttpSession session){

        // model.addAttribute("vehicle", new Vehicle());

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            //System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
            if(loggedInUser.getIsAdmin() == true){
               
                model.addAttribute("vehicle", new Vehicle());
               
                return "addVehicle";
            }
       }
       return "index";
    }
    @PostMapping("/addVehicle")
    public String signUp(@ModelAttribute("vehicle") Vehicle vehicle, Model model, HttpSession session){

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            //System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
            if(loggedInUser.getIsAdmin() == true){
               
                Vehicle newVehicle = vehicleService.save(vehicle);
                model.addAttribute("vehicle", newVehicle);
        
                return "confirmation";
            }
        }
        return "index";
    }

    @GetMapping("/purchase/{vin}")
    public String conBuyVehicle(@PathVariable String vin, Model model, HttpSession session) {

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if (loggedInUserId != null) {
            //System.out.println(vin.toString());
            User loggedInUser = userservice.buyVehicle(loggedInUserId, vin);
            Vehicle purchased = vehicleService.getVehicleByVin(vin);

            model.addAttribute("loggedInUser", loggedInUser);
            model.addAttribute("purchased", purchased);

            return "purchase";
        }

        // redirects you to the homepage, this will change your url so it wont be on
        // whips anymore
        return "redirect:/signUp";
    }

    @PostMapping("/purchase/{vin}")
    public String buyVehicle(@PathVariable String vin, Model model, HttpSession session) {

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if (loggedInUserId != null) {
            //System.out.println(vin.toString());
            User loggedInUser = userservice.buyVehicle(loggedInUserId, vin);

            model.addAttribute("loggedInUser", loggedInUser);

            return "purchase";
        }

        // redirects you to the homepage, this will change your url so it wont be on
        // whips anymore
        return "redirect:/signUp";
    }
}
