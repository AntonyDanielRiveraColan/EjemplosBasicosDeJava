package com.example.javabasico.javabasico.ejemplosbasicos;

import java.lang.reflect.Array;

public class CicloFor {
  /**
 * Metodo principal.
 * */
  public static void main(String[] args) {
    String[] lista = {"Youtube", "Facebook", "etc"};

    /** for (int i = 0; i < 10; i++) {
     if (i==2){
     continue;
     }
     else if (i == 8)
     break;
     System.out.println("El contador esta en " + i);
     } */
    /**
    for (int i = 0; i < lista.length; i++) {
    System.out.println(lista[i]);
    } */

    for (String s : lista){
      System.out.println(s);
    }

  }

}
