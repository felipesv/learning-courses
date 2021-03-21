
public class IgualdadRelacionales {

    public static void main(String args[]) {
        //igualdad
        var a = 3;
        var b = 2;

        // igualdad
        var c = (a == b);
        System.out.println("c = " + c);

        // diferente de
        var d = (a != b);
        System.out.println("d = " + d);

        var cadena1 = "hola";
        var cadena2 = "hola";
        var e = cadena1 == cadena2; // comparar referencias de objetos
        System.out.println("e = " + e);

        var f = cadena1.equals(cadena2); // comparar contenido de cadenas
        System.out.println("f = " + f);

        //relacionales
        var g = a >= b; // >, >=
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
