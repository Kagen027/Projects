package com.homework.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homework.entity.House;



@Repository

public interface HouseRepo extends JpaRepository<House, Integer> {
    @Query(value="select * from house where sold = false and rented = false and user_id is null", nativeQuery = true)
    public House listForSaleAndRent();

    @Query(value = "select * from house where sold = false and for_sale = true ORDER BY time_of_listing desc", nativeQuery = true)
    public List<House> findForSale();
    
}
