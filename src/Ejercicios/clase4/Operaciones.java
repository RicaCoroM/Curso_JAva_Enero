package Ejercicios.clase4;

/**
 * Esta clase no tiene metodo main ya que solo realiza operaciones pero no
 *
 */
public class Operaciones {

    int x = 10;

    public void hola() {
        System.out.println("hola mundo");
    }

    public void suma(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public int operacion(int n1, int n2, int n3) {
        
        int res=0;
        if (n3==1)res = n1+n2;
        return res;

    }
    public void res(int algo){
        System.out.println("El resultado es "+ algo);
    }

}//class
