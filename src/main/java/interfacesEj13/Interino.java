/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesEj13;

import java.time.LocalDate;

/**
 *
 * @author alejandro
 */
//Clase final implica que no puede tener descendencia
public final class Interino extends Profesor implements Comparable<Interino> {
    
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Interino(LocalDate fechaInicio, LocalDate fechaFin, String especialidad, String nombre, String apellido, String nif, Direccion direccion) {
        super(especialidad, nombre, apellido, nif, direccion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterino{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

    @Override
    public int compareTo(Interino o) {
        return this.fechaInicio.compareTo(o.fechaInicio);
    }
}
