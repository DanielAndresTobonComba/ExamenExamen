package com.example.nuevo;


import java.util.ArrayList;
import java.util.List;

import com.example.nuevo.ClasesAbstractas.Funcionalidad;
import com.example.nuevo.Habilidad.Application.crearHabilidad;
import com.example.nuevo.Persona.Application.actualizarPersona;
import com.example.nuevo.Persona.Application.crearPersona;
import com.example.nuevo.Persona.Application.eliminarPersona;


public class CasesListController {


    public static List<Funcionalidad> lstFUncionesPersona; 
    public static List<Funcionalidad> lstFuncionesHabilidad;


    private static CasesListController CONTROLLER = new CasesListController();

    private CasesListController() {

        lstFUncionesPersona = new ArrayList<>();
        lstFuncionesHabilidad = new ArrayList<>();


        Funcionalidad crearPersona = new crearPersona("Crear persona"); 
        Funcionalidad eliminarPersona = new eliminarPersona("Eliminar persona"); 
        Funcionalidad actualizarPersona = new actualizarPersona("Actualizar persona"); 

        lstFUncionesPersona.add(crearPersona); 
        lstFUncionesPersona.add(actualizarPersona); 
        lstFUncionesPersona.add(eliminarPersona);


        Funcionalidad crearHabilidad = new crearHabilidad("Crear habilidad");

        lstFuncionesHabilidad.add(crearHabilidad);


        
    }

    public static CasesListController getController() {
        return CONTROLLER;
    }

    


}

