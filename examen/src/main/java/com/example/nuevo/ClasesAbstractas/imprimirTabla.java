package com.example.nuevo.ClasesAbstractas;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public abstract class imprimirTabla {
    
    public abstract void imprimir (ResultSet rs) throws SQLException ;

}
