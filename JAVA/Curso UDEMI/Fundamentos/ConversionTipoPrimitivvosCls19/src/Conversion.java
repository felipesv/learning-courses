
import java.util.Scanner;

public class Conversion {

    public static void main(String args[]) {
        // Conversion tipos de string a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));

        //Conversion tipos de string a un tipo double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        //edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        
        //Convertir tipos de int to string 
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        // convertir de tipo string to char
        // get value at specific index
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        
        // TAREA A RESOLVER
        System.out.println("Proporcionar el nombre:");
        var nombre = consola.nextLine();
        System.out.println("Proporcionar el id:");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporcionar el precio:");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporcionar el envio gratuito;");
        var envio = Boolean.parseBoolean(consola.nextLine());
        System.out.println(nombre + " #" + id);
        System.out.println("precio: $" + precio);
        System.out.println("Envio Gratuito: " + envio);
    }
}
