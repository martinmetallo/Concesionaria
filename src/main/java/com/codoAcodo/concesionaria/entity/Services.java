package com.codoAcodo.concesionaria.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Services {
    private LocalDate date;
    private int kilometers;
    private String description;
}
