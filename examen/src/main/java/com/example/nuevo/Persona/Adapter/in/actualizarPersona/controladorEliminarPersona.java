package com.example.nuevo.Persona.Adapter.in.actualizarPersona;

import com.example.nuevo.Persona.CheckInt;
import com.example.nuevo.Persona.Adapter.out.repoEliminarPersona;
import com.example.nuevo.Persona.Application.crearPersona;
import com.example.nuevo.Persona.Application.eliminarPersona;

public class controladorEliminarPersona {

    private final eliminarPersona eliminarPersona;

    public controladorEliminarPersona(com.example.nuevo.Persona.Application.eliminarPersona eliminarPersona) {
        this.eliminarPersona = eliminarPersona;
    }





    public void tomarDatos () {

        System.out.println("Digite el id de la persona");
        int id = CheckInt.check("Digita de nuevo la id");

        repoEliminarPersona eliminarPersona = new repoEliminarPersona(); 
        eliminarPersona.eliminarPersona(id);
    }


}
