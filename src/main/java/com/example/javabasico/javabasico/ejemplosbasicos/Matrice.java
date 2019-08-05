package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.Scanner;

public class Matrice {


  public static void main(String[] args) {
    // LlenadoDeMatris();
    imprimirDiagonal();
  }

  private static void imprimirDiagonal() {
    int[][] numeros = new int[3][3];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Ingresa los datos para la columna " + i + " fila " + j);
        numeros[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {

        if (i == j) {
          System.out.print(numeros[i][j] + "\t");
        }

        else {
                    System.out.print(0); }
      }
      System.out.println("\n");
    }

  }

  private static void LlenadoDeMatris() {
    int[][] numeros = new int[3][3];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Ingresa los datos para la columna " + i + " fila " + j);
        numeros[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(numeros[i][j] + "\t");
      }
      System.out.println("\n");
    }

  }
}
