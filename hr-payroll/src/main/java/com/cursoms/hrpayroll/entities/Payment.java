package com.cursoms.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Payment implements Serializable {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment(){}

    public double getTotal(){
        return days * dailyIncome;
    }

}
