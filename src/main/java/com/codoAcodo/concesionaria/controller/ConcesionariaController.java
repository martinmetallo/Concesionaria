package com.codoAcodo.concesionaria.controller;

import com.codoAcodo.concesionaria.dto.request.VehiculoDto;
import com.codoAcodo.concesionaria.dto.response.ResponseVehiculoDto;
import com.codoAcodo.concesionaria.service.VehiculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api")
public class ConcesionariaController {

 VehiculoService service;

 public ConcesionariaController(VehiculoService vehiculoService){
  service = vehiculoService;
 }


 @PostMapping("/agregar")
 public ResponseEntity<ResponseVehiculoDto> agregarVehiculo(@RequestBody VehiculoDto vehiculoDto){
  return new ResponseEntity<>( service.agregarVehiculo(vehiculoDto), HttpStatus.OK);
 }



}
