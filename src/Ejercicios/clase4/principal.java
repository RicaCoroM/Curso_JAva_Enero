/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.clase4;

/**
 *
 * @author TeinuxAdmin
 */
public class principal {

    public static void main(String[] args) {
//        System.out.println("Principal");
//        operaciones x =new operaciones();
//        x.hola();
//        x.suma(10,5);
//        
//        int res=10+x.x;
//        System.out.println("res ---> "+res);
//        //hola();
        Persona e = new Persona();

        e.nombre = "Eduardo";
        e.edad = 29;
        e.datos();
//
//        System.out.println("nombre: " + e.nombre);
//        System.out.println("edad: " + e.edad);

//        operaciones op = new operaciones();
//
//        op.suma(2, 3);
//        int rrr = op.operacion(10, 2, 1);
//        
//        op.res(rrr);
        Persona d = new Persona();

        d.nombre = "Diana";
        d.edad = 26;
        d.datos();
//        System.out.println("nombre ---> "+ e.nombre);//Eduardo
//        System.out.println("nombre ---> "+ d.nombre);//Diana

        Iva iva = new Iva();
        double iva1 = iva.iva(45);
        String ivares = iva.ivares(iva1);
        System.out.println(ivares);// el resultado del iva:52.2

    }//main

}//class
