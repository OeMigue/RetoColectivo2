package Braihan;
import javax.swing.plaf.ActionMapUIResource;
import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        /*Colores*/
        String Rojo = "\u001B[31m";
        String Verde = "\u001B[32m";
        String Negro = "\u001B[30m";
        String Azul = "\u001B[34m";
        String Reset = "\u001B[0m"; /*Resetear el color*/



        /*Variables*/
        Integer opcionUsuario = 0;


        while(true){
            /*ArrayList*/
            ArrayList<HashMap<String, Object>> Empleados = new ArrayList<>();
            ArrayList<HashMap<String, Object>> Platos = new ArrayList<>();
            /*Diccionarios*/
            HashMap<String, Object>Empleado = new HashMap<>(); /*Diccionario de empleado*/
            HashMap<String, Object>Plato = new HashMap<>();/*Diccionario plato*/
            /*Menu*/
            System.out.println(Azul + "Bienvenido al restaurante el cielo" + Reset);
            System.out.println(Azul + "Estas son nuestras opciones:" + Reset);
            System.out.println(Rojo + "**********************************" + Reset);
            System.out.println(Azul + "1.Registrar empleado \n2.Registrar plato \n3.Ver empleado \n4.Ver platos \n5.Salir");
            System.out.print("Tu opcion:");
            opcionUsuario = sc.nextInt();
            sc.nextLine();
            try{
                if(opcionUsuario == 1){
                    System.out.println("Area para registrar tu empleado");
                    System.out.println("*****************************");
                    System.out.print("Id del empleado:");
                    Empleado.put("id:", sc.nextInt());
                    sc.nextLine();
                    System.out.print("Nombre del empleado:");
                    Empleado.put("Nombre", sc.nextLine());
                    System.out.print("Fecha de nacimiento del empleado:");
                    Empleado.put("FechaNacimiento", sc.nextLine());
                    System.out.print("Cargo:");
                    sc.nextInt();
                    Empleado.put("Cargo", sc.nextInt());
                    System.out.println("Listo, empleado registrado: " + Empleado);
                    Empleados.add(Empleado);
                    System.out.println("Salario del empleado:");
                    Empleado.put("Salario", sc.nextInt());
                    System.out.println("Desea añadir otro empleado?:");
                }else if (opcionUsuario == 2){
                    System.out.println("Area para registrar tu plato");
                    System.out.println("*****************************");
                    System.out.print("Id del plato:");
                    Plato.put("id:", sc.nextInt());
                    sc.nextLine();
                    System.out.print("Nombre del plato:");
                    Plato.put("Nombre", sc.nextLine());
                    System.out.print("Ingredientes:");
                    Plato.put("Ingredientes:", sc.nextLine());
                    System.out.print("Precio:");
                    Plato.put("precio", sc.nextInt());
                    System.out.println("Este es tu plato" + Plato);
                    Platos.add(Plato);
                }else if(opcionUsuario == 3){
                    System.out.println("esta es nuestra lista de empleados:");
                    for(HashMap<String, Object> Emp : Empleados){
                        Object Nombre = Empleado.get("Nombre");
                        Object Cargo = Empleado.get("Cargo");
                        System.out.println("Nombre:" + Nombre  + "Cargo" + Cargo);
                    }
                }else if(opcionUsuario == 4){
                    System.out.println("esta es tu lista de platos: ");
                    for (HashMap<String, Object> Plat : Platos){
                        Object Nombre = Plato.get("Nombre");
                        Object Ingredientes = Plato.get("Ingredientes");
                        Object Precio = Plato.get("Precio");
                        System.out.println("Plato: " + Nombre + " Ingredientes " + Ingredientes + " Precio " + Precio);
                    }
                }else{
                    System.out.println(Rojo + "Opcion no valida :(" + Reset);
                }
            }catch (Exception error){
                System.out.println("Opcion no valida");
            }
        }
    }
}
