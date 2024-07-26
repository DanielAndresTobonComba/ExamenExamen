package com.example.nuevo.Persona.Application;

import com.example.nuevo.ClasesAbstractas.Funcionalidad;
import com.example.nuevo.Persona.Adapter.in.actualizarPersona.controladorCrearPersona;
import com.example.nuevo.Persona.Adapter.out.repoCrearPersona;
import com.example.nuevo.Persona.Domain.entity.Persona;
import com.example.nuevo.Persona.Domain.service.servicioCrearPersona;

public class crearPersona extends Funcionalidad{

    private servicioCrearPersona servicio;

 
    public crearPersona(servicioCrearPersona servicio) {
        this.servicio = servicio;
    }

    public crearPersona(String enunciado) {
        this.enunciado = enunciado;

    }

    @Override
    public void ejecutar() {

        servicioCrearPersona servicioCrearPersona = new repoCrearPersona(); 

        crearPersona crearPersona = new crearPersona(servicioCrearPersona); 

        controladorCrearPersona adaptador = new controladorCrearPersona(crearPersona);

        adaptador.tomarDatos();

    } 



    }


