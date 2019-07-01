package com.example.javabasico.javabasico.ejemplo;


import java.util.Scanner;

public class PrincipalDelEjemplo {

    private static Persona persona1 = new Persona();
    private static Persona persona2 = new Persona();
    private static Persona persona3 = new Persona();


    public static void main(String[] args) {

        persona1.setCuenta(1);
        persona1.setNombre("Mito");
        persona1.setMonto(1500);


        persona2.setCuenta(2);
        persona2.setNombre("Code");
        persona2.setMonto(1000);


        persona3.setCuenta(3);
        persona3.setNombre("Jaime");
        persona3.setMonto(500);

        Scanner scanner = new Scanner(System.in);

        System.out.println("__________________________________________");
        System.out.println("Bienvenido al banco ZYZ Por favor ingrese su numero de cuenta");
        int cuenta = scanner.nextInt();

        switch (cuenta) {
            case 1:
                System.out.println("Bienvenido " + persona1.getNombre());
                opcionesImprimir();
                String operacion1 = scanner.next();
                Operaciones(operacion1, 1);

                break;
            case 2:
                System.out.println("Bienvenido " + persona2.getNombre());
                opcionesImprimir();
                String operacion2 = scanner.next();
                Operaciones(operacion2, 2);
                break;
            case 3:
                System.out.println("Bienvenido " + persona3.getNombre());
                opcionesImprimir();
                String operacion3 = scanner.next();
                Operaciones(operacion3, 3);
                break;

            default:
                System.out.println("Cuenta no registrada ");
                System.exit(0);

        }

    }

    private static void Operaciones(String tipooperat, int numero) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("____________________________________");
        System.out.println("Ingrese el monto ");
        double montoDeposito = scanner.nextDouble();

        if (numero == 1) {
            double montoAnterior = persona1.getMonto();
            double montoAnteriorMandar = montoAnterior;
            double resp = calcular(montoDeposito, tipooperat, montoAnteriorMandar);
            System.out.println("El monto final es : " + resp);
        } else if (numero == 2) {

            double montoAnterior = persona2.getMonto();
            double montoAnteriorMandar = montoAnterior;
            double resp = calcular(montoDeposito, tipooperat, montoAnteriorMandar);
            System.out.println("El monto final es : " + resp);
        } else {

            double montoAnterior = persona3.getMonto();
            double montoAnteriorMandar = montoAnterior;
            double resp = calcular(montoDeposito, tipooperat, montoAnteriorMandar);
            System.out.println("El monto final es : " + resp);
        }

    }

    private static double calcular(double montoDeposito, String tipooperat, double montoAnteriorMandar) {
        double repuesta = 0.0;
        switch (tipooperat) {
            case "A":
                repuesta = montoAnteriorMandar + montoDeposito;
                break;
            case "B":
                repuesta = montoAnteriorMandar - montoDeposito;
        }
        return repuesta;
    }

    private static void opcionesImprimir() {
        System.out.println("____________________________________");
        System.out.println("Ingrese la operacion a realizar");
        System.out.println("A - Depositar");
        System.out.println("B - Retirar");
    }
}
