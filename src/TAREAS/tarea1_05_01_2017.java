package TAREAS;

public class tarea1_05_01_2017 {

    /*
    TAREA
    int sueldo =1000
    si es menos de 1000 no se descuenta nada
    si el sueldo es mayor a 1000 y menor a 2000 se descuenta el 10%
    si el sueldo es mayor a 2000 y menor a 3000 se descuenta el 20%
    si el sueldo es mayor a 3000 se descuenta el 30%
    >=   <=
     */
    public static void main(String[] args) {
        
        int sueldo = 999;
        double desc = 0;
        
        if (sueldo <= 999) {
        }//if
        
        else if (sueldo >= 1000 && sueldo <= 1999) {
            desc = 0.10;
        }//else if
        
        else if (sueldo >= 2000 && sueldo <= 2999) {
            desc = 0.20;
        }//else if
        
        else if (sueldo >= 3000) {
            desc = 0.30;
        }//else if

        System.out.println("El descuento es de " + (sueldo * desc));
        System.out.println("Sueldo neto " + (sueldo - (sueldo * desc)));

    }//main

}//class
/*
int sueldo =3000;
double desc=0;
double res=sueldo;

if(sueldo>=1000)desc=.10;
if(sueldo<=2000)desc=.20;
id(sueldo>=3000)desc=.30;

res= sueldo - (sueldo * desc);
System.out.println("res: " + res);
*/