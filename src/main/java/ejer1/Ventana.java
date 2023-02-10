/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author alejandro
 */
public class Ventana {
    
    private boolean abierta;
    private Persiana persiana;

    public Ventana() {
    }

    public Ventana(boolean abierta, Persiana persiana) {
        this.abierta = abierta;
        this.persiana = persiana;
    }

    @Override
    public String toString() {
        return "Ventana{" + "abierta=" + abierta + ", persiana=" + persiana + '}';
    }
    
    public void abrir(){
        this.abierta = true;
    }
    
    public void cerrar(){
        this.abierta = false;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }
    
    
}
