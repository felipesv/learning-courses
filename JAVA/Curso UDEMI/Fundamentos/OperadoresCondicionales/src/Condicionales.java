
public class Condicionales {
    public static void main(String args[]) {
        //AND
        var a = 11;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= valorMinimo && a <= valorMaximo;
        if (resultado) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }
        
        //OR
        var vacaciones = false;
        var diaDescanso = true;
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }
}
