package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.Scanner;

public class Vectores {

  public static void main(String[] args) {
    System.out.println("Ingrese el tamaño del vector");
    Scanner scanner = new Scanner(System.in);
    int tamano = scanner.nextInt();

    String[] lista = new String[tamano];

    for (int i = 0; i < lista.length; i++) {
      System.out.println("Ingrese contenido para la posicion " + i + " : ");
      lista[i] = scanner.next();
    }

    System.out.println("__________________________________");

    for (String s : lista) {
      System.out.println(s);
    }

  }
}
