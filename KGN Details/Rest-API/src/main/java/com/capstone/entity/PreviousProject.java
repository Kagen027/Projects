package com.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="previous_project")
public class PreviousProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="year")
    private String year;

    @Column(name="make")
    private String make;

    @Column(name="model")
    private String model;

    @Column(name="detail_type")
    private String detailType;

    @Column(name="pic_main")
    private String picMain;

    @Column(name="pic_one")
    private String picOne;

    @Column(name="pic_two")
    private String picTwo;
    
    @Column(name="pic_three")
    private String picThree;
    
    @Column(name="pic_four")
    private String picFour;

    @Column(name="pic_five")
    private String picFive;

    @Column(name="pic_six")
    private String picSix;

    @Column(name="pic_seven")
    private String picSeven;

    @Column(name="pic_eight")
    private String picEight;

    @Column(name="pic_nine")
    private String picNine;

    @Column(name="pic_ten")
    private String picTen;

    public Integer getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public String getPicMain() {
        return picMain;
    }

    public void setPicMain(String picMain) {
        this.picMain = picMain;
    }

    public String getPicOne() {
        return picOne;
    }

    public void setPicOne(String picOne) {
        this.picOne = picOne;
    }

    public String getPicTwo() {
        return picTwo;
    }

    public void setPicTwo(String picTwo) {
        this.picTwo = picTwo;
    }

    public String getPicThree() {
        return picThree;
    }

    public void setPicThree(String picThree) {
        this.picThree = picThree;
    }

    public String getPicFour() {
        return picFour;
    }

    public void setPicFour(String picFour) {
        this.picFour = picFour;
    }

    public String getPicFive() {
        return picFive;
    }

    public void setPicFive(String picFive) {
        this.picFive = picFive;
    }

    public String getPicSix() {
        return picSix;
    }

    public void setPicSix(String picSix) {
        this.picSix = picSix;
    }

    public String getPicSeven() {
        return picSeven;
    }

    public void setPicSeven(String picSeven) {
        this.picSeven = picSeven;
    }

    public String getPicEight() {
        return picEight;
    }

    public void setPicEight(String picEight) {
        this.picEight = picEight;
    }

    public String getPicNine() {
        return picNine;
    }

    public void setPicNine(String picNine) {
        this.picNine = picNine;
    }

    public String getPicTen() {
        return picTen;
    }

    public void setPicTen(String picTen) {
        this.picTen = picTen;
    }

    @Override
    public String toString() {
        return "PreviousProject{" +
                "id=" + id +
                ", year='" + year + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", detailType='" + detailType + '\'' +
                ", picMain='" + picMain + '\'' +
                ", picOne='" + picOne + '\'' +
                ", picTwo='" + picTwo + '\'' +
                ", picThree='" + picThree + '\'' +
                ", picFour='" + picFour + '\'' +
                ", picFive='" + picFive + '\'' +
                ", picSix='" + picSix + '\'' +
                ", picSeven='" + picSeven + '\'' +
                ", picEight='" + picEight + '\'' +
                ", picNine='" + picNine + '\'' +
                ", picTen='" + picTen + '\'' +
                '}';
    }
}
