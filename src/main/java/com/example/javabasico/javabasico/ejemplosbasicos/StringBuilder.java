package com.example.javabasico.javabasico.ejemplosbasicos;

public class StringBuilder {
    public static void main(String[] args) {

        long tiempo_inicio = System.nanoTime();

        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        for (int i=0; i<1000 ; i++){
            stringBuilder.append(i);
        }
        long tiempo_final = System.nanoTime();
            double diferencia = tiempo_final-tiempo_inicio;
        System.out.println(diferencia);

        //Ejemplo 2
        long tiempo_inicio2 = System.nanoTime();


        for (int i=0; i<1000 ; i++){
            stringBuilder.append(i);
        }
        long tiempo_fina2 = System.nanoTime();
        double diferencia2 = tiempo_fina2-tiempo_inicio2;
        System.out.println(diferencia2);
    }
}
