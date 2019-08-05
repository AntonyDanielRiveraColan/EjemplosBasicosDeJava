package com.example.javabasico.javabasico.usoDeBD.interfaces;

import com.example.javabasico.javabasico.ejemplo.Persona;
import com.example.javabasico.javabasico.usoDeBD.bean.Persona2;

import java.util.List;

public interface DAOPersona {

    public void registrar(Persona2  per ) throws Exception;
    public void modificar(Persona2  per ) throws Exception;
    public void eliminar(Persona2  per ) throws Exception;
    public List<Persona2> listar() throws Exception;

}
