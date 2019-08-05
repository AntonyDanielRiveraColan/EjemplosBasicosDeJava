package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaLinkedList {

    /**
     * Metodo principal.
     */
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        List<Integer> list = new LinkedList();

        List<Integer> lista = new ArrayList(1000000);
        for (int i = 0; i < 1000000; i++) {
            lista.add(i);
        }
    
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        long inicio2 = System.currentTimeMillis();

        List<Integer> lista2 = new ArrayList(1000000);
        for (int i = 0; i < 1000000; i++) {
            lista2.add(i);
        }
        long fin2 = System.currentTimeMillis();
        System.out.println(fin2 - inicio2);
    }

}
