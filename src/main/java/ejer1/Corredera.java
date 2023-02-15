/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author alejandro
 */
public class Corredera extends Ventana {

    private int numero;
    private Persiana persiana;
    
    public Corredera(boolean abierta, Persiana persiana, int numero) {
        super(abierta);
        this.persiana = persiana;
        this.numero = numero;
    }

    public Corredera() {
    }

    @Override
    public String toString() {
        return "Corredera{" + "numero=" + numero + ", abierta=" + this.isAbierta()  + '}';
    }
    
    @Override
    public void abrir(){
        this.setAbierta(true);
        System.out.println("Ventana corredera abierta");
    }
    
    @Override
    public void cerrar(){
        this.setAbierta(false);
        System.out.println("Ventana corredera cerrada");
    }
}
