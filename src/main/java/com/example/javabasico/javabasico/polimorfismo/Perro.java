package com.example.javabasico.javabasico.polimorfismo;

public class Perro extends Animal {
  private String raza;

  public Perro(String nombre, String tipoAlimentacion, int edad, String raza) {
    super(nombre, tipoAlimentacion, edad);
    this.raza = raza;
  }

  public Perro(String raza) {
    this.raza = raza;
  }

  public Perro() {

  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  @Override
  public void alimentacion() {
  System.out.println("Yo como carne " +"y mi raza es "+ raza);
  }


}
