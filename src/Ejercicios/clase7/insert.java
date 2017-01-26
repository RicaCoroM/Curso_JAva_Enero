package Ejercicios.clase7;

import java.sql.*;
import javax.swing.JOptionPane;

public class insert {

    public static void main(String[] args) {

        try {
            Connection conn = null;
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java_enero", "root", "");
            conn = ABC.konex();
            //------------------------------ CONSULTA: 
            String consulta = "INSERT INTO usuarios "
                    + " (correo , nombre)"
                    + " VALUES"
                    + " ('abc@gmail.com', 'ABC D')";
            System.out.println("consulta ---> " + consulta);

            PreparedStatement query = conn.prepareStatement(consulta);
            int filas = query.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, filas + " FILAS INSERTADAS");
            } else {
                JOptionPane.showMessageDialog(null, "NADA INSERTADO");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);

        }

    }//main

}//class
