/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.felipe.mundopc.*;

/**
 *
 * @author WilliamFelipe
 */
public class MundoPc {
    public static void main(String[] args) {
        Raton raton1 = new Raton("USB", "ASUS");
        Raton raton2 = new Raton("USB", "HP");
        Teclado teclado1 = new Teclado("Bluetooth", "ASUS");
        Teclado teclado2 = new Teclado("USB", "HP");
        Monitor monitor1 = new Monitor("ASUS", 15.00);
        Monitor monitor2 = new Monitor("HP", 10.00);
        Computadora computadora1 = new Computadora("Asus 235", monitor1, teclado1, raton1);
        Computadora computadora2 = new Computadora("HP-3", monitor2, teclado2, raton2);        
        Orden orden = new Orden();
        orden.agregarComputadora(computadora1);
        orden.agregarComputadora(computadora2);
        orden.mostrarOrden();
        
    }
}
