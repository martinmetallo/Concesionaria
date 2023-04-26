package com.codoAcodo.concesionaria.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {
    private int interno;
    private String brand;
    private String model;
    private LocalDate manufacturingDate;
    private int numberOfKilometers;
    private String doors;
    private String price;
    private String currency;
    private List<Services> services;
    private String countOfOwners;
}
