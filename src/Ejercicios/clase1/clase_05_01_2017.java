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
public class clase_05_01_2017 {

    public static void main(String[] args) {
        
        double calif = 10;
        
        if (calif >= 0 && calif <= 3) {
            System.out.println("Reprobado");
        }//if
        else if (calif >= 4 && calif <= 5) {
            System.out.println("Ya casi");
        }//else if 1
        else if (calif >= 6 && calif <= 7) {
            System.out.println("Apenas");
        }//else if 2
        else if (calif >= 8 && calif <= 9) {
            System.out.println("Very Good");
        }// else if 3
        else if (calif == 10) {
            System.out.println("Excelente");
        }//else if 4
        else {
            System.out.println("INVALIDO");
        }
    }//main

}//class
