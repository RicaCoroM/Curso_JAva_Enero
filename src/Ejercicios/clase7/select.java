package Ejercicios.clase7;

import java.sql.*;
import javax.swing.JOptionPane;

public class select extends ABC {

    public static void main(String[] args) {

        try {
            Connection conn = null;
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java_enero", "root", "");
//              intancia
//              ABC a=  new ABC();
//              conn = a.konex().
//              conn = new ABC().konex();
            conn = ABC.konex();

//------------------------------ CONSULTA: 
            String consulta = "SELECT * FROM USUARIOS";
            System.out.println("consulta ---> " + consulta);

            PreparedStatement query = conn.prepareStatement(consulta);
            ResultSet rs = query.executeQuery();

//            //----------------------REVISAR RESULTADOS:
//boolean x = false;
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String id = rs.getString("id");
                String correo = rs.getString("correo");

                System.out.println("Id: "+id+" Nombre: " + nombre+" Correo: "+correo);
            }
//            String nombre = "";
//            String id = "";
//            String mail = "";
////            rs.previous();// es para el valor anterior de la tabla
//            rs.next();//es para tomar el siguiente valor de la tabla
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);
//            rs.next();
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);
//            rs.next();
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);
//            rs.next();
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);
//            rs.next();
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);
//            rs.next();
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);
//            rs.next();
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);
//            rs.next();
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);
//            rs.next();
//            id = rs.getString("id");
//            nombre = rs.getString("nombre");
//            mail = rs.getString("correo");
//            System.out.println("Id: " + id + " nombre: " + nombre + " mail: " + mail);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e);

        }

    }//main

}//class
