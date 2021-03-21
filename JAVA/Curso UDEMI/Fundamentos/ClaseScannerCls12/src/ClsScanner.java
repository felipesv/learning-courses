
import java.util.Scanner;


public class ClsScanner {
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        //leer una linea desde la consola
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        
        
        
        //tarea
        Scanner console = new Scanner(System.in);
        System.out.println("Proporcionar el titulo");
        var title = console.nextLine();
        System.out.println("Proporcionar el autor");
        var author = console.nextLine();
        System.out.println(title + " fue escrito por " + author);
    }
}
