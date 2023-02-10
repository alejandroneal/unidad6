/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author alejandro
 */
public class Persiana {
    
    private boolean subida;

    public Persiana() {
    }

    public Persiana(boolean subida) {
        this.subida = subida;
    }
    
    public void subir(){
        this.subida = true;
    }
    
    public void bajar(){
        this.subida = false;
    }
}
