/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Alejandro
 */
public final class Monitor extends Empleado {
    
    private String titulacion;

    public Monitor(String titulacion, String nif, String nombre) {
        super(nif, nombre);
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    @Override
    public String toString() {
        return "Monitor{nombre=" + getNombre() + ", nif=" + getNif() + ", titulacion=" + titulacion + '}';
    }
}
