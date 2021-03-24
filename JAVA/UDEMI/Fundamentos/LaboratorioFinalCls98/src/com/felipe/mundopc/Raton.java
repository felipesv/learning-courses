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
public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
