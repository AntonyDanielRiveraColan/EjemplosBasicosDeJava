package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.Scanner;

public class VectoresOrdenados {

  public static void main(String[] args) {

    //ordenarEdades();
    ordenarNombres();

  }

  private static void ordenarNombres() {
    String[] nombre = new String[3];
    int[] edad = new int[3];

    for (int i = 0; i < 3; i++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingresa el nombre : ");
      nombre[i] = scanner.next();
      System.out.println("Ingresa la edad : ");
      edad[i] = scanner.nextInt();
    }

    System.out.println("______________________");

    String aux = "";

    for (int i = 0; i < edad.length - 1; i++) {
      for (int j = 0; j < (edad.length - 1) - i; j++) {
        if ((nombre[j].compareTo(nombre[j + 1]) > 0)) {
          aux = nombre[j];
          nombre[j] = nombre[j + 1];
          nombre[j + 1] = aux;
        }
      }
    }

    for (String valor : nombre) {
      System.out.println(valor);
    }

  }

  private static void ordenarEdades() {
    String[] nombre = new String[3];
    int[] edad = new int[3];

    for (int i = 0; i < 3; i++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingresa el nombre : ");
      nombre[i] = scanner.next();
      System.out.println("Ingresa la edad : ");
      edad[i] = scanner.nextInt();
    }

    System.out.println("______________________" + edad.length);

    int aux = 0;

    for (int i = 0; i < edad.length - 1; i++) {
      for (int j = 0; j < (edad.length - 1) - i; j++) {
        if (edad[j] > edad[j + 1]) {
          aux = edad[j];
          edad[j] = edad[j + 1];
          edad[j + 1] = aux;
        }
      }
    }

    for (Integer valor : edad) {
      System.out.println(valor);
    }

  }
}
