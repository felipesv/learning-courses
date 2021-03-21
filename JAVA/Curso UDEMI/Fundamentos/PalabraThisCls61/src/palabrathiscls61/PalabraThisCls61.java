/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathiscls61;

/**
 *
 * @author WilliamFelipe
 */
public class PalabraThisCls61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre = " + persona.nombre);
        System.out.println("persona apellido = " + persona.apellido);
    }
    
}

class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido) {
        //super(); llamada implicita al constructor padre de la clase padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this = " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir = " + persona);        
        System.out.println("Impresion del objecto actual(this)" + this);
    }
}