/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesEj13;

/**
 *
 * @author alejandro
 */
public class Estudiante extends Persona {
    
    private String id;

    public Estudiante(String id, String nombre, String apellido, String nif, Direccion direccion) {
        super(nombre, apellido, nif, direccion);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudiante{nombre=" + this.getNombre() + "id=" + id + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un estudiante");
    }
    public void estudiarPoco(){
        System.out.println("Estudio, pero poco");
    }
}
