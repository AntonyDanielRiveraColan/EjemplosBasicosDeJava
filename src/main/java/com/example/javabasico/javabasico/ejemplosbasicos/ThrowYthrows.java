package com.example.javabasico.javabasico.ejemplosbasicos;

public class ThrowYthrows {

    private void metodo1(){
        try {
            metodo2();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void metodo2() throws Exception {
        try {
            metodo3();
        }
        catch (Exception es){
            throw new Exception(es.getMessage());
        }
    }

    private void metodo3() throws Exception {
        try {
            int divicion =1/0;

        }
        catch (Exception e){
            throw new Exception("Enviando a la capa superior");
        }
    }

    public static void main(String[] args) {
        ThrowYthrows se = new ThrowYthrows();
        se.metodo1();
    }
}
