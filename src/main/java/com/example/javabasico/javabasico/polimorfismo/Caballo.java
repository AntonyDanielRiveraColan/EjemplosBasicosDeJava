package com.example.javabasico.javabasico.polimorfismo;

public class Caballo extends Animal {

  public Caballo(String nombre, String tipoAlimentacion, int edad) {
    super(nombre, tipoAlimentacion, edad);
  }

  public Caballo() {
  }

  @Override
  public void alimentacion() {
    System.out.println("Yo como hierba");
  }


}
