package com.example.javabasico.javabasico.ejemplosbasicos;

public class StringOCadenasDeTexto {

  /**
   * En el sgt metodo principal. Se puede ver las diferentes manera de poder trabajar una cadena
   */

  public static void main(String[] args) {
    String texto = "MitoCode";
    String texto2 = "Suscribete";

    //Toma la posicion que se le ingresa
    char captura = texto.charAt(1);
    System.out.println(captura);

    //Realiza una comparacion de igualdad negativo si son diferentes y 0 si son iguales
    int resultado;
    resultado = texto.compareTo(texto2);
    System.out.println(resultado);

    //Encontrar un caracter con el dato ingreado
    boolean resultado2;
    resultado2 = texto2.contains("o");
    System.out.println(resultado2);

    //Posicion donde se encontro la primera coincidencia
    int pos = texto.indexOf("o");
    System.out.println(pos);

    //Extraer una porcion de texto
    String recorte;
    recorte = texto.substring(1, 4);
    System.out.println(recorte);

    //cantidad de elementos de la cadena
    int cantidad;
    cantidad = texto.length();
    System.out.println(cantidad);
  }
}
