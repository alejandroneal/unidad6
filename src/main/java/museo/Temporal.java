/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public final class Temporal extends Sala {
    
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Temporal(LocalDate fechaInicio, LocalDate fechaFin, List<Obra> obras, List<Sensor> alarmas, int id) {
        super(obras, alarmas, id);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    @Override
    public String toString() {
        return "Sala temporal{id=" + getId() + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
}
