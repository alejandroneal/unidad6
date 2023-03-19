/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Alejandro
 */
public final class Vigilante extends Empleado {
    
    private boolean disponible;

    public Vigilante(boolean atributo, String nif, String nombre) {
        super(nif, nombre);
        this.disponible = atributo;
    }

    public boolean  isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Vigilante{nombre" + getNombre() + ", nif=" + getNif() + ", disponible=" + disponible + '}';
    }
}
