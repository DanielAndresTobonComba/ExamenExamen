package com.example.nuevo.Habilidad.Adapter.in;

import com.example.nuevo.Habilidad.Adapter.out.repoCrearHabilidad;
import com.example.nuevo.Habilidad.Application.crearHabilidad;
import com.example.nuevo.Habilidad.Domain.habilidad;
import com.example.nuevo.Persona.CheckInt;
import com.example.nuevo.Persona.CheckString;
import com.example.nuevo.Persona.Adapter.out.repoEliminarPersona;
import com.example.nuevo.Persona.Application.eliminarPersona;

public class controladorCrearHabilidad {


    private final crearHabilidad crearHabilidad;

    
        public controladorCrearHabilidad(com.example.nuevo.Habilidad.Application.crearHabilidad crearHabilidad) {
        this.crearHabilidad = crearHabilidad;
    }

        public void tomarDatos () {

        System.out.println("Digite el nombre de la habilidad");
        String nombre = CheckString.check("Digita de nuevo el nombre");

        habilidad habilidad = new habilidad();
        habilidad.setNombre(nombre);

        repoCrearHabilidad crearHabilidad = new repoCrearHabilidad(); 

        crearHabilidad.crearHabilidad(habilidad);
        
    }

}
