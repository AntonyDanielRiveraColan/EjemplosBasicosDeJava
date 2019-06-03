package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.Scanner;

public class CicloWhile {

  /**
   * Esta estructura nos ayuda a ingresar condiciones realizar bucles finitos e infinitos.
   */
  public static void main(String[] args) {
    boolean condicion = true;
    int contado = 0;
    String nombre = "";
    /**
     while (contado < 50){
     System.out.println("Suscribete");
     contado++;
     } */

    while (!nombre.equals("Antony")) {
      System.out.println("No eres tu");
      Scanner scanner = new Scanner(System.in);
      nombre = scanner.next();
    }
    System.out.println("Hola " + nombre);
  }

}
