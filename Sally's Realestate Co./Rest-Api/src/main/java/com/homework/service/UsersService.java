package com.homework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.entity.Users;
import com.homework.repo.UsersRepo;

@Service
public class UsersService {

    @Autowired
    UsersRepo usersRepo;

    public Users signUp(Users users){
        return usersRepo.save(users);
    }

    public Users signIn(Users users){
        return usersRepo.findByEmailAndPassword(users.getEmailAddress(),users.getPassword());
    }

    public Users upDate(Users users) throws Exception {

        if(users.getId() == null) {
            throw new Exception("Id is not present, billy.");
        }
        return usersRepo.save(users);
        
    }

    public void deleteUsersById(Integer id){
         usersRepo.deleteById(id);
    }
    
}
