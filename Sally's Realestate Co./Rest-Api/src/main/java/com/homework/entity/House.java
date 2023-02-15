package com.homework.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="house_number")
    private String houseNumber;

    @Column(name="street_name")
    private String streetName;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip_code")
    private String zipCode;

    @Column(name="price")
    private Long price;

    @Column(name="number_of_bedroom")
    private Integer numOfBeds;

    @Column(name="number_of_bathroom")
    private Integer numOfBaths;

    @Column(name="square_feet")
    private Integer squareFeet;

    @Column(name="for_sale")
    private boolean forSale;

    @Column(name="sold")
    private boolean sold;

    @Column(name="for_rent")
    private boolean forRent;

    @Column(name="rented")
    private boolean rented;

    @Column(name="time_of_listing")
    private LocalDateTime timeOfListing;

    @Column(name="time_sold")
    private LocalDateTime timeSold;

    @Column(name="picture")
    private String picture;

    public House() {
    }

    public Integer getId() {
        return id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(Integer numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public Integer getNumOfBaths() {
        return numOfBaths;
    }

    public void setNumOfBaths(Integer numOfBaths) {
        this.numOfBaths = numOfBaths;
    }

    public Integer getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Integer squareFeet) {
        this.squareFeet = squareFeet;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public LocalDateTime getTimeOfListing() {
        return timeOfListing;
    }

    public void setTimeOfListing(LocalDateTime timeOfListing) {
        this.timeOfListing = timeOfListing;
    }

    public LocalDateTime getTimeSold() {
        return timeSold;
    }

    public void setTimeSold(LocalDateTime timeSold) {
        this.timeSold = timeSold;
    }

    public boolean isForRent() {
        return forRent;
    }

    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }  

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "House [id=" + id + ", houseNumber=" + houseNumber + ", streetName=" + streetName + ", city=" + city
                + ", state=" + state + ", zipCode=" + zipCode + ", price=" + price + ", numOfBeds=" + numOfBeds
                + ", numOfBaths=" + numOfBaths + ", squareFeet=" + squareFeet + ", forSale=" + forSale + ", sold="
                + sold + ", forRent=" + forRent + ", rented=" + rented + ", timeOfListing=" + timeOfListing
                + ", timeSold=" + timeSold + ", picture=" + picture + "]";
    }

    

    
}
