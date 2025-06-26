package org.example.JuliethTuberquia;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class MenuPrincipal {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        String Rojo ="\u001B[31m";
        String Azul ="\u001B[34m";

        String Reset ="\u001B[0m";

        //ENTRADA
        Scanner keyentry = new Scanner(System.in);
        Integer MenuPrincipal= null;
        ArrayList<Object> empleados = new ArrayList<>();

        //menu
        System.out.println("\n********************************************");
        System.out.println(Azul + "**************🌤 BIENVENIDO/A RESTAURANTE EL CIELO 🌤" + Reset);
        System.out.println("1. Registrar empleado");
        System.out.println("2. Regiatrar plato ");
        System.out.println("3. Ver empleados");
        System.out.println("4. Ver platos ");
        System.out.println("5. Salir");

        System.out.println("Digite la opcion:");
        MenuPrincipal=keyentry.nextInt();

        while (true){
            HashMap<String, Object> diccionario = new HashMap<>();
            try {
               if (MenuPrincipal == 1){
                   System.out.print("Digita el ID del empleado: ");
                   diccionario.put("ID", keyentry.nextInt());

                   System.out.print("Digita el nombre del empleado: ");
                   diccionario.put("Nombre", keyentry.nextLine());

                   System.out.print("Digita la fecha de nacimiento del empleado: ");
                   diccionario.put("FechaNacimiento", keyentry.nextFloat());

                   System.out.print("Digita el cargo del empleado: ");
                   diccionario.put("Cargo", keyentry.nextLine());

                   System.out.print("Digita el salario del empleado: ");
                   diccionario.put("Salario", keyentry.nextFloat());

                }
            } catch(Exception error){
                System.out.println(error.getMessage());
            }
        }

    }
}