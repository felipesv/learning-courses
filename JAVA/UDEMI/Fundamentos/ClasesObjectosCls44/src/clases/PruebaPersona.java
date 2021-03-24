/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author WilliamFelipe
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();

        System.out.println("persona1 = " + persona1); // despues del @ es la referencia a la memoria RAM
        System.out.println("persona2 = " + persona2); // despues del @ es la referencia a la memoria RAM
        
        persona2.desplegarInformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
    }
}
