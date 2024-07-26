package com.example.nuevo.Persona.Adapter.in.actualizarPersona;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.nuevo.DataBaseConfig;
import com.mysql.cj.jdbc.CallableStatement;

public class ExisteCliente {

    public boolean verificarCliente(String numeroDocumento) {

        Connection connection = null;
                
        CallableStatement stmt = null;
        DataBaseConfig.getConnection();
        ResultSet rs = null;

        try {
            connection = DataBaseConfig.DBconnection;
            String sql = "{call consultarPersona (?)}";
            stmt = (CallableStatement) connection.prepareCall(sql);
            stmt.setString(1, numeroDocumento);

            System.out.println("Buscando cliente con el documento: " + numeroDocumento);

            boolean hasResult = stmt.execute();

            if (!hasResult) {
                System.out.println("Error al buscar el cliente o no existe");
                return false;
            } else {
                rs = stmt.getResultSet();
                if (!rs.isBeforeFirst()) {
                    System.out.println("Cliente no encontrado en la base de datos");
                    return false;
                } else {
                    // Aquí deberías implementar el método para imprimir los resultados
                    //imprimirEnPlacaCliente.imprimir(rs);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            // Cierre de recursos en el bloque finally
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}
