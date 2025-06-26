package org.example.JuliethTuberquia;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        //ENTRADA
        Scanner keyentry = new Scanner(System.in);
        Integer MenuPrincipal= null;

        //menu
        System.out.println("\n********************************************");
        System.out.println("**************🌤 BIENVENIDO/A RESTAURANTE EL CIELO 🌤");
        System.out.println("1. Registrar empleado");
        System.out.println("2. Regiatrar plato ");
        System.out.println("3. Ver empleados");
        System.out.println("4. Ver platos ");
        System.out.println("5. Salir");

        System.out.println("Digite la opcion:");
        MenuPrincipal=keyentry.nextInt();

        while (true){
            try {
               if (){

                } else if () {

               } else if () {

               } else if () {

               } else if () {

               }
            } catch(Exception error){
                System.out.println(error.getMessage());
            }
        }

    }
}