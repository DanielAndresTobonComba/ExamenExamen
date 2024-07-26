package com.example.nuevo.Persona;


import java.util.List;
import java.util.Scanner;

import com.example.nuevo.CasesListController;
import com.example.nuevo.Main;
import com.example.nuevo.ClasesAbstractas.Funcionalidad;
import com.example.nuevo.Utilidades.CheckInt;
import com.example.nuevo.Utilidades.CheckString;

public class MainPersona {

    public static void main() {
        

    
            List<Funcionalidad> lista = CasesListController.getController().lstFUncionesPersona;
    
    
            Scanner sc = new Scanner(System.in);
            System.out.println("===================================");
            System.out.println("          MENU PERSONA");
            System.out.println("===================================");
    
/*             System.out.print("Documento >>>> ");
            String numeroDocumento = CheckString.check("Digita el documento de nuevo"); */
/*     
            if (!existenciaCliente.verificarCliente(numeroDocumento)) {
                System.out.println("Presiona Enter para volver al menú");
                sc.nextLine();
                MainCliente.main(null); // Llama al método main del Main para volver al menú principal
                return;
            }  */
    
/*             System.out.println("===================================");
            System.out.println("          MENU DE ACTUALIZACIÓN");
            System.out.println("==================================="); */
    
            int item = 1;
            for (Funcionalidad atributo : lista) {
                System.out.println(item + ". " + atributo.enunciado + "\n");
                item++;
            }
    
            System.out.println(item + ". " + "Salir");
    
            System.out.print("\nOpcion >>>> ");
    
            int opcion = 0;
            boolean checkOption = false;
    
            while (!checkOption) {
                opcion = CheckInt.check("Digita de nuevo la opcion");
                if (opcion >= 1 && opcion <= lista.size() + 1) {
                    checkOption = true;
                } else {
                    System.out.println("Opcion incorrecta");
                }
            }
    
            if (opcion <= lista.size()) {
                lista.get(opcion - 1).ejecutar();
            } else {
                Main.main(null); // Llama al método main del Main para volver al menú principal
            }
        }

        
    
}




