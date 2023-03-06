/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author alejandro
 */
public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public String calcularArea() {
        int area = getBase()*getAltura();
        String texto = "Área del Rectángulo = " + area + "cm²";
        return texto;
    }
    
}
