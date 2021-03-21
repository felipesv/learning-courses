/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

/**
 *
 * @author WilliamFelipe
 */
public class TestHerencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juana");
        System.out.println("persona1 = " + persona1);
        
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente = new Cliente(new Date(), true, "Roberto", 'M', 56, "Siempre viva");
        System.out.println("cliente = " + cliente);
    }
}
