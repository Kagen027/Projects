package com.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework.entity.Users;
import com.homework.service.UsersService;

import org.springframework.web.bind.annotation.RequestMethod;


/* Squidward is the best friend in the world 
 * hello
 * hi who wrote this?
*/
@RestController

public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping(
        value = "/signUp",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    
    public ResponseEntity<Object> signUp(@RequestBody Users users){
        try{
            Users signUp = usersService.signUp(users);

            return new ResponseEntity<>(signUp, HttpStatus.CREATED);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping(
        value = "/signIn",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )

    public ResponseEntity<Object> signIn(@RequestBody Users users){
        try{
            Users signIn = usersService.signIn(users);

            return new ResponseEntity<>(signIn, HttpStatus.FOUND);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
        value = "/upDate",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    
    public ResponseEntity<Object> upDate(@RequestBody Users users){
        try{
            Users upDate = usersService.upDate(users);

            return new ResponseEntity<>(upDate, HttpStatus.CREATED);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
        value="/deleteUsersById/{usersId}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.DELETE
    )
    public ResponseEntity<Object> deleteById(@PathVariable Integer usersId) {

        try {

            usersService.deleteUsersById(usersId);

            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Error e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
}

