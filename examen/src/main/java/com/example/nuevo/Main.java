package com.example.nuevo;

import com.example.nuevo.Persona.CheckInt;
import com.example.nuevo.Persona.MainPersona;

public class Main {
    public static void main(String[] args) {

                int opcion = 0;

                // Obtener la instancia de DataBaseConfig
                DataBaseConfig dbConfig = DataBaseConfig.getConnection();

                // Imprimir el mensaje de conexión
                System.out.println(dbConfig.msjConnection);
        
                // Verificar el estado de la conexión
                if (dbConfig.verifyConnection) {
                    System.out.println("Conexión exitosa");
                } else {
                    System.out.println("Fallo en la conexión");
                }


                System.out.println("MENU PRINCIPAL");

                System.out.println("1. Gestion Persona ");


                System.out.print("Opcion >>>> ");
                opcion = CheckInt.check("Digita de nuevo el la opcion");

                switch (opcion) {
                    case 1:
                        
                        MainPersona.main();

                        break;
                    
                    case 2:
                        
                        break;

                    case 3:
                        
                        break;
                    default:
                        break;
                }

    }
}