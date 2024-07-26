package com.example.nuevo.Persona.Utilidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.nuevo.ClasesAbstractas.imprimirTabla;


public class imprimirDatosPersona extends imprimirTabla {

    @Override
    public void imprimir(ResultSet rs) throws SQLException {
        System.out.println("\nPERSONA CREADA");

        System.out.println("+----+-------------------------------+----------+-------------------------------+-----+-------------------------------+------------+----------+");
        System.out.printf("| %-5s | %-30s | %-30s | %-5s | %-30s | %-30s | %-10s | %-10s |\n", "ID", "Nombre", "Apellido", "Edad", "Dirección", "Correo", "IdGenero", "IdCiudad");
        System.out.println("+----+-------------------------------+----------+-------------------------------+-----+-------------------------------+------------+----------+");

        while (rs.next()) {
            // Obtener y mostrar los datos del cliente creado
            int id = rs.getInt("id");
            String nombre = rs.getString("name");
            String apellido = rs.getString("lastname");
            String direccion = rs.getString("address");
            int edad = rs.getInt("age");
            String correo = rs.getString("email");
            int idGenero = rs.getInt("idgender");
            int idCiudad = rs.getInt("idcity");

            System.out.printf("| %-5d | %-30s | %-30s | %-5d | %-30s | %-30s |%-10d |%-10d |\n", id, nombre, apellido, edad, direccion, correo, idGenero, idCiudad);
        }

        System.out.println("+----+-------------------------------+----------+-------------------------------+-----+-------------------------------+------------+----------+");
    }
}
