/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.clase3;

/**
 *
 * @author roberto
 */
public class metodos {

    public static void main(String[] args) {
        System.out.println("metodos");
        
        hola("Ricardo");
        hola("preimavera");
        hola("verano");
        hola("otoño");
        hola("inv");
        suma();
    }//main

    public static void hola( String nombre) {// metodo HOLA  //argumento / parametro
        System.out.println("hola "+ nombre);
        if (nombre.equals("inv")){
        System.out.println("hace frio");
        }else {
            System.out.println("no hace frio");
        }
        
    }//hola
    public static void suma(){
        System.out.println("2 + 2 = 4");
    }//suma

}//clas
