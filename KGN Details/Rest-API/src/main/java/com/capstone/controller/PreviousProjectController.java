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

import com.capstone.entity.PreviousProject;
import com.capstone.service.PreviousProjectService;

@RestController
@CrossOrigin("*")
public class PreviousProjectController {
    
    @Autowired
    PreviousProjectService previousProjectService;

    //Post Method for creating previous project object
    @RequestMapping(
        value = "/createPreviousProject",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> createPreviousProject(@RequestBody PreviousProject previousProject){
        try{
            PreviousProject createPreviousProject = previousProjectService.createPreviousProject(previousProject);

            return new ResponseEntity<>(createPreviousProject, HttpStatus.CREATED);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    
    //Get Method for finding all previous project objects
    @RequestMapping(
        value = "/viewAllPreviousProject",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> viewAllPreviousProject(){
        try{
            List <PreviousProject> viewAllPreviousProject = previousProjectService.viewAllPreviousProject();

            return new ResponseEntity<>(viewAllPreviousProject, HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    //Get Method for finding Previous Project by Id
    @RequestMapping(
        value = "/getByPreviousProjectId/{previousProjectId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> getByPreviousProjectId(@PathVariable Integer previousProjectId){
        try{
            PreviousProject viewPreviousProjectById = previousProjectService.getByPreviousProjectId(previousProjectId);

            return new ResponseEntity<>(viewPreviousProjectById, HttpStatus.OK);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Delete Mehtod for deleting previous project by Id
    @RequestMapping(
        value = "/deleteByHouseId/{previousProjectId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.DELETE
    )
    public ResponseEntity<Object> deleteByPreviousProjectId(@PathVariable Integer previousProjectId){
        try{
            previousProjectService.deleteByPreviousProjectId(previousProjectId);

            return new ResponseEntity<>( HttpStatus.NO_CONTENT);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
