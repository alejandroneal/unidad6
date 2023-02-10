/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author alejandro
 */
public class Puerta {
    
    private String material;
    private boolean abierta;

    public Puerta(String material, boolean abierta) {
        this.material = material;
        this.abierta = abierta;
    }

    public Puerta() {
    }

    @Override
    public String toString() {
        return "Puerta{" + "material=" + material + ", abierta=" + abierta + '}';
    }
    
    public void abrir(){
        this.abierta = true;
    }
    
    public void cerrar(){
        this.abierta = false;
    }
}
