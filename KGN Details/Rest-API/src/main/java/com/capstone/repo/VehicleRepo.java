package com.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.entity.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Integer>{
    
}
