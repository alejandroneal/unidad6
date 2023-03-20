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

    public Temperatura(int id) {
        super(id);
    }

    public double getMAX_TMP() {
        return MAX_TMP;
    }

    public double getMIN_TMP() {
        return MIN_TMP;
    }

    @Override
    public void alarma(double temperaturaSala) {
        if (temperaturaSala < this.MIN_TMP) {
            System.out.println("¡ALARMA! LA TEMPERATURA ES DEMASIADO BAJA");
        } else if (temperaturaSala > this.MAX_TMP) {
            System.out.println("¡ALARMA! LA TEMPERATURA ES DEMASIADO ALTA");
        } else {
            System.out.println("La temperatura está dentro de los parámetros");
        }
    }
}
