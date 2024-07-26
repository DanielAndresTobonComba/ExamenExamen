package com.example.nuevo.Persona.Application;

import com.example.nuevo.ClasesAbstractas.Funcionalidad;
import com.example.nuevo.Persona.Adapter.in.actualizarPersona.controladorCrearPersona;
import com.example.nuevo.Persona.Adapter.in.actualizarPersona.controladorEliminarPersona;
import com.example.nuevo.Persona.Adapter.out.repoCrearPersona;
import com.example.nuevo.Persona.Adapter.out.repoEliminarPersona;
import com.example.nuevo.Persona.Domain.service.servicioCrearPersona;
import com.example.nuevo.Persona.Domain.service.servicioEliminarPersona;

public class eliminarPersona extends Funcionalidad {

    private servicioEliminarPersona servicio;

    public eliminarPersona(String enunciado) {
        this.enunciado = enunciado;

    }

    public eliminarPersona(servicioEliminarPersona servicio) {
        this.servicio = servicio;
    }

    @Override
    public void ejecutar() {
        
        servicioEliminarPersona servicioEliminarPersona = new repoEliminarPersona(); 

        eliminarPersona eliminarPersona = new eliminarPersona(servicioEliminarPersona); 

        controladorEliminarPersona adaptador = new controladorEliminarPersona(eliminarPersona);

        adaptador.tomarDatos();
    }
}
