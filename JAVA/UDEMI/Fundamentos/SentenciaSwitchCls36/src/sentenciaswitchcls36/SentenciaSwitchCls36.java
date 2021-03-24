/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaswitchcls36;

import java.util.Scanner;

/**
 *
 * @author WilliamFelipe
 */
public class SentenciaSwitchCls36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        var numero = 3;
        var numeroTexto = "Numero desconocido";
        
        switch(numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Nummero cuatro";
                break;
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
        
        //ejercicio de la estaciones del año
        var mes = 1;
        var estacion = "Estacion desconocida";
        
        switch(mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
        }
        
        System.out.println("estacion = " + estacion);
        
        
        //ejercicio de sistema de calificacion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var calificacion = Integer.parseInt(scanner.nextLine());
        switch (calificacion) {
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5: case 4: case 3: case 2: case 1:
                System.out.println("F");
                break;
        }
    }
    
}
