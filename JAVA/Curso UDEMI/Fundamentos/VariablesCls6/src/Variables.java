
public class Variables {
    public static void main(String args[]) {
        // variables primitiva
        // Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        // Modificamos el valor de la varibale
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        // clase de java
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - inferencia de tipos en JAVA
        var miVariableEntera2 = 15 ;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Un saludo";
        //soutv + tab => rellena toda la linea siguiente automaticamete
        System.out.println("miVariableCadena2 = " + miVariableCadena2); 
    }
}
