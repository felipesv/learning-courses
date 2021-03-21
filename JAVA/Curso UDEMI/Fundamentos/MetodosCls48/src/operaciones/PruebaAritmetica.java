/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author WilliamFelipe
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        //Varables locales
        var a = 10;
        var b = 2;
        
        // para que se pueda ejecutar dentro de este metodo estatico debe ser tambien estatico
        miMetodo();
        
        //constructor vacio
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a = " + aritmetica1.a);
        System.out.println("aritmetica1 b = " + aritmetica1.b);
        
        //constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a = " + aritmetica2.a);
        System.out.println("aritmetica2 b = " + aritmetica2.b);
    }
    
    // el orden del public static puede ir static public
    public static void miMetodo() {
        //la variable 'a' esta fuera del alcance donde fue definida
        //a = 10
        System.out.println("Otro metodo");
    }
}
