/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_elsecls33;

/**
 *
 * @author WilliamFelipe
 */
public class If_elseCls33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var condicion = true;
        
        if(condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
        
        
        //ejericio de estaciones del año
        var mes = 1;
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if(mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }
        
        System.out.println("estacion = " + estacion);
    }
    
}
