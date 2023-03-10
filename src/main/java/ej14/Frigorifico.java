/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author alejandro
 */
public class Frigorifico extends Electrodomestico implements Silencioso {
    
    private double capacidad; //litros

    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Frigorifico{capacidad=" + capacidad + '}';
    }

    @Override
    public void silencioso() {
        System.out.println("El frigorífico modelo " + this.getModelo() + " emite 50dB");
    }
    
}
