package com.example.nuevo.Habilidad.Adapter.out;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

import com.example.nuevo.Habilidad.MainHabilidad;
import com.example.nuevo.Habilidad.Domain.entity.habilidad;
import com.example.nuevo.Habilidad.Domain.service.servicioCrearHabilidad;
import com.example.nuevo.Habilidad.Utilidades.imprimirHabilidad;
import com.example.nuevo.Main.DataBaseConfig;
import com.example.nuevo.Persona.MainPersona;
import com.example.nuevo.Persona.Utilidades.imprimirDatosPersona;

public class repoCrearHabilidad implements servicioCrearHabilidad {

    @Override
    public void crearHabilidad(habilidad habilidad) {
     System.out.println("Entra a la db de habilidad");  

        CallableStatement stmt = null;
        
        // Asegúrate de obtener la conexión de la base de datos
        DataBaseConfig dbConfig = DataBaseConfig.getConnection();
        Connection connection = DataBaseConfig.DBconnection;
        
        if (connection == null) {
            System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
            MainPersona.main();
        }

        try {
            String sql = "{call crearHabilidad (?)}";
            stmt = connection.prepareCall(sql);

            // Ajusta los índices y los parámetros según la definición del procedimiento
            stmt.setString(1, habilidad.getNombre());


            System.out.println("creando habilidad...");

            try {
                boolean hasResult = stmt.execute();

                if (!hasResult) {
                    System.out.println("Error al crear la habilidad");

                } else {

                    ResultSet rs = stmt.getResultSet();

                    imprimirHabilidad imprimirHabilidad = new imprimirHabilidad(); 

                    imprimirHabilidad.imprimir(rs);

                    System.out.println("Habilidad creado con éxito.");



                }

            } catch (SQLIntegrityConstraintViolationException b) {
                System.out.println("error" + b);
                
            } finally {
                MainHabilidad.main();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /* try {
                if (stmt != null) stmt.close();
                if (connection != null && !connection.isClosed()) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            } */

            MainHabilidad.main();
        }


    }

}
