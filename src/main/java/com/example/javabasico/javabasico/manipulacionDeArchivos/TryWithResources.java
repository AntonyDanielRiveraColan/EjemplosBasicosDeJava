package com.example.javabasico.javabasico.manipulacionDeArchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
       // FileWriter archivo = null;
        PrintWriter printer= null;

        try(FileWriter archivo = new FileWriter("C:\\ManejoArchivo\\nota.txt",true)) {

            printer = new PrintWriter(archivo);
            printer.println("El true lineas arriba se adiciono para que se pueda agregar lineas en ves de reemplazarla");
        }
        catch (IOException e) {
            //Excepcion
        }


    }
}
