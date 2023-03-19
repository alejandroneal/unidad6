/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Alejandro
 */
public class Museo {
    
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Sala> salas;

    public Museo(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.direccion);
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
        final Museo other = (Museo) obj;
        return Objects.equals(this.direccion, other.direccion);
    }
    
    public void contratar(Empleado empleado){
        this.empleados.add(empleado);
    }
    
    public void despedir(Empleado empleado){
        this.empleados.remove(empleado);
    }
    
    public void anadirSala(Sala sala){
        this.salas.add(sala);
    }
    
    public void quitarSala(Sala sala){
        this.salas.remove(sala);
    }
}
