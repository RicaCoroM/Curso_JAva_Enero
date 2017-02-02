/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.clase8;

import java.util.ArrayList;

/**
 *
 * @author TeinuxAdmin
 */
public class UtilidadArreglosStatic {
    
    public static void imprimirArreglo(ArrayList<String> arr) {
        System.out.println("-----------ARREGLO 3--------------");
        for (int cont = 0; cont < arr.size(); cont++) {
            System.out.println((cont + 1) + " : " + arr.get(cont)
            );

        }//for
    }//metodo imprimirArreglo
}//class