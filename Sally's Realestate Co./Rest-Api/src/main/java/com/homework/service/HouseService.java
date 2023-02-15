package com.homework.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.entity.House;
import com.homework.repo.HouseRepo;

@Service

public class HouseService {

    @Autowired
    HouseRepo houseRepo;

    public House createHouse(House house){

        house.setTimeOfListing(LocalDateTime.now());

        return houseRepo.save(house);
    }
    public List<House>viewAllHouse(){
        return houseRepo.findAll();
    }
    public List<House>viewAllHousesForSale(){
        return houseRepo.findForSale();
    }

    //Getting List For Houses On Market Longer Than 90 Days 
    public List<House>viewHousesForSaleOverNinety(){
         List <House> forSale =  houseRepo.findForSale();
         List <House> forSaleOverNinety = new ArrayList <House> ();

         for (House house: forSale){
            if (house.getTimeOfListing().isBefore(ninetyDays()))
                forSaleOverNinety.add(house);
         }
         return forSaleOverNinety;
    }
    //Getting List For Houses On Market Under 90 Days
    public List<House>viewHousesForSaleUnderNinety(){
        List <House> forSale =  houseRepo.findForSale();
        List <House> forSaleUnderNinety = new ArrayList <House> ();

        for (House house: forSale){
           if (!house.getTimeOfListing().isBefore(ninetyDays()))
               forSaleUnderNinety.add(house);
        }
        return forSaleUnderNinety;
   }


    public House getByHouseId(Integer id){
        return houseRepo.findById(id).get();
    }
    public House changHouse(House house) throws Exception{
        if(house.getId() == null){
            throw new Exception("House not found!");
        }
        return houseRepo.save(house);
    }
    public void deleteByHouseId(Integer id){
        houseRepo.deleteById(id);
    }

    //Function for getting 90 Days before current date
    public LocalDateTime ninetyDays(){
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime minusNinety = currentDate.minusDays(90);
        return minusNinety;
    }
    
}
