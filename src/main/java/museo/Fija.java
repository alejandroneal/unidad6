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
    
    private boolean estado;

    public Fija(boolean estado, List<Obra> obras, List<Sensor> alarmas, int id) {
        super(obras, alarmas, id);
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Sala fija{id=" + getId() + "estado=" + estado + '}';
    }
}
