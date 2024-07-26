package com.example.nuevo.Persona.Adapter.out;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

import com.example.nuevo.DataBaseConfig;
import com.example.nuevo.Persona.MainPersona;
import com.example.nuevo.Persona.Domain.entity.Persona;
import com.example.nuevo.Persona.Domain.service.servicioCrearPersona;

public class repoCrearPersona implements servicioCrearPersona {

    @Override
    public void crearPersona(Persona persona) {
        CallableStatement stmt = null;
        
        // Asegúrate de obtener la conexión de la base de datos
        DataBaseConfig dbConfig = DataBaseConfig.getConnection();
        Connection connection = DataBaseConfig.DBconnection;
        
        if (connection == null) {
            System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
            return;
        }

        try {
            String sql = "{call crearPersona (?, ?, ?, ?, ?, ? , ?)}";
            stmt = connection.prepareCall(sql);

            // Ajusta los índices y los parámetros según la definición del procedimiento
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setInt(3, persona.getEdad());
            stmt.setInt(4, persona.getIdCiudad());
            stmt.setInt(5, persona.getIdGenero());
            stmt.setString(6, persona.getCorreo());
            stmt.setString(7, persona.getDireccion());

            System.out.println("creando persona...");

            try {
                boolean hasResult = stmt.execute();

                if (!hasResult) {
                    System.out.println("Error al crear a la persona");

                } else {

                    ResultSet rs = stmt.getResultSet();
                    System.out.println("\nPERSONA CREADA");

                    System.out.println("+----+-------------------------------+----------+-------------------------------+-----+-------------------------------+------------+----------+");
                    System.out.printf("| %-5s | %-30s | %-30s | %-5s | %-30s | %-5s | %-30s | %-10s | %-8s |\n", "ID", "Nombre", "Apellido", "Edad", "Dirección", "Edad", "Correo", "IdGenero", "IdCiudad");
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

                        System.out.printf("| %-5d | %-30s | %-30s | %-5d | %-30s | %-5d | %-30s | %-10d | %-8d |\n", id, nombre, apellido, edad, direccion, edad, correo, idGenero, idCiudad);
                    }

                    System.out.println("+----+-------------------------------+----------+-------------------------------+-----+-------------------------------+------------+----------+");

                    System.out.println("Cliente creado con éxito.");

                    MainPersona.main();

                }

            } catch (SQLIntegrityConstraintViolationException b) {
                String mensaString = b.getMessage();
                if (mensaString.contains("TipoDocumento_id")) {
                    System.out.println("Error: El tipo de documento es inválido.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (connection != null && !connection.isClosed()) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
