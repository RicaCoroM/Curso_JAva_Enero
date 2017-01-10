package Ejercicios.clase2;

import javax.swing.JOptionPane;

public class clase2_10_01_2017 {

    public static void main(String[] args) {
        /*

        System.out.println("Clase 2");
        //muestra un text en consola

        JOptionPane.showMessageDialog(null, "Hola Mundo");
        //muestra un texto en una ventana emergente

        String nom = JOptionPane.showInputDialog(null, "Escribe tu nombre");
        //pide ingresar texto en una ventana emergente

        JOptionPane.showMessageDialog(null, "hola " + nom);
        */

        /*
//---------------DIA DE LA SEMANA
        
        
        String dia = JOptionPane.showInputDialog(null, "Escribe el dia");
        dia = dia.toLowerCase();

        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") 
                || dia.equals("jueves") || dia.equals("viernes")) {
            JOptionPane.showMessageDialog(null, "Dia laboral");
        }//if
        else if (dia.equals("sabado") || dia.equals("domingo")) {
            JOptionPane.showMessageDialog(null, "Dia descanso");
        }//else if
        else {
            JOptionPane.showConfirmDialog(null, "Dia no valido");
        }

        String x = JOptionPane.showInputDialog(null, "dame un numero");
        
        //int a = Integer.parseInt(x);
        double f = Double.parseDouble(x);
        
        double res = f + 10;

        System.out.println("res -> " + res);
        */
        //--------- calificaciones
        
        String x = JOptionPane.showInputDialog(null, "Dame un numero");
        double y= Double.parseDouble(x);
        if (y>=0 && y<=3) {
            JOptionPane.showMessageDialog(null, "Reprobado");
        }else if(y>=4 && y<=5){
            JOptionPane.showMessageDialog(null, "Ya casi");
        }else if(y>=6 && y<=7){
            JOptionPane.showMessageDialog(null, "Apenitas");
        }else if(y>=8 && y<=9){
            JOptionPane.showMessageDialog(null, "Very good");
        }else if(y==10){
            JOptionPane.showMessageDialog(null, "Excelente");
        }else{
            JOptionPane.showMessageDialog(null, "Calificacion invalida");
        }
    }//main

}//class
