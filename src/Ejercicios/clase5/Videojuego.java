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
public class Videojuego extends Producto {

//    private String nombre = "";
//    private int precio = 0;
//    private String marca = "";
    private int jugadores = 0;

    public Videojuego() {
    }

    public Videojuego(String nombre, int precio, String marca, int jugadores) {
        super(nombre, precio, marca);
//        setNombre(nombre);
//        setPrecio(precio);
//        setMarca(marca);
        setJugadores(jugadores);
    }

//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public int getPrecio() {
//        return precio;
//    }
//
//    public void setPrecio(int precio) {
//        this.precio = precio;
//    }
//
//    public String getMarca() {
//        return marca;
//    }
//
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }
    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    @Override

    public void data() {
        super.data();
//        System.out.println("- - - PRODUCTO - - -");
//        System.out.println("Nombre: " + this.getNombre());
//        System.out.println("Precio: " + this.getPrecio());
//        System.out.println("Marca: " + this.getMarca());
        System.out.println("Jugadores: " + this.getJugadores());
    }
}
