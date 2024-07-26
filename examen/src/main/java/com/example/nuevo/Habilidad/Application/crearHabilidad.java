package com.example.nuevo.Habilidad.Application;

import com.example.nuevo.ClasesAbstractas.Funcionalidad;
import com.example.nuevo.Habilidad.Adapter.in.controladorCrearHabilidad;
import com.example.nuevo.Habilidad.Adapter.out.repoCrearHabilidad;
import com.example.nuevo.Habilidad.Domain.service.servicioCrearHabilidad;
import com.example.nuevo.Persona.Adapter.in.actualizarPersona.controladorCrearPersona;
import com.example.nuevo.Persona.Adapter.out.repoCrearPersona;
import com.example.nuevo.Persona.Application.crearPersona;
import com.example.nuevo.Persona.Domain.service.servicioCrearPersona;

public class crearHabilidad extends Funcionalidad{

    private servicioCrearHabilidad servicio;

 
    public crearHabilidad(servicioCrearHabilidad servicio) {
        this.servicio = servicio;
    }

    public crearHabilidad(String enunciado) {
        this.enunciado = enunciado;

    }

    @Override
    public void ejecutar() {

        servicioCrearHabilidad servicioCrearHabilidad = new repoCrearHabilidad(); 

        crearHabilidad crearHabilidad = new crearHabilidad(servicioCrearHabilidad); 

        controladorCrearHabilidad adaptador = new controladorCrearHabilidad(crearHabilidad);

        adaptador.tomarDatos(); 

       
    }

    

}
