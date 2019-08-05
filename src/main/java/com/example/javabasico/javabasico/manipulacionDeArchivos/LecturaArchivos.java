package com.example.javabasico.javabasico.manipulacionDeArchivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LecturaArchivos {
    public static void main(String[] args) throws IOException {

       /*
        FileReader archivo = new FileReader("C:\\ManejoArchivo\\nota.txt");
        BufferedReader buffer = new BufferedReader(archivo);
        String texto;
        while ((texto = buffer.readLine()) != null) {
            System.out.println("El contenido del documento es : " + texto);
        }*/

        FileInputStream in = new FileInputStream("C:\\ManejoArchivo\\nota.txt");
        Scanner scanner = new Scanner(in, "UTF-8");
        String texto = scanner.next();
        System.out.println("El contenido del documento es : " + texto);

    }
}
