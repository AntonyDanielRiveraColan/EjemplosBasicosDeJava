package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.Scanner;

public class EstructuraSwitch {

  public static void main(String[] args) {
    pruebasSwitch();
  }

  private static void pruebasSwitch() {
    Scanner scanner = new Scanner(System.in);
    String resultado;
    resultado = scanner.next();

    switch (resultado)
    {
      case "Mito":
        System.out.println("Hola Mito 1");
        break;
      case "Code":
        System.out.println("Hola Code 1");
        break;
      default:
        System.out.println("Hola " + resultado);
        break;
    }
    System.out.println("fin del Switch");
  }
}
