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
        persona e = new persona();

        e.nombre = "Eduardo";
        e.edad = 29;

        System.out.println("nombre: " + e.nombre);
        System.out.println("edad: " + e.edad);

        operaciones op = new operaciones();

        op.suma(2, 3);
        int rrr = op.operacion(10, 2, 1);
        
        op.res(rrr);
        
        persona d= new persona();
        
        d.nombre="Diana";
        d.edad=26;
        System.out.println("nombre ---> "+ e.nombre);//Eduardo
        System.out.println("nombre ---> "+ d.nombre);//Diana

    }//main

}//class
