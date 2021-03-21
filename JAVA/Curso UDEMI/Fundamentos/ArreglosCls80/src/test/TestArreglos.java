/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author WilliamFelipe
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 12;
        System.out.println("edades[0] = " + edades[0]);
        
        for (var i = 0; i < edades.length; i++) {
            System.out.println("edades[" + i + "] = " + edades[i]);
        }
        
        String frutas[] = {"Banano", "Manzana", "Pera"};
        
        for (var i = 0; i < frutas.length; i++) {
            System.out.println("frutas[" + i + "] = " + frutas[i]);
        }
    }
}
