/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precedenciaoperadorescls32;

/**
 *
 * @author WilliamFelipe
 */
public class PrecedenciaOperadoresCls32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var x = 5;
        var y = 10;
        var z = ++x + y--; // y primero se usa y luego se decrementas
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado  = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
    }
    
}
