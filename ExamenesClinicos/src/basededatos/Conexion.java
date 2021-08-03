/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Conexion {
    Connection con;
    String cuenta = "root";
    String contraseña = "your_password";
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
   
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionproductos",cuenta,contraseña);
            if(con!=null){
                System.out.println("conexion exitosa");
            }
            
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }

    public void close() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

