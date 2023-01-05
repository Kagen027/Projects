package com.dealership.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dealership.entity.User;
import com.dealership.service.Userservice;
import com.dealership.service.VehicleService;

//Controller are the servlet files that allow us to make request

@Controller
public class UserController {
    
    @Autowired
    Userservice userservice;

    @Autowired
    VehicleService vehicleService;

    //Get mapping lets you return a specific JSP file to view your browser
    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            // System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);

        }
        return "index";
    }
    @GetMapping("/signUp")
    public String signUp(Model model){

        model.addAttribute("user", new User());

        return "signUp";
    }
    @PostMapping("/signUp")
    public String signUp(@ModelAttribute("user") User user, Model model){

        User loggedInUser = userservice.save(user);

        if(loggedInUser == null){
           
            model.addAttribute("message", "This Username Is Already Taken!");

           return "signUp"; 
        }

        //This adds blank user object for signIn, so data isn't auto populated from signUp
        model.addAttribute("user", new User());

        return "signIn";
    }
    @GetMapping("/signIn")
    public String signIn(@ModelAttribute("user") User user, Model model){
    
            model.addAttribute("user", new User());
    
            return "signIn";
    }
    @PostMapping("/signIn")
    public String signIn(@ModelAttribute("user") User user, HttpSession session, Model model){

       User loggedInUser = userservice.getUsernameAndPassword(user);
       
       if(loggedInUser != null) {
        session.setAttribute("loggedInUserId", loggedInUser.getId());

        model.addAttribute("loggedInUser", loggedInUser);

        // System.out.println(loggedInUser.toString());
    
        return "index";
    } else {
        model.addAttribute("message", "You don't have an account.");
        return "signIn";
    }
}
    @GetMapping("/profile")
    public String profile(HttpSession session, Model model){
                
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            // System.out.println(loggedInUserId);
            User loggedInUser = userservice.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);

        }
        return "profile";
    }
    @PostMapping("/profile")
    public ModelAndView profile(HttpSession session) {

        session.removeAttribute("loggedInUserId");

        return new ModelAndView("index");
    }

}
