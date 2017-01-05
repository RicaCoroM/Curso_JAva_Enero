package ricardo;

public class Ricardo {

    /*
    {} los corchetes maracan contextos
    psvm + tabulador = public static void main(String [] args){
    sout + tabulador = System.out.println("");
     */
    public static void main(String[] args) {

        int x = 10;
        double y = 5.5;
        String nombre = "Ricardo";
        /*
        guarda algo en memoria con el nombre de x
        int = valores enteros 
        double = valores enteros y decimales
        String = valores con letras
         */

        System.out.println("Hola " + x + y);
        System.out.println(x + y + " Hola ");

        /*      CONDICIONES:
        a > b mayor
        a < b menor
        a >= b mayor igual
        a <= b menor igual
        a == b igual
         */
        int z = 10;
        
        /*
        &&  andperson AND para doble condicion y 
                tienen que ser todos verdaderos para que sea verdadero
        ||  pipe OR para elegir una u otro se cumple mienstras uno sea verdadero 
        */

        if (z == 5) {
            System.out.println("11111111");
        }//if
        else if (10 > 50) {
            System.out.println("22222222");
        }//else if
        else {
            System.out.println("33333333");
        }// else
        
        String abc = "hola";
        String mes = "enero";
        String res = abc+mes;
        
        if(res.equals("holaenero")){
            System.out.println("44444444");
        }

    }//main

}//class
