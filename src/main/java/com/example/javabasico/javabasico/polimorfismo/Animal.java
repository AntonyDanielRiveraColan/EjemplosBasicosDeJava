package com.example.javabasico.javabasico.polimorfismo;

public abstract class Animal {
  private String nombre;
  private String tipoAlimentacion;
  private int edad;

  /**Constructor. */
  public Animal(String nombre, String tipoAlimentacion, int edad) {
    this.nombre = nombre;
    this.tipoAlimentacion = tipoAlimentacion;
    this.edad = edad;
  }

  public Animal() {
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTipoAlimentacion() {
    return tipoAlimentacion;
  }

  public void setTipoAlimentacion(String tipoAlimentacion) {
    this.tipoAlimentacion = tipoAlimentacion;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public abstract void alimentacion();

  public  void movimiento() {
    System.out.println("El animal se esta moviendo");

  };

}
