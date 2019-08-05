package com.example.javabasico.javabasico.manipulacionDeArchivos;

import java.io.File;

public class FilePrincipal {
  /**Metodo principal.*/
  public static void main(String[] args) {

    /*
        File archivo = new File("C:\\ManejoArchivo\\mitocode.txt");
        // boolean respuesta = archivo.exists(); //Verifica existencia
        */

    /*
        File archivo = new File("C:\\ManejoArchivo\\java\\java2\\java3\\");
        // boolean respuesta = archivo.mkdir(); //Crea directorio
        boolean respuesta = archivo.mkdirs(); //Crea directorios faltantes en la ruta
        */
    /*
        File archivo = new File("C:\\ManejoArchivo\\mitocode.txt");
       //renombrar archivos
       // boolean respuesta = archivo.renameTo(new File ("C:\\ManejoArchivo\\nombreCambiado.txt"));
       */

    File archivo = new File("C:\\ManejoArchivo\\nombreCambiado.txt");
    boolean eliminado = archivo.delete();
    System.out.println(eliminado);
  }
}
