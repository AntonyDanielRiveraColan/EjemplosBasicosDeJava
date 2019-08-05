package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionesIterador {
  /**El metodo es el principal.*/
  public static void main(String[] args) {
    List<String> lista = new ArrayList();
    lista.add("Mito Code ");
    lista.add("Suscribete");
    lista.add("Aprende facil");

    /* for (String s:lista){
             System.out.println(s);
        }*/

    Iterator<String> iterador = lista.iterator();
    while (iterador.hasNext()) {
      System.out.println(iterador.next());
    }

  }
}
