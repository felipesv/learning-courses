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
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    
    //constructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodos
    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno() {
        // int resultado = a + b;
        // return resultado;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        return this.sumarConRetorno();
    }
}
