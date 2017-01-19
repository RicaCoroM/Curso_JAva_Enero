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
public class Persona {

    //encapsular
    private String nombre;
    private int edad = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad) {//constructor
        setNombre(nombre);
//        this.nombre =nombre;
        setEdad(edad);
//        this.edad = edad;
    }

    //overload / sobrecarga
    public void datos() {
        System.out.println("nombre ---> " + getNombre());
        System.out.println("edad ---> " + getEdad());
    }
    
    //getter
    
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            return;
        } else {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) {
            this.edad = edad;
    }

}
