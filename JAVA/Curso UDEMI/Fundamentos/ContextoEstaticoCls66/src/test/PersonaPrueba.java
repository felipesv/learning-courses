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
public class PersonaPrueba {
    // es estatico para que el compilador llame referenciando la clase directamente
    // y no tenga que crear un objeto de esta clase
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Karla");
        PersonaPrueba personaPrueba = new PersonaPrueba();
        
        personaPrueba.imprimir(persona1);
        imprimir2(persona2);
    }
    
    public void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
    
    public static void imprimir2(Persona persona) {
        System.out.println("persona = " + persona);
    }
}
