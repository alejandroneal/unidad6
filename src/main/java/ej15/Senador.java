/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author alejandro
 */
public class Senador extends Legislador {

    private double complemento;

    public Senador() {
    }

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }
    
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senador";
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }
    
    @Override
    public String toString() {
        String tmp = super.toString();
        return tmp + " " + this.complemento;
    }
}
