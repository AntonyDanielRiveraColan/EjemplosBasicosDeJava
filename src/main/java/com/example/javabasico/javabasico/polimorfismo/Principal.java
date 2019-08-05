package com.example.javabasico.javabasico.polimorfismo;

public class Principal {

  /**Metodo principal.*/
  public static void main(String[] args) {
    Animal p = new Perro("Lobo");
    Animal c = new Caballo();

    p.alimentacion();
    p.movimiento();
    c.alimentacion();
    c.movimiento();
  }
}
