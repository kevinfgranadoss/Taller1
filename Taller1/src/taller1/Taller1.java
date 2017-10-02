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
            String cadena = "INSERT INTO ejemplo(idejemplo, datos) VALUES (1,1)";
            //1. Crear un objeto
            Statement sentencia;
            sentencia = conexion.createStatement();
            sentencia.execute(cadena);

        } catch (SQLException ex) {

            String cad = ex.getMessage();
            System.out.println("Error: "+cad);
            String err1 = ".*database.*";
            String err2 = "Table.*";
            String err3 = "Duplicate entry.*";
            String err4 = "You have an error in your SQL syntax.*";
            String err5 = ".*column.*";
            String err6 = ".*user.*";
            String err7 = ".*suitable driver.*";
            if (cad.matches(err1)) {
                System.out.println("Base de datos desconocida");
            }
            if (cad.matches(err2)){
                System.out.println("Error en la tabla");
            }
            if (cad.matches(err3)){
                System.out.println("Entrada duplicada para la llave primaria");
            }
            if (cad.matches(err4)){
                System.out.println("Error en sintaxis SQL");                
            }
            if (cad.matches(err5)){
                System.out.println("Columna desconocida, ingrese nuevamente el nombre");                
            }
            if (cad.matches(err6)){
                System.out.println("Error en el usuario o contraseña, verifique la conexión");                
            }
            if (cad.matches(err7)){
                System.out.println("Verifique la URL de la conexión");                
            }
        }
    
}
}
