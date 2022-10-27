package com.suministros.suministros.controllers;

import com.suministros.suministros.models.Suministro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

@RequestMapping (value = "suministros")
    public List<Suministro> getSuministro(){
        List<Suministro> suministros = new ArrayList<>();

        Suministro suministro = new Suministro();
        suministro.setNombre("Esponja");
        suministro.setCantidad(2);
        suministro.setTipo("Limpieza");

        Suministro suministro2 = new Suministro();
        suministro2.setNombre("Aceite");
        suministro2.setCantidad(1);
        suministro2.setTipo("Comida");

        Suministro suministro3 = new Suministro();
        suministro3.setNombre("Banana");
        suministro3.setCantidad(5);
        suministro3.setTipo("Frutas");

        suministros.add(suministro);
        suministros.add(suministro2);
        suministros.add(suministro3);

       return suministros;

    }
}
