/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author alejandro
 */
public class CampanaExtractora extends Electrodomestico {
    
    private int decibelios;

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios < 50) {
            throw new IllegalArgumentException("Decibelios por debajo de lo establecido");
        }
        this.decibelios = decibelios;
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }
}
