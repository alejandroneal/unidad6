/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesEj13;

/**
 *
 * @author alejandro
 */
public abstract class Profesor extends Persona {
    
    private String especialidad;

    public Profesor(String especialidad, String nombre, String apellido, String nif, Direccion direccion) {
        super(nombre, apellido, nif, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{nombre=" + this.getNombre() + "especialidad=" + especialidad + '}';
    }
    
    //El método final imploca que no puede ser sobrescrito
    @Override
    public final void identificate(){
        System.out.println("Soy un profesor");
    }
}
