package com.example.javabasico.javabasico.ejemplo;


import java.util.Scanner;

public class PrincipalDelEjemplo {


  public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.setCuenta(1);
    persona1.setNombre("Mito");
    persona1.setMonto(1000);

    Persona persona2 = new Persona();
    persona2.setCuenta(2);
    persona2.setNombre("Code");
    persona2.setMonto(100000);

    Persona persona3 = new Persona();
    persona3.setCuenta(3);
    persona3.setNombre("Jaime");
    persona3.setMonto(10000);

    Scanner scanner = new Scanner(System.in);

    System.out.println("__________________________________________");
    System.out.println("Bienvenido al banco ZYZ Por favor ingrese su numero de cuenta");
    int cuenta = scanner.nextInt();

    switch(cuenta){
      case 1:
        System.out.println("Bienvenido "+persona1.getNombre());
      case 2:
        System.out.println("Bienvenido "+persona2.getNombre());
          break;
      case 3:
        System.out.println("Bienvenido "+persona2.getNombre());
        break;
        default:
          System.out.println("Cuenta no registrada ");
          System.exit(0);

    }


  }
}
