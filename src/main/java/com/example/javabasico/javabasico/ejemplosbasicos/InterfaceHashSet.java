package com.example.javabasico.javabasico.ejemplosbasicos;

import java.util.HashSet;
import java.util.Set;

public class InterfaceHashSet {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");
        lista.add("f");

        for (String dato:lista){
            System.out.println(dato);
        }
    }
}
