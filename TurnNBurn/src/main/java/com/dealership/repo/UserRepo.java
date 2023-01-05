package com.dealership.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dealership.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    
    @Query(value = "select * from user where username=?1 and password=?2", nativeQuery = true)
    public User findByUsernameAndPassword(String username, String password);
}
