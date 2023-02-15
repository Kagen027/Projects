package com.homework.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homework.entity.Users;


@Repository
public interface UsersRepo extends JpaRepository<Users, Integer>  { 
    
    @Query(value="select * from users where email_address=?1 and password=?2", nativeQuery = true)
    public Users findByEmailAndPassword(String emailAddress, String password);



}
