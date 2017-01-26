package Ejercicios.clase7;

public class repeticiones {

    public static void main(String[] args) {
        
        System.out.println("repeticiones");
        
        for (int cont = 0; cont < 10; cont++) {
            System.out.println("Hola for " + cont);

        }//for
        
        int cont=0;
        
        while(cont<10){
            System.out.println("Hola while "+ cont);
            cont++;
        }//while
        
        System.out.println("cont ---> "+cont);
    }//main

}//class
