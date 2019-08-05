package com.example.javabasico.javabasico.usoDeBD.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    protected Connection conexion;

    //JDBC DRIVER NOMBRE DE LA BASE DE DATOS URL
    final  String JDBC_DRIVER = "org.postgresql.Driver";
    final String DB_URL = "jdbc:postgresql://localhost:5432/Prueba1";

    // Base de datos credenciales
    final String USER ="postgres";
    final String PASS ="123";

    public void conectar() throws Exception {
        try {
            conexion =  DriverManager.getConnection(DB_URL,USER,PASS);
            Class.forName(JDBC_DRIVER);
        }
        catch (Exception e){
            throw  e ;
        }
    }


    public void cerrar() throws Exception {
      if (conexion != null){
          if (!conexion.isClosed()){
              conexion.close();
          }
      }
    }

}
