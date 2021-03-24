/*
    byte: 8 bits, default 0, -128 to 127
    short: 16 bits default  0, -32768 to 32767
    char: 16 bits default \u0000, 0 to 65535
    int:  32 bits default 0, -2^31 to 2^31-1
    long: 64 bits default 0, -2^63 to 2^63-1
    float: 32 bits, default 0.0, 1,4e-045 to 3.4e+038
    double: 64 bits, default 0.0, 4.9e-324 to 1.8e+308
*/
public class TipoPrimitivo {
    public static void main(String args[]) {
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        
        // intenta hacer la conversion dentro del rango byte
        // la literal (128) por default es int al superar el tamaño del byte
        byte numeroByte = (byte) 128;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        System.out.println("-------------------------------------");
        
        // intenta hacer la conversion dentro del rango short
        // la literal (32768) por default es int al superar el tamaño del short
        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);
        System.out.println("-------------------------------------");
        
        // por default el literal es int pero como tmbien supera int toca ponerlo
        // con un literal mayor añadiendole la L al final que seria long
        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo int:" + Integer.MAX_VALUE);
        System.out.println("-------------------------------------");
        
        // la literal por default es int pero como el numero supera int toca ponerlo
        // con un literal mayyor que es long con la L
        long numeroLong = 9223372036854775807L;
        // aqui ya supera tanto el int como el long y toca empezar con el float o
        // el double añadiendo la F o la D con el cast
        long numeroLong2 = (long) 9223372036854775808F;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroLong2 = " + numeroLong2);
        System.out.println("Valor minimo long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo long:" + Long.MAX_VALUE);
        System.out.println("-------------------------------------");
        
        
        
        /*
            tipos primitivos flotantes: float, doule
        */
        // por default las literales en float son de tipo double
        // para eso  se le pone que la literal sea float con la F al final´o haciendo el cast 
        float numeroFloat = (float) 3.4028235E38F;
        // como la literal tambien supera la float toca ponerle la D y hacer el cast 
        // no sale el valor exacto porque el rango de float es menor y como es tan grande tiende a infinito
        float numeroFloat2 = (float) 3.4028236E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroFloat2 = " + numeroFloat2);
        System.out.println("Valor minimo float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo float:" + Float.MAX_VALUE);
        System.out.println("-------------------------------------");
        
        // no es necesario hacerle cast o indicarle que es double
        // por default las literales que tienen un . (decimal) son double
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo double:" + Double.MAX_VALUE);
        System.out.println("-------------------------------------");
        
        
        /*
            tipos primitivos char
            se puden usar los uni code o el valor decimal
            https://en.wikipedia.org/wiki/List_of_Unicode_characters
        */
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        System.out.println("-------------------------------------");
        
        // bakslash + u indica que vamos a usar un valor unicode
        char varChar = '\u0021'; // represantacion del signo de admiracion por uni code
        System.out.println("varChar = " + varChar);
        System.out.println("-------------------------------------");
        
        char varCharDecimal = 33; // represantacion del signo de admiracion por decimal
        System.out.println("varCharDecimal = " + varCharDecimal);
        System.out.println("-------------------------------------");
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        System.out.println("-------------------------------------");
        
        
        //Lo mismo utilizando var
        // bakslash + u indica que vamos a usar un valor unicode
        var varChar1 = '\u0021'; // represantacion del signo de admiracion por uni code
        System.out.println("varChar = " + varChar1);
        System.out.println("-------------------------------------");
        
        // usando var toca indicarle o hacer el cast a char porqu utomaticamente la literal
        // la toma como entera
        var varCharDecimal2 = (char) 33; // represantacion del signo de admiracion por decimal
        System.out.println("varCharDecimal = " + varCharDecimal2);
        System.out.println("-------------------------------------");
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo3);
        System.out.println("-------------------------------------");
        
        //char to int
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        System.out.println("-------------------------------------");
        
        
        
        /*
            tipo primitivo booleano: false, true
            valores de tipo bandera (siga o no)
        */
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
            
        var edad = 30;
        var esAdulto = edad >= 18; // boolean con expresion en variable
        
        if (esAdulto) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
