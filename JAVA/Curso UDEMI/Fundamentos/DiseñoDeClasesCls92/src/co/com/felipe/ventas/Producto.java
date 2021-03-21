/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.felipe.ventas;

/**
 *
 * @author WilliamFelipe
 */
public class Producto {
    private final int IdProducto; // una vez inicializado no se cambia y se inicializa en el constructor
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto() {
        this.IdProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio) {
        this(); // constructor privado
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{IdProducto=").append(IdProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
