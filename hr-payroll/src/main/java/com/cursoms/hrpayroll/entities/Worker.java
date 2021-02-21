package com.cursoms.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Worker implements Serializable {

    public Worker() {
    }

    private Long id;
    private String name;
    private Double dailyIncome;
}
