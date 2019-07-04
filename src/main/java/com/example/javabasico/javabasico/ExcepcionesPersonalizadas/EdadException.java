package com.example.javabasico.javabasico.ExcepcionesPersonalizadas;

public class EdadException extends Exception{

    public EdadException(String mensaje){
        super(mensaje.concat(" EXCEPTION PERSONALIZADA "));
    }


}
