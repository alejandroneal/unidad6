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
public final class Fija extends Sala{
    
    private boolean disponible;

    public Fija(boolean estado, List<Obra> obras, Temperatura sensorTemp, Humedad sensorHum, int id) {
        super(obras, sensorTemp, sensorHum, id);
        this.disponible = estado;
    }

    public boolean isEstado() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Sala fija{id=" + getId() + "estado=" + disponible + '}';
    }
}
