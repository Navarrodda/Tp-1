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
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean exit = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("Option 1. Display the ArrayList ");
            System.out.println("Option 2. Load the list ");
            System.out.println("Option 3. a)Check if an object exists in the array");
            System.out.println("Option 4. b)Return the maximun");
            System.out.println("Option 5. c) Return the minimum");
            System.out.println("Option 6. Maximum and minimum using the ArrayList form");
            System.out.println("Option 7. 2)Delete the last object in the array and return by parameter.");
            System.out.println("1. Opcion 1");
            System.out.println("1. Opcion 1");
            System.out.println("4. Salir");

            try {

                System.out.println("Write one of the options");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println(generico);
                        break;

                    case 2:
                        System.out.println("You have selected the option 1");
                        System.out.println("Load the list with Integers");
                        while(!exit)
                        {
                            System.out.println("Write one of the data");
                            int data = sn.nextInt();
                            generico.add(data);
                            System.out.println ("Please enter \"SI\" to continue loading the node or \"NO\" to exit:");
                            String entradaTeclado = "";
                            Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
                            entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
                            if("NO".equals(entradaTeclado) || "no".equals(entradaTeclado) || "No".equals(entradaTeclado))
                            {
                                System.out.println ("Input received by keyboard is: \"" + entradaTeclado +"\"");
                                exit = true;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Write a data Integers to verify if it is in the ArrayList");
                        int data = sn.nextInt();
                        boolean flag = (boolean) generico.existe(1200);
                        if(flag){
                            System.out.println("Exist");
                        }
                        else
                        {
                            System.out.println("Does not Exist");
                        }
                        break;
                    case 4:
                        int max = (int) generico.max();
                        System.out.println("Max is:" + " "+max+"\n");
                        break;
                    case 5:
                        int min  =(int) generico.min();
                        System.out.println("Min is:" + " "+min+"\n");
                        break;
                    case 6:
                        int another_max = (int) generico.another_max();
                        int another_min  =(int) generico.another_min();
                        System.out.println("Another Max is:" + " "+another_max+"\n");
                        System.out.println("Another Min is:" + " "+another_min+"\n");
                        break;
                    case 7:
                        int last = (int) generico.the_last_to_remover();
                        System.out.println("Last element of the string removed was:" + " "+last+"\n");
                        break;
                    case 8:

                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Only numbers between 1 and 9");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}

