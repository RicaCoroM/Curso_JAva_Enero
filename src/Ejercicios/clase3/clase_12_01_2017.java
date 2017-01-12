package Ejercicios.clase3;

public class clase_12_01_2017 {
    public static void main(String[] args) {
        
        suma(2,2);//4
        suma(20,4);//24
        resta(10,5);//5
        resta(2,1);//1
        resta(9,5);//4
        multi(10,2);//20
        div(2,2);//1
        operacion(20,2,1);//22
        operacion(10,1,2);//9
        operacion(5,2,3);//10
        operacion(10,2,4);//5
        
    }//main
    public static void suma(int a , int b){
        System.out.println("la suma es: "+ (a+b));
    }//suma
    public static void resta(int a , int b){
        System.out.println("la resta es: "+ (a-b));
    }//resta
    public static void multi(int a , int b){
        System.out.println("la multiplicacion es: "+ (a*b));
    }//multi
    public static void div(int a , int b){
        System.out.println("la division es: "+ (a/b));
    }//div
    public static void operacion(int a , int b , int c){
        if (c==1){
            System.out.println("la suma es: "+ (a+b));
            suma(a,b);
        }else if(c==2){
            System.out.println("la resta es: "+(a-b));
            resta(a,b);
        }else if(c==3){
            System.out.println("la multiplicacion es: "+ (a*b));
            multi(a,b);
        }else if(c==4){
            System.out.println("La division es:"+(a/b));
            div(a,b);
        }
    }//operacion
}//class
