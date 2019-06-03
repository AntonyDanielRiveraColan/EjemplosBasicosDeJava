package com.example.javabasico.javabasico.ejemplosbasicos;

public class UsoDeCadena {

  /**En el sigt metodo si es negativo es que se diferente.
   */
  public static void main(String... args) {
    String texto1 = "cadena 1";
    String texto2 = "cadena 2";
    String cadena = "MitoCodeHolaMundo";
    String recorte = cadena.substring(1, 4);
    String recorte2 = cadena.substring(2);
    int resultado = texto1.compareTo(texto2);
    int pos = texto1.indexOf("e");
    System.out.print(resultado + " \n" + pos + " \n" + recorte + " \n" + recorte2);
  }

}
