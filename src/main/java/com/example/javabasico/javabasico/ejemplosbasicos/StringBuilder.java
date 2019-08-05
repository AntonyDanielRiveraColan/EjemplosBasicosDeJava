package com.example.javabasico.javabasico.ejemplosbasicos;

public class StringBuilder {
  /**Metodo principal.*/
  public static void main(String[] args) {

    long tiempoInicio = System.nanoTime();

    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    for (int i = 0; i < 1000; i++) {
      stringBuilder.append(i);
    }
    long tiempoFinal = System.nanoTime();
    double diferencia = tiempoFinal - tiempoInicio;
    System.out.println(diferencia);

    //Ejemplo 2
    long tiempoInicio2 = System.nanoTime();


    for (int i = 0; i < 1000; i++) {
      stringBuilder.append(i);
    }
    long tiempoFina2 = System.nanoTime();
    double diferencia2 = tiempoFina2 - tiempoInicio2;
    System.out.println(diferencia2);
  }
}
