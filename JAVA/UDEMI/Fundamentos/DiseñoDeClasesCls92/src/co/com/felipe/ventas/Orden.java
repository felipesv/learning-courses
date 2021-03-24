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
public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private static int contadorOrdenes;
    private int contadorProductos;
    public static final int MAX_PRODUCTOS = 10;
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto) {
        if (Orden.contadorOrdenes < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de produtos " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null) {
                total += this.productos[i].getPrecio();
            }
        }

        return total;
    }
    
    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Total: $" + this.calcularTotal());
        System.out.println("Productos de la orden:");

        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null) {
                System.out.println(this.productos[i]);
            }
            
        }
    }
}
