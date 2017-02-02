package Ejercicios.clase8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {

        ArrayList<String> arr_al = new ArrayList();//<>  generics
        arr_al.add("Hola");
        arr_al.add("Hello");
//
//        String texto = arr_al.get(0); //add agrega
//        System.out.println("texto -> " + texto);
//        System.out.println("--> " + arr_al);

        arr_al.add("Ciao");
        arr_al.add("Aloha");
        arr_al.remove("Ciao");//remover o quitar por posicion o valor
        arr_al.add("Konnichiwa");
        arr_al.add("Guten Morgen");
//        System.out.println("total de elementos: " + arr_al.size());
//        System.out.println("3 ---> " + arr_al);
//        System.out.println("pos de konnichiwa" + arr_al.indexOf("Konnichiwa"));//egresa la posicion del valor indicado

//        for (int cont = 0; cont < arr_al.size(); cont++) {
//            System.out.println((cont + 1) + " : " + arr_al.get(cont));
//
//        }//for nomemal
//        int a = 1;
//        for (String tmp : arr_al) {
//            System.out.println(a + " -> " + tmp);
//            a++;
//        }
//        
//        int c=1;
//        for(String tmp : arr_al){
//            System.out.println("");
//            if( tmp.equals("Hola")){
//                System.out.println(c+ " : "+ tmp);
//                
//            }//if
//            c++;
//        }//for
//        
//       String b ="Konnichiwa" ;
//       for (int cont =0; cont <arr_al.size();cont++){
//           String valactual = arr_al.get(cont);
//           
//           if(b.equals(valactual)){
//               System.out.println(b+" pod-> "+cont);
//               break;
//           }
//       }
        ArrayList<String> arr_al2 = new ArrayList();
        arr_al2.add("Hola");
        arr_al2.add("Adios");

//        contador();
        //1
        imprimirArreglo(arr_al);
        imprimirArreglo(arr_al2);

        //2
        UtilidadArreglos abc = new UtilidadArreglos();
        abc.imprimirArreglo(arr_al);
        new UtilidadArreglos().imprimirArreglo(arr_al2);

        //3
        UtilidadArreglosStatic.imprimirArreglo(arr_al);
        UtilidadArreglosStatic.imprimirArreglo(arr_al2);
    }//main

    public static void contador() {
        ArrayList<String> arr_al = new ArrayList();//<>  generics
        int b = 1;
        for (int cont = 0; cont < arr_al.size(); cont++) {
            System.out.println(b + " : " + arr_al);
            b++;
        }
    }

    public static void imprimirArreglo(ArrayList<String> arr) {
        System.out.println("------------ARREGLO 1-------------");

        for (int cont = 0; cont < arr.size(); cont++) {
            System.out.println((cont + 1) + " : " + arr.get(cont)
            );
        }

    }

}//class
