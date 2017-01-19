/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.clase5;

/**
 *
 * @author TeinuxAdmin
 */
public class Tienda {
    public static void main(String[] args) {
        Celular galaxy= new Celular("galaxy S7",10000,"Samsung","Android");
        galaxy.data();
        //nombre: galaxy s7, precio: $10000, marca:Samsung
        Pelicula strange= new Pelicula("Dr. Strange-Pirata",50,"Marvel","Blue-ray");
        strange.data();
        //nombre: Dr. Strange-pirata, precio: 50, Marca: Marvel
        Videojuego mario= new Videojuego("Mario Salta",999,"Nintendo",4);
        mario.data();
    }
    
}
