/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.felipe.test;

import co.com.felipe.ventas.*;

/**
 *
 * @author WilliamFelipe
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.mostrarOrden();
    }
}
