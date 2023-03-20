/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.List;

/**
 *
 * @author Alejandro
 */
public abstract class Sala {
    
    private List<Obra> obras;
    private Sensor sensorTemp;
    private Sensor sensorHum;
    private int id;

    public Sala(List<Obra> obras, Temperatura sensorTemp, Humedad sensorHum, int id) {
        this.obras = obras;
        this.sensorTemp = sensorTemp;
        this.sensorHum = sensorHum;
        this.id = id;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public Sensor getSensorTemp() {
        return sensorTemp;
    }

    public Sensor getSensorHum() {
        return sensorHum;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sala other = (Sala) obj;
        return this.id == other.id;
    }
}
