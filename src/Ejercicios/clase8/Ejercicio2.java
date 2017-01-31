package Ejercicios.clase8;

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<String> arr_al = new ArrayList();//<>  generics
        arr_al.add("Hola");
        arr_al.add("Hello");
        String texto = arr_al.get(0); //add agrega
        arr_al.add("Ciao");
        arr_al.add("Aloha");
        arr_al.remove("Ciao");//remover o quitar por posicion o valor
        arr_al.add("Konnichiwa");
        arr_al.add("Guten Morgen");
        
    }

}
