package com.example.javabasico.javabasico.ExcepcionesPersonalizadas;

import java.util.Scanner;

public class InvocadorDeException {

    public static void main(String[] args) throws EdadException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad =  scanner.nextInt();
        final int EDADMAXIMA = 100;

        if (edad<EDADMAXIMA){
            System.out.println("Bienvenido");

        }
        else {
            throw new EdadException("Edad no permitida, edad incorrecta");
        }
    }
}
