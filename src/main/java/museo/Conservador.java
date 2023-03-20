/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author alejandro
 */
public abstract class Conservador extends Empleado implements Restaurador{
    
    private int numHerramientas;

    public Conservador(int numHerramientas, String nif, String nombre) {
        super(nif, nombre);
        this.numHerramientas = numHerramientas;
    }

    public int getNumHerramientas() {
        return numHerramientas;
    }
}
