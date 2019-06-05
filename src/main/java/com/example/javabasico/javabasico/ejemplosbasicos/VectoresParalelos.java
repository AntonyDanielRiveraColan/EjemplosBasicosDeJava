package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.Scanner;

public class VectoresParalelos {

  public static void main(String[] args) {

    // metodoParaIngresarNombresYEdades();
   // metodoParaDetectarElMayorElemento();
    metodoParaDetectarElMenorElemento();
  }

  private static void metodoParaDetectarElMenorElemento() {
    String[] nombres = new String[3];
    int[] numeros = new int[3];
    int posicion= 0;


    for (int i=0; i<3;i++){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingresa el nombre :");
      nombres[i] = scanner.next();
      System.out.println("Ingresa la edad :");
      numeros[i] = scanner.nextInt();
    }

    int menor = numeros[0];

    for (int i=0;i<nombres.length;i++){
      if (menor>numeros[i]){
        menor=numeros[i];
        posicion= i;
      }
    }
    System.out.println("El nombre del menor es " + nombres[posicion] +" su edad es "+ menor);

  }

  private static void metodoParaDetectarElMayorElemento() {
//Creacion de variables
    String[] nombres = new String[3];
    int[] edades = new int[3];

//Llenado de las variables
for (int i=0; i<3; i++){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Ingrese su nombre ");
  nombres[i] = scanner.next();
  System.out.println("Ingrese su edad ");
  edades[i] = scanner.nextInt();
}

 System.out.println("_____________________________________");
//Encontrar el mayor elemento
    int mayor = edades[0];
    int posicionReferencia=0;
    for (int i=0;i<nombres.length;i++){
      if (mayor<edades[i]){
        mayor=edades[i];
        posicionReferencia=i;
      }
    }
    System.out.println("El nombre del mayor es " + nombres[posicionReferencia] +" su edad es "+ mayor);

  }

  private static void metodoParaIngresarNombresYEdades() {
//Creacion de variables
    String[] nombres = new String[3];
    int[] edades = new int[3];

//Llenado de arreglos
    for (int i = 0; i < 3; i++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingresa nombre: ");
      nombres[i] = scanner.next();
      System.out.println("Ingresa edad: ");
      edades[i] = scanner.nextInt();
    }

    /**
     //Salida o impresion de los datos
     for (int i = 0; i < 3; i++) {
     System.out.println("El nombre es " + nombres[i] + " su edad es : " + edades[i]);
     }

     System.out.println(" ");
     System.out.println(" Solo los mayores a 20 años  ");
     System.out.println(" =======================================================");

     for (int i = 0; i < 3; i++) {
     if (edades[i] > 20) {
     System.out.println("El nombre es " + nombres[i] + " su edad es : " + edades[i]);
     }
     }

     */
  }


}
