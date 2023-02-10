/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author alejandro
 */
public class Casa {
    
    private Puerta puerta;
    private Calefactor calefactor;
    private Ventana ventana;

    public Casa() {
    }

    public Casa(Puerta puerta, Calefactor calefactor, Ventana ventana) {
        this.puerta = puerta;
        this.calefactor = calefactor;
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "Casa{" + "puerta=" + puerta + ", calefactor=" + calefactor + ", ventana=" + ventana + '}';
    }
    
    
}
