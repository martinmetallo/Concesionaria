package com.codoAcodo.concesionaria.service;

import com.codoAcodo.concesionaria.dto.request.VehiculoDto;
import com.codoAcodo.concesionaria.dto.response.ResponseVehiculoDto;
import com.codoAcodo.concesionaria.entity.Vehiculo;
import com.codoAcodo.concesionaria.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {

    VehiculoRepository repository;

    public VehiculoService(VehiculoRepository personaRepository){
        repository = personaRepository;
    }

    public ResponseVehiculoDto agregarVehiculo(VehiculoDto vehiculoDto){
        Vehiculo vehiculoNuevo = new Vehiculo(1,vehiculoDto.getBrand(),vehiculoDto.getModel(),vehiculoDto.getManufacturingDate(),
                 vehiculoDto.getNumberOfKilometers(), vehiculoDto.getDoors(),vehiculoDto.getPrice(),vehiculoDto.getCurrency(),vehiculoDto.getServices(),
            vehiculoDto.getCountOfOwners());
        if (repository.crearRegistro(vehiculoNuevo) >0){
            ResponseVehiculoDto respuesta = new ResponseVehiculoDto("Todo salio OK",vehiculoDto);
            return respuesta;
        }
        ResponseVehiculoDto respuestaErronea = new ResponseVehiculoDto("No se pudo crear el registro",null);
        return respuestaErronea;
    }


}
