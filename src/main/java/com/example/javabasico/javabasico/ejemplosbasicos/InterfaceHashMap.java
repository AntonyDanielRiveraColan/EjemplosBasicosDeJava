package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.HashMap;

public class InterfaceHashMap {
  /**Metodo principal.*/
  public static void main(String[] args) {
    HashMap diccionario = new HashMap();
    diccionario.put("user", "mitocode");
    diccionario.put("clave", "valor");
    diccionario.put("dato1", "dato2");

    String contenido = diccionario.get("user").toString();
    boolean key = diccionario.containsKey("dato1");
    System.out.println(contenido);
    System.out.println(key);
  }
}
