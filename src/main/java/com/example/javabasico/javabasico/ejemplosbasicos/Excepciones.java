package com.example.javabasico.javabasico.ejemplosbasicos;

public class Excepciones {
  private void proceso1() {
    int a = 7, b = 0;
    int division = a / b;
    System.out.println(division);
  }

  /**Metodo principal.*/
  public static void main(String[] args) {
    try {
      //Aqui va el flujo normal
      Excepciones curso = new Excepciones();
      curso.proceso1();
    } catch (NullPointerException e) {
      System.out.println(e);
      //Aqui salta la excepcion
    } catch (ArithmeticException e) {
      System.out.println(e);
      //Aqui salta la excepcion
    } finally {
      System.out.println("Bloque final ");
      //Esto se ejecuta si o si
    }
  }
}
