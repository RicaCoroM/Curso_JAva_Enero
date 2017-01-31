package Ejercicios.clase8;

import java.util.ArrayList;

public class Arreglos {

    public static void main(String[] args) {

        int[] arr_1 = {10, 5, 9, 60, /*9, 9, 8, 7, 6, 55, 89*/};

        arr_1[3] = 300;
        int x = arr_1.length - 1;

        System.out.println("total: " + arr_1.length);
        System.out.println("ultima poss: " + arr_1[x]);
        //length da el numero de elemntos en el arreglo

        for (int cont = 0; cont < arr_1.length; cont++) {
            System.out.println("hola " + arr_1[cont]);
        }

        double arr_2[] = new double[6];
        for (int cont = 0; cont < arr_2.length; cont++) {
            double inc = 100;
            int num = 1;
            arr_2[cont] = (num + cont) * inc;
            System.out.println((num + cont) + " : " + arr_2[cont]);
        }
        //foreach
        int arr_3[] = {6, 8, 91, 55};
        for (int tmp : arr_3) {
            System.out.println("tmp -> " + tmp);

        }//foreach
        //-----------------------------------------

        ArrayList<String> arr_al = new ArrayList();//<>  generics
        arr_al.add("Hola");
        arr_al.add("Hello");

        String texto = arr_al.get(0); //add agrega
//        int numero = (int) arr_al.get(1);

        System.out.println("texto -> " + texto);
//        System.out.println("numero -> " + numero);
        System.out.println("--> " + arr_al);

        arr_al.add("Ciao");
        arr_al.add("Aloha");
        arr_al.remove("Ciao");//remover o quitar por posicion o valor
        arr_al.add("Konnichiwa");
        arr_al.add("Guten Morgen");
        System.out.println("total de elementos: " + arr_al.size());
        System.out.println("3 ---> " + arr_al);
        System.out.println("pos de konnichiwa" + arr_al.indexOf("Konnichiwa"));//egresa la posicion del valor indicado


    }//main

}//class
