/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author alejandro
 */
public class Romboide extends Figura {
    
    public Romboide(int base, int altura) {
        super(base, altura);
    }

    @Override
    public String calcularArea() {
        int area = getBase()*getAltura();
        String texto = "Área del Romboide = " + area + "cm²";
        return texto;
    }
}
