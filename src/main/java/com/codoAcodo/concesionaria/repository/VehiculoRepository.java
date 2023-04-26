package com.codoAcodo.concesionaria.repository;

import com.codoAcodo.concesionaria.entity.Vehiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class VehiculoRepository {
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    public int crearRegistro(Vehiculo vehiculo){
        int cantidad = listaVehiculos.size();
        int total;
        listaVehiculos.add(vehiculo);
        if(listaVehiculos.size() > cantidad){
            return listaVehiculos.size() -cantidad;
        }
        return 0;
    }


}
