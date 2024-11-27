package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("*******PAPELERIA TATIANA********");
        System.out.println("*****BIENVENIDOS******");

        //variables
        String nombreArticulo;
        String nombreArticulomax;
        String nombreArticuloMin;
        int cantidadArticulo= 0;
        int cantidadMaxima = 0;
        int cantidadMin = 0;
        boolean menu= true;

        do {
            System.out.println("****Menú****");
            System.out.println("Ingresa el nombre del articulo");
            System.out.println("Ingresa la cantidad");
            System.out.println("Selecciona a si deseas buscar el articulo por su nombre y conocer su cantidad");
            System.out.println("Selecciona b si deseas saber el articulo con mayor cantidad de unidades");
            System.out.println("Selecciona c si deseas saber el articulo con menor cantidad de unidades");
            System.out.println("Selecciona d para salir del sistema");

            String letra = sc.nextLine();
            switch (letra) {
                case "a":
                    System.out.println("Ingresa el nombre del articulo");
                    nombreArticulo = sc.nextLine();

                    System.out.println("Ingresa la cantidad del articulo");
                    cantidadArticulo = sc.nextInt();
                    if (cantidadArticulo > cantidadMaxima) {
                        cantidadMaxima = cantidadArticulo;
                        nombreArticulomax = nombreArticulo;
                    }
                    break;
                case "b":
                    System.out.println("Has seleccionado la opción a, por favor ingresa el nombre el nombre del articulo" + cantidadArticulo);
                    nombreArticulo = sc.nextLine();
                    break;
                case "c":
                    System.out.println("Has seleccionado la opcion b, este es el articulo con mayor cantidad de unidades" + cantidadMaxima);
                    break;
                case "d":
                    System.out.println("Has seleccionado la opcion c, este es el articulo con menor cantidad de unidades" + cantidadMin);
                    break;
                case "e":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("opción seleccionada no valida");
            }
        } while (menu == true);
    }
}