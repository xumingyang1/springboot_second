package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CarModel {
    private Integer carid;

    private String carname;

    private Integer carsex;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
   private Date cartime;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname == null ? null : carname.trim();
    }

    public Integer getCarsex() {
        return carsex;
    }

    public void setCarsex(Integer carsex) {
        this.carsex = carsex;
    }

    public Date getCartime() {
        return cartime;
    }

    public void setCartime(Date cartime) {
        this.cartime = cartime;
    }
}