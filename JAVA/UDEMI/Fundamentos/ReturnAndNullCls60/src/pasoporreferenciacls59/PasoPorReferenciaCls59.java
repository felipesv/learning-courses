/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferenciacls59;

import clases.Persona;

/**
 *
 * @author WilliamFelipe
 */
public class PasoPorReferenciaCls59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("persona1 nombre nuevo = " + persona1.nombre);
    }
    
    public static Persona cambiaValor(Persona persona) {
        persona.nombre = "Karla";
        return persona;
    }
}
