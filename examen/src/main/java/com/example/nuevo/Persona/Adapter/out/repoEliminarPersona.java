package com.example.nuevo.Persona.Adapter.out;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

import com.example.nuevo.Main.DataBaseConfig;
import com.example.nuevo.Persona.MainPersona;
import com.example.nuevo.Persona.Domain.service.servicioEliminarPersona;
import com.example.nuevo.Persona.Utilidades.imprimirDatosPersona;

public class repoEliminarPersona implements servicioEliminarPersona {

    @Override
    public void eliminarPersona(int id) {

        CallableStatement stmtBuscar = null;
        CallableStatement stmtEliminar = null;
        DataBaseConfig dbConfig = DataBaseConfig.getConnection();
        Connection connection = DataBaseConfig.DBconnection;

        try {
            // Obtener la conexión de la base de datos

            
            if (connection == null) {
                System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
                return; // Salir del método en caso de fallo en la conexión
            }

            // Buscar la persona
            String sqlBuscar = "{call consultarPersona (?)}";
            stmtBuscar = connection.prepareCall(sqlBuscar);
            stmtBuscar.setInt(1, id);

            System.out.println("Buscando persona con la id " + id + "...");

            boolean hasResult = stmtBuscar.execute();
            
            if (hasResult) {
                ResultSet rs = stmtBuscar.getResultSet();
                imprimirDatosPersona imprimirDatosTarifa = new imprimirDatosPersona();
                imprimirDatosTarifa.imprimir(rs);
                rs.close();
            } else {
                System.out.println("No se encontró la persona con la id " + id);
                return; // Salir del método si no se encuentra la persona
            }

            // Eliminar la persona
            String sqlEliminar = "{call eliminarPersona(?)}";
            stmtEliminar = connection.prepareCall(sqlEliminar);
            stmtEliminar.setInt(1, id);



            System.out.println("Eliminando persona con la id " + id + "...");
            stmtEliminar.execute();

            if (!hasResult) {
                System.out.println("Pesona eliminada con éxito.");
                MainPersona.main();  
            }else {
                System.out.println("Proceso finalizado");
            }

            


            
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad al eliminar la persona: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        } finally {
            // Cerrar recursos y manejar la conexión en el bloque finally
            

            // Regresar al menú principal en caso de error o éxito
            MainPersona.main();
        }
    }
}
