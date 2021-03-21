/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author WilliamFelipe
 */
public class Persona {
    private String nombre;
    private double sueldo;
    private Boolean eliminado;
    
    public Persona(String nombre, double sueldo, Boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public Boolean isEliminado() {
        return this.eliminado;
    }
    
    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString() {
        return "Persona [nombre: " +  this.nombre +
               ", sueldo: " + this.sueldo +
               ", eliminado: " + this.eliminado + "]";
    }
}
