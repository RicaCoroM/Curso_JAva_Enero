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
public class Celular extends Producto {

//    private String nombre = "";
//    private int precio = 0;
//    private String marca = "";
    private String sistema = "";

    public Celular() {
    }

    public Celular(String nombre, int precio, String marca, String sistema) {
        super(nombre,precio,marca);
//        super.setNombre(nombre);
//        super.setPrecio(precio);
//        super.setMarca(marca);
        setSistema(sistema);
    }

//    public String getNombre() {
//        return super.nombre;
//    }
//
//    public void setNombre(String nombre) {
//        super.nombre = nombre;
//    }
//
//    public int getPrecio() {
//        return super.precio;
//    }
//
//    public void setPrecio(int precio) {
//        super.precio = precio;
//    }
//
//    public String getMarca() {
//        return super.marca;
//    }
//
//    public void setMarca(String marca) {
//        super.marca = marca;
//    }

    public String getSistema() {
        return this.sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Override// indica que se sobre escribe un metodo que ya existe en la clse padre

    public void data() {
        super.data();
//        System.out.println("- - - PRODUCTO - - -");
//        System.out.println("Nombre: " + this.getNombre());
//        System.out.println("Precio: " + this.getPrecio());
//        System.out.println("Marca: " + this.getMarca());
        System.out.println("Sistema: " + this.getSistema());
    }
}
