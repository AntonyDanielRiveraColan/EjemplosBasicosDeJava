package com.example.javabasico.javabasico.usoDeBD.bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConexionBD {

    public String solicitarValores()   {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.next();
        return nombre;
    }

    public static void main(String[] args) throws SQLException {
        ConexionBD conexionBD = new ConexionBD();
        String valor = conexionBD.solicitarValores();
        if (valor != null){
            regristarBD(valor);
        }

        List<Persona2> listaBD = conexionBD.listar();
        for (Persona2 per : listaBD){
            System.out.println(per.getId()+"-"+per.getNombre());
        }

    }

    private static void regristarBD(String valor) throws SQLException {
        //JDBC DRIVER NOMBRE DE LA BASE DE DATOS URL
        final  String JDBC_DRIVER = "org.postgresql.Driver";
        final String DB_URL = "jdbc:postgresql://localhost:5432/Prueba1";

        // Base de datos credenciales
        final String USER ="postgres";
        final String PASS ="123";

        Connection conexion = null;


        try{
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement st = conexion.prepareStatement("INSERT INTO persona(nombre) values (?)");
            st.setString(1,valor);
            st.executeUpdate();
            st.close();
        }
        catch(Exception e){
            e.getMessage();
        }
        finally {
            if (conexion != null){
                if (!conexion.isClosed()){
                    conexion.close();
                }
            }
        }

    }



    public List<Persona2> listar() {
        List<Persona2> lista = null;

        //JDBC DRIVER NOMBRE DE LA BASE DE DATOS URL
        final  String JDBC_DRIVER = "org.postgresql.Driver";
        final String DB_URL = "jdbc:postgresql://localhost:5432/Prueba1";

        // Base de datos credenciales
        final String USER ="postgres";
        final String PASS ="123";

        Connection conexion = null;

        try{
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DB_URL,USER,PASS);
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM persona");
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
        catch(Exception e){
            e.getMessage();
        }
        return lista;
    }

}

