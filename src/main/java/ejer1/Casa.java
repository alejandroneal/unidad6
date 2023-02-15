/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class Casa {
    
    private Puerta puerta;
    private List<Calefactor> listaCalefactor;
    private List<Ventana> listaVentanas;
    private double metrosCuadrados;

    public Casa() {
    }

    public Casa(Puerta puerta, double metrosCuadrados) {
        this.puerta = puerta;
        this.metrosCuadrados = metrosCuadrados;
        this.listaVentanas = new ArrayList<>();
        this.listaCalefactor = new ArrayList<>();
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa{");
        sb.append("puerta=").append(puerta);
        sb.append(", listaCalefactor=").append(listaCalefactor.toString());
        sb.append(", listaVentanas=").append(listaVentanas.toString());
        sb.append(", metrosCuadrados=").append(metrosCuadrados);
        sb.append('}');
        return sb.toString();
    }
}
