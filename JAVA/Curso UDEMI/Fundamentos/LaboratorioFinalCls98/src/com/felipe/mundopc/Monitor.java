/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipe.mundopc;

/**
 *
 * @author WilliamFelipe
 */
public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamano=").append(tamano);
        sb.append('}');
        return sb.toString();
    }
}
