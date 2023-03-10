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
public final class Titular extends Profesor{
    
    private LocalDate fechaJubilacion;

    public Titular(LocalDate fechaJubilacion, String especialidad, String nombre, String apellido, String nif, Direccion direccion) {
        super(especialidad, nombre, apellido, nif, direccion);
        this.fechaJubilacion = fechaJubilacion;
    }

    public LocalDate getFechaJubilacion() {
        return fechaJubilacion;
    }

    public void setFechaJubilacion(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }

    @Override
    public String toString() {
        return "Titular{nombre=" + this.getNombre() + "fechaJubilacion=" + fechaJubilacion + '}';
    }
    
}
