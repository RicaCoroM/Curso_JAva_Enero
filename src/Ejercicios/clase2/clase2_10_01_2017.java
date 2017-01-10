package Ejercicios.clase2;

import javax.swing.JOptionPane;

public class clase2_10_01_2017 {

    public static void main(String[] args) {

        System.out.println("Clase 2");
        //muestra un text en consola

        JOptionPane.showMessageDialog(null, "Hola Mundo");
        //muestra un texto en una ventana emergente

        String nom = JOptionPane.showInputDialog(null, "Escribe tu nombre");
        //pide ingresar texto en una ventana emergente

        JOptionPane.showMessageDialog(null, "hola " + nom);

        /*---------------DIA DE LA SEMANA
        
         */
        String dia = JOptionPane.showInputDialog(null, "Escribe el dia");
        dia = dia.toLowerCase();

        if (dia.equals("lunes")||dia.equals("martes")||dia.equals("miercoles")||dia.equals("jueves")||
                dia.equals("viernes")) {
            JOptionPane.showMessageDialog(null, "Dia laboral");
        }//if
        else if (dia.equals("sabado")||dia.equals("domingo")){
            JOptionPane.showMessageDialog(null, "Dia descanso");
        }//else if
        else{
            JOptionPane.showConfirmDialog(null, "dia no valdo");
        }
        
    }//main

}//class
