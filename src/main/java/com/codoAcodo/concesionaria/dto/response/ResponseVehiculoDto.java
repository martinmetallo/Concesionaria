package com.codoAcodo.concesionaria.dto.response;

import com.codoAcodo.concesionaria.dto.request.VehiculoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVehiculoDto {
    private String mensaje;
    private VehiculoDto vehiculo;
}
