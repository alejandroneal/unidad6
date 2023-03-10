/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author alejandro
 */
public class Microondas extends Electrodomestico implements Silencioso {
    
    private double potenciaMax; //vatios

    public Microondas(double potenciaMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }

    public double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return "Microondas{" + "potenciaMax=" + potenciaMax + '}';
    }

    @Override
    public void silencioso() {
        System.out.println("El microondas que consume " + this.getConsumo() + " emite 40dB");
    }
    
}
