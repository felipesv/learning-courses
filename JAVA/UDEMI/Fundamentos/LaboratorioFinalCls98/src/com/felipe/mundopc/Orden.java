/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipe.mundopc;

/**
 *
 * @author WilliamFelipe
 */
public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    public static final int MAX_COMPUTADORAS = 10;
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora) {
        if (Orden.contadorOrdenes < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de produtos " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Productos de la orden:");
        
        for (int i = 0; i < this.computadoras.length; i++) {
            if (this.computadoras[i] != null) {
                System.out.println(this.computadoras[i]);
            }
        }
    }
}
