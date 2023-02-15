/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author alejandro
 */
public class Abatible extends Ventana {
    
    private int numero;

    public Abatible(int numero, boolean abierta) {
        super(abierta);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Abatible{" + "numero=" + numero + ", abierta=" + this.isAbierta() + '}';
    }
    
    @Override
    public void abrir(){
        this.setAbierta(true);
        System.out.println("Ventana abatible abierta");
    }
    
    @Override
    public void cerrar(){
        this.setAbierta(false);
        System.out.println("Ventana abatible cerrada");
    }
}
