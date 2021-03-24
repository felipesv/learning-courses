
public class Concatenacion {

    public static void main(String args[]) {
        /*si hay muchas lineas que no llevan un formato que no estan bien
        identadas se les da el formato con alt+Shift+f*/
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        
        var i = 3;
        var j = 4;
        // suma de numeros
        System.out.println(i + j);
        // se evalua de izquierda a derecha
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        // contexto cadena, empieza con una cadena todo es una cadena
        System.out.println(usuario + i + j);
        // prioridad por parentesis
        System.out.println(usuario + (i + j));
    }
}
