/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloscls39;

/**
 *
 * @author WilliamFelipe
 */
public class CiclosCls39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ciclo while
        var contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        
        //ciclo do while
        contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while(contador < 3);
        
        //ciclo for
        for (var cnt = 0; cnt < 3; cnt++) {
            System.out.println("cnt = " + cnt);
        }
    }
    
}
