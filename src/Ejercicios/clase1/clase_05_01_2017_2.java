/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.clase1;

/**
 *
 * @author roberto
 */
public class clase_05_01_2017_2 {
    
    public static void main(String[] args) {
        
        String dia = "LUNES";
        dia = dia.toLowerCase();
        // todo lo comvierte a minusculas
        
        if (dia.equals("lunes") || dia.equals("martes") ||
                dia.equals("miercoles") || dia.equals("jueves") || 
                dia.equals("viernes")){
            System.out.println("dia laboral");
        }//if
        else if (dia.equals("sabado") ||dia.equals("domingo")){
            System.out.println("dia descanso");
        }//if else
        else{
            System.out.println("dia invalido");
        }//else
    }//main
    
}//class
