
import java.util.Scanner;


public class Ternario {
    public static void main(String args[]) {
        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultado = " + resultado);
        
        
        //tarea
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2:");
        var numero2 = Integer.parseInt(consola.nextLine());
        var mayor = (numero1 >= numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es:\n" + mayor);
    }
}
