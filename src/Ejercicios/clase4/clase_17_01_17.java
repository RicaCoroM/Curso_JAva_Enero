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
public class clase_17_01_17 {

    public static void main(String[] args) {
//        System.out.println("111111");
//        int a= suma(2,2);
        int res = 2 + 2;
        System.out.println("res -- -> " + res);
        res=resta(5,1);
        System.out.println("res ---> "+ res);
        res = operacion(10,6,1);
        System.out.println("res ---> "+res);
        String abc=algo("hola ", "mundo ");
        System.out.println("abc ---> "+abc);
        

    }//main 

    public static int suma(int n1, int n2) {
        return n1 + n2;
    }

    public static int resta(int n1, int n2) {
        int res=0;
        res = n1-n2;
        
        return res;
        
    }

    public static int operacion(int n1, int n2,int n3) {
        int op = 0;
        if (n3==1){
            op=n1-n2;
        }
            return op;
    }

    public static String algo(String cad1, String cad2) {
        String abc=cad1+cad2;
        return abc;

    }

}//class
