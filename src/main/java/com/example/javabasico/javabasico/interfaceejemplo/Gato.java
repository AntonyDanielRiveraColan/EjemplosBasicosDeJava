package com.example.javabasico.javabasico.interfaceejemplo;

public class Gato implements Animal, SerVivo {

  @Override
  public void mostrarTipoAnimal() {
    System.out.println("Soy un mamifero, perro");
  }

  @Override
  public String mostrarNombre() {
    return "Kaiser";
  }

  @Override
  public void mostrarVida() {
    System.out.println("Estoy 100% Vivo");
  }
}
