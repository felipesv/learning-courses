/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WilliamFelipe
 */
public class CaracteresEspeciales {
    public static void main(String args[]) {
        var nombre = "Karla";
        
        System.out.println("Nueva linea: \n" + nombre); // salto de linea
        System.out.println("Tabulador: \t" + nombre); // tabulador
        // cada /b es iniciar un caracter atras por eso se pierde el espacio
        System.out.println("Retroceso: \b" + nombre); // retroceso
        // la comilla simple sirve sin el \
        System.out.println("Commilla simple: \'" + nombre + "\'"); // comilla simple
        System.out.println("Commilla doble: \"" + nombre + "\""); // comilla doble
    }
}
