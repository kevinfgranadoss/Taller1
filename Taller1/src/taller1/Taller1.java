/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Taller1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Connection conexion;

        String url = "jdbc:mysql://localhost:3306/javadb";
        String usuario = "root";
        String clave = "mysql2017";

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("POR FIN!");
            String cadena="INSERT INTO ejemplo(idejemplo, dato) VALUES (2,2)";
            //1. Crear un objeto
            Statement sentencia;
            sentencia  = conexion.createStatement();
            sentencia.execute(cadena);
            
        } catch (SQLException ex) {
            
            
            String cad=ex.getMessage();
            System.out.println(ex);
            
        
        //
        
        
        
    }

}
}