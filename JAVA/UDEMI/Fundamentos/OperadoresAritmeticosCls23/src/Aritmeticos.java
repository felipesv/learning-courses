
import java.util.Scanner;


public class Aritmeticos {
    public static void main(String args[]) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        // esta variable cuando se definio automaticamente el compilador
        // detecto que era un entero y por eso la division esta sin decimales
        resultado = a / b;
        System.out.println("resultado division = " + resultado);
        
        
        var resultado2 = (float) a / b;
        System.out.println("resultado2 division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        if (a % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
        
        if (b % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
        
        
        
        // ejercicio
        var consola = new Scanner(System.in);
        int alto, ancho;
        
        System.out.println("Proporcionar el alto:");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporcionar el ancho:");
        ancho = Integer.parseInt(consola.nextLine());
        System.out.println("Area: " + (alto * ancho));
        System.out.println("Perimetro: " + (alto + ancho) * 2);
        
    }
}
