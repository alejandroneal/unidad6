/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Alejandro
 */
public final class Temperatura extends Sensor {
    
    public final double MAX_TMP = 22; //Cº
    public final double MIN_TMP = 10; //Cº
    private double temperaturaSala;

    public Temperatura(double temperaturaSala, int id) {
        super(id);
        this.temperaturaSala = temperaturaSala;
    }

    public double getMAX_TMP() {
        return MAX_TMP;
    }

    public double getMIN_TMP() {
        return MIN_TMP;
    }

    public double getTemperaturaSala() {
        return temperaturaSala;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "la temperatura de la sala es de " + temperaturaSala + "ºC" +  '}';
    }

    @Override
    public void alarma() {
        if (this.temperaturaSala < this.MIN_TMP) {
            System.out.println("¡ALARMA! LA TEMPERATURA ES DEMASIADO BAJA");
        } else if (this.temperaturaSala > this.MAX_TMP) {
            System.out.println("¡ALARMA! LA TEMPERATURA ES DEMASIADO ALTA");
        } else {
            System.out.println("La temperatura está dentro de los parámetros");
        }
    }
}
