package com.example.nuevo.Habilidad.Utilidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.nuevo.ClasesAbstractas.imprimirTabla;

public class imprimirHabilidad extends imprimirTabla {

    @Override
    public void imprimir(ResultSet rs) throws SQLException {
        System.out.println("\nHABILIDAD CREADA");

        System.out.println("+----+-------------------------------+----------+-------------------------------+");
        System.out.printf("| %-5s | %-50s |\n", "ID", "Nombre");
        System.out.println("+----+-------------------------------+----------+-------------------------------+");

        while (rs.next()) {
            // Obtener y mostrar los datos del cliente creado
            int id = rs.getInt("id");
            String nombre = rs.getString("name");


            System.out.printf("| %-5d | %-50s |\n", id, nombre);
        }

        System.out.println("+----+-------------------------------+----------+-------------------------------+");
    }

}
