package com.example.javabasico.javabasico.interfaceejemplo;

import com.example.javabasico.javabasico.polimorfismo.Perro;

public class ClasePrincipal {

  /**Metodo principal.*/
  public static void main(String[] args) {
    Gato gato = new Gato();
    System.out.println(gato.mostrarNombre());
    gato.mostrarTipoAnimal();
    gato.mostrarVida();
  }
}
