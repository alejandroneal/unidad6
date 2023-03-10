/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author alejandro
 */
public abstract class Electrodomestico {
    
    private double consumo;
    private String modelo;

    public Electrodomestico(double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public String getModelo() {
        return modelo;
    }
}
