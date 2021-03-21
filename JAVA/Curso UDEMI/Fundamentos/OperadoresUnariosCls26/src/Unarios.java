
public class Unarios {

    public static void main(String args[]) {
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // incremento
        //preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; // primero se incrementa e y luego usa su valor

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //posincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; // primero se utiliza el valor de g y luego se incrementa
        
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //posdecremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
