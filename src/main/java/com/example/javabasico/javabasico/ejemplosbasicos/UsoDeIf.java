package com.example.javabasico.javabasico.ejemplosbasicos;

public class UsoDeIf {

  /**
   * En el sgt metodo se realiza una estructura condicional basica. A continuacion el detalla de
   * algunos operadores
   * = asignacion
   * == comparacion
   * != comparacion con negacion
   * >< =
   */

  public static void main(String... args) {
    int x = 8;
    String mensaje;
    if (x > 50 == true) {
      System.out.println("Esta es una sentencia if");
    } else if (x > 20 == true) {
      System.out.println("Esta es una sentencia else if");
    } else {
      System.out.println("Esta es porque ninguna de las anteriores es verdadera");
    }

    //Forma abreviada

    mensaje = (x > 10) ? "Si la condicion es correcta" : "Respuesta por defecto";

    System.out.println(mensaje);

  }
}
