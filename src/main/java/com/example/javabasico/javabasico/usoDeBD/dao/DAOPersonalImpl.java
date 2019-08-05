package com.example.javabasico.javabasico.usoDeBD.dao;

import com.example.javabasico.javabasico.usoDeBD.bean.Persona2;
import com.example.javabasico.javabasico.usoDeBD.interfaces.DAOPersona;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPersonalImpl extends Conexion implements DAOPersona {

    @Override
    public void registrar(Persona2 per) throws Exception {
        try {

            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Persona(nombre) VALUES (?)");
            st.setString(1,per.getNombre());
            st.executeUpdate();
        }
        catch (Exception e){
            throw  e;
        }
        finally {
            this.cerrar();
        }
    }

    @Override
    public void modificar(Persona2 per) throws Exception {
        try {

            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE Persona set nombre =? where   id =?");
           st.setString(1,per.getNombre());
            st.setInt(2,per.getId());
            st.executeUpdate();
        }
        catch (Exception e){
            throw  e;
        }
        finally {
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Persona2 per) throws Exception {
        try {

            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE from Persona  where id =?");
            st.setInt(1,per.getId());
            st.executeUpdate();
        }
        catch (Exception e){
            throw  e;
        }
        finally {
            this.cerrar();
        }
    }

    @Override
    public List<Persona2> listar() throws Exception {
        List<Persona2> lista = null;
        try {

            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * from Persona");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()){
                Persona2 persona2 = new Persona2();
                persona2.setId(rs.getInt("id"));
                persona2.setNombre(rs.getString("nombre"));
                lista.add(persona2);
            }
            rs.close();
            st.close();
        }
        catch (Exception e){
            throw  e;
        }
        finally {
            this.cerrar();
        }
        return lista;
    }
}
