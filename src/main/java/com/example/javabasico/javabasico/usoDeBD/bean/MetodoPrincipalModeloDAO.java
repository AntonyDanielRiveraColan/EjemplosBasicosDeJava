package com.example.javabasico.javabasico.usoDeBD.bean;

import com.example.javabasico.javabasico.ejemplo.Persona;
import com.example.javabasico.javabasico.usoDeBD.dao.DAOPersonalImpl;
import com.example.javabasico.javabasico.usoDeBD.interfaces.DAOPersona;

public class MetodoPrincipalModeloDAO {

    public static void main(String[] args) throws Exception {
        Persona2 per = new Persona2();
        per.setId(6);
        per.setNombre("AhoraSoyElUltimo");

        try {
            DAOPersona dao = new DAOPersonalImpl();
           // dao.registrar(per);
            //dao.modificar(per);
            //dao.eliminar(per);
            for (Persona2 p : dao.listar()){
                System.out.println(p.getNombre());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        }

}
