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
public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karen");
        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);
        
        for (var i = 0; i < personas.length; i++) {
            System.out.println("Persona[" + i + "] = " + personas[i]);
        }
    }
}
