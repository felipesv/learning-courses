/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author WilliamFelipe
 */
public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 10;
        edades[1][0] = 4;
        edades[1][1] = 11;
        edades[2][0] = 45;
        edades[2][1] = 12;
        
        System.out.println("edades[0][0]: " + edades[0][0]);
        System.out.println("edades[0][1]: " + edades[0][1]);
        System.out.println("edades[0][1]: " + edades[1][0]);
        System.out.println("edades[0][1]: " + edades[1][1]);
        System.out.println("edades[0][1]: " + edades[2][0]);
        System.out.println("edades[0][1]: " + edades[2][1]);
        System.out.println("\n");
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades[" + i + "][" + j + "] = " + edades[i][j]);
            }            
        }
        
        String frutas[][] = {{"Banano", "Mazana", "Pera"}, {"Uva", "Naranja", "Limon", "Mora"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("frutas[" + i + "][" + j + "] = " + frutas[i][j]);
            }            
        }
        
        
        //MATRIZ CON OBJETOS
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[1][0] = new Persona("Pedro");
        personas[1][1] = new Persona("Carlos");
        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }            
        }
    }
}
