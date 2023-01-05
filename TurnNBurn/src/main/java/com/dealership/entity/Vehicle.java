package com.dealership.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "vin",nullable = false, unique = true, updatable = false, length = 17)
    private String vin;

    @Column(name = "used",nullable = false, columnDefinition = "boolean default 1")
    private Boolean used;

    @Column(name = "sold",nullable = false, columnDefinition = "boolean default 0")
    private Boolean sold;

    @Column(name = "year",nullable = false)
    private Integer year;

    @Column(name = "make",nullable = false)
    private String make;
    
    @Column(name = "model",nullable = false)
    private String model;
    
    @Column(name = "door",nullable = false)
    private Integer door;
    
    @Column(name = "type",nullable = false)
    private String type;
    
    @Column(name = "engine",nullable = false)
    private String engine;
    
    @Column(name = "transmission",nullable = false)
    private String transmission;
    
    @Column(name = "drivetrain",nullable = false)
    private String driveTrain;
    
    @Column(name = "interiorcolor",nullable = false)
    private String interiorColor;
    
    @Column(name = "exterirocolor",nullable = false)
    private String exteriorColor;
    
    @Column(name = "pic",nullable = false)
    private String pic;
    
    @Column(name = "price",nullable = false)
    private Integer price;
    
    @Column(name = "datearrived",nullable = false)
    private String dateArrived;
    
    @Column(name = "datesold")
    private LocalDate dateSold;

    @Column(name = "usernum")
    private Integer usernum;

    public Vehicle() {
    }

    public Integer getId() {
        return id;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getDoor() {
        return door;
    }

    public void setDoor(Integer door) {
        this.door = door;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDateArrived() {
        return dateArrived;
    }

    public void setDateArrived(String dateArrived) {
        this.dateArrived = dateArrived;
    }

    public LocalDate getDateSold() {
        return dateSold;
    }

    public void setDateSold(LocalDate dateSold) {
        this.dateSold = dateSold;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }

    @Override
    public String toString() {
        return "Vehicle [id=" + id + ", vin=" + vin + ", used=" + used + ", sold=" + sold + ", year=" + year + ", make="
                + make + ", model=" + model + ", door=" + door + ", type=" + type + ", engine=" + engine
                + ", transmission=" + transmission + ", driveTrain=" + driveTrain + ", interiorColor=" + interiorColor
                + ", exteriorColor=" + exteriorColor + ", pic=" + pic + ", price=" + price + ", dateArrived="
                + dateArrived + ", dateSold=" + dateSold + ", usernum=" + usernum + "]";
    }

    
    
    
        
}
