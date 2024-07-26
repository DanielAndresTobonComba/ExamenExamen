package com.example.nuevo.Persona.Adapter.in.actualizarPersona;

import com.example.nuevo.Persona.Adapter.out.repoCrearPersona;
import com.example.nuevo.Persona.Application.crearPersona;
import com.example.nuevo.Persona.Domain.entity.Persona;
import com.example.nuevo.Persona.Utilidades.CheckInt;
import com.example.nuevo.Persona.Utilidades.CheckString;

public class controladorCrearPersona {

    private final crearPersona crearPersona;

    

    public controladorCrearPersona(com.example.nuevo.Persona.Application.crearPersona crearPersona) {
        this.crearPersona = crearPersona;
    }



    public void tomarDatos () {
        System.out.println("LLEGUE A TOMAR DATOS");

        System.out.println("Digita el nombre");
        String nombre = CheckString.check("Digita de nuevo el nombre"); 

        System.out.println("Digita el apellido");
        String apellido = CheckString.check("Digita de nuevo el apellido"); 

        System.out.println("Digita la direcciòn");
        String direccion = CheckString.check("Digita de nuevo la direccion");

        System.out.println("Digita la edad");
        int edad = CheckInt.check("Digita de nuevo la edad"); 

        System.out.println("Digita el id de la ciudad");
        int idCiudad = CheckInt.check("Digita de nuevo el id"); 

        System.out.println("Digita el id del genero");
        int idGenero = CheckInt.check("Digita de nuevo el id ");

        System.out.println("Digita el correo");
        String correo = CheckString.check("Digita de nuevo el correo");

        
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDireccion(direccion);
        persona.setCorreo(correo);
        persona.setEdad(edad);
        persona.setIdCiudad(idCiudad);
        persona.setIdGenero(idGenero);




        repoCrearPersona ejecuCrearPersona = new repoCrearPersona(); 
        ejecuCrearPersona.crearPersona(persona);
    }

}
