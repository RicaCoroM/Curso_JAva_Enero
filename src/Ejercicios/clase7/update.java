package Ejercicios.clase7;

import java.sql.*;
import javax.swing.JOptionPane;

public class update {

    public static void main(String[] args) {

        try {
            Connection conn = null;
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java_enero", "root", "");
            conn = ABC.konex();
            //------------------------------ CONSULTA: 
            String consulta = "UPDATE usuarios SET"
                    + " usuario='10', "
                    + " pass='0880'"
                    + " WHERE id='10'";
            System.out.println("consulta ---> " + consulta);

            PreparedStatement query = conn.prepareStatement(consulta);
            int filas = query.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, filas + " ACTUALIZADAS");
            } else {
                JOptionPane.showMessageDialog(null, "NADA ACTUAÑIZADO");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);

        }

    }//main

}//class
