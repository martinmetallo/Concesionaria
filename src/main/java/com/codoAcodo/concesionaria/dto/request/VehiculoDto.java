package com.codoAcodo.concesionaria.dto.request;

import com.codoAcodo.concesionaria.entity.Services;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoDto {
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
