package Ejercicios.clase5;

public abstract class Producto {

    private String nombre = "";
    private int precio = 0;
    private String marca = "";

    public Producto() {
    }//overload o sobre carga indica que tiene mas de 1 contructor 

    public Producto(String nombre, int precio, String marca) {
        setNombre(nombre);
        setPrecio(precio);
        setMarca(marca);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void data() {
        System.out.println("- - - PRODUCTO - - -");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Marca: " + this.getMarca());

    }

}
