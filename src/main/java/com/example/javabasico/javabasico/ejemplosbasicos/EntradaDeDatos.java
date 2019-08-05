package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.Scanner;

public class EntradaDeDatos {

  /**El siguiente es el metodo principal.*/
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Cual es tu nombre");

    String nombre = input.next();

    System.out.println("Tu nombre es : " + nombre);

    //Almacenar numeros

    System.out.println("Ingrese su edad");

    int numero = input.nextInt();

    System.out.println("Su edad ingresada es : " + numero);
    System.out.println("=================================");
    System.out.println("   ");
    System.out.println(nombre + "  su edad es  =>  " + numero + " Felicitaciones!!!");
  }
}
