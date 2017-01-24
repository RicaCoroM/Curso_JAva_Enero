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
public class Pelicula extends Producto {

//    private String nombre = "";
//    private int precio = 0;
//    private String marca = "";
    private String formato = "";

    public Pelicula() {
    }

    public Pelicula(String nombre, int precio, String marca, String formato) {
        super(nombre, precio, marca);
//        setNombre(nombre);
//        setPrecio(precio);
//        setMarca(marca);
        setFormato(formato);
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
    public String getFormato() {
        return this.formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override

    public void data() {
        super.data();
//        System.out.println("- - - PRODUCTO - - -");
//        System.out.println("Nombre: " + this.getNombre());
//        System.out.println("Precio: " + this.getPrecio());
//        System.out.println("Marca: " + this.getMarca());
        System.out.println("Fromato: " + this.getFormato());
    }
}
