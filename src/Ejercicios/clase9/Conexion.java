/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.clase9;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author TeinuxAdmin
 */
public class Conexion {

    public static Connection ContectarBD() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java_enero", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en conexion " + e);
        }
        return conn;
    }
    
}
