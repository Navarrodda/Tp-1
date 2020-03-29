package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Generi generico = new Generi<Person>();
        Person David = new Person("David","Navarro",24);
        Person Luis = new Person("Luis","Perez",30);

        generico.add(1);
        generico.add(1112);
        generico.add(100);
        boolean flag = (boolean) generico.existe(1200);
        if(flag){
            System.out.println("Exist");
        }
        else
        {
            System.out.println("Does not Exist");
        }
        System.out.println(generico);
        int max = (int) generico.max();
        int min  =(int) generico.min();
      //  Person min = (Person)generico.min();
       // Person max = (Person)generico.max();
         System.out.println("Max is:" + " "+max+"\n");
        System.out.println("Min is:" + " "+min+"\n");
        int another_max = (int) generico.another_max();
        int another_min  =(int) generico.another_min();
        System.out.println("Another Max is:" + " "+another_max+"\n");
        System.out.println("Another Min is:" + " "+another_min+"\n");
        int last = (int) generico.the_last_to_remover();
        System.out.println("Ultimo elemento del string:" + " "+last+"\n");
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Escribe una de las un dato");
         int data = sn.nextInt();
        generico.add(data);
        System.out.println(generico);
        System.out.println ("Por favor introduzca una cadena por teclado:");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
        int opcion; //Guardaremos la opcion del usuario


        while (!salir) {

            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}

