/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author alejandro
 */
public class Calefactor {
    
    private int temperatura;
    private boolean encendido;

    public Calefactor() {
    }

    public Calefactor(int temperatura, boolean encendido) {
        this.temperatura = temperatura;
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Calefactor{" + "temperatura=" + temperatura + ", encendido=" + encendido + '}';
    }
    
    public void encender(){
        this.encendido = true;
    }
    
    public void apagar(){
        this.encendido  = false;
    }
    
    public void fijarTemperatura(int temp){
        this.temperatura = temp;
    }
}
