package com.ejercicioapirest.conversor.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {
    private double litros;

    @GetMapping("/convertirGalonesALitros")
    public String convertirGalonesALitros(@RequestParam int cantGalones){
        double cantLitrosPorGalon = 3.78541;
        litros = cantGalones * cantLitrosPorGalon;
        String respuesta = "La cantidad de litros equivalentes a " + cantGalones + " galones es de: " + litros;
        return respuesta;
    }
}
