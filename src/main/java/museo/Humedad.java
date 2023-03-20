/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Alejandro
 */
public final class Humedad extends Sensor {
    
    public final int MAX_HUM = 55; //se mide en %
    public final int MIN_HUM = 10; // se mide en %

    public Humedad(int id) {
        super(id);
    }

    public int getMAX_HUM() {
        return MAX_HUM;
    }

    public int getMIN_HUM() {
        return MIN_HUM;
    }

    @Override
    public void alarma(double humedadSala) {
        if (humedadSala < this.MIN_HUM) {
            System.out.println("¡ALARMA! LA HUMEDAD ES DEMASIADO BAJA");
        } else if(humedadSala > this.MAX_HUM){
            System.out.println("¡ALARMA! LA HUMEDAD ES DEMASIADO ALTA");
        } else {
            System.out.println("La humedad está dentro de los parámetros");
        }
    }
}
