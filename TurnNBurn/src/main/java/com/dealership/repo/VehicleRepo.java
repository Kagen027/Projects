package com.dealership.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dealership.entity.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Integer>{
    
    @Query(value = "select * from vehicle where user_id is null and make=?1", nativeQuery = true)
    public List<Vehicle> getByMake(String make);

    @Query(value = "select * from vehicle where user_id is null and make=?1 and used=?2", nativeQuery = true)
    public List<Vehicle> getNewByMake(String make, Boolean used);

    @Query(value = "select * from vehicle where user_id is null and used=?1", nativeQuery = true)
    public List<Vehicle> findUsed(Boolean used);

    @Query(value = "select * from vehicle where user_id is null and used=?1", nativeQuery = true)
    public List<Vehicle> findNew(Boolean used);

    @Query(value = "select * from vehicle where sold=?1 ORDER BY datesold desc", nativeQuery = true)
    public List<Vehicle> findSold(Boolean sold);
    
    @Query(value = "select * from vehicle where user_id is null and vin = ?1", nativeQuery = true)
    public Vehicle getVehicleByVin(String vin);

}

