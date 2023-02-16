/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.Random;

/**
 *
 * @author alejandro
 */
public class Dado extends Azar {

    public Dado() {
        super(6);
    }
    
    public Dado(int posibilidades){
        super(posibilidades);
    }

    @Override
    public int lanzar() {
        return new Random().nextInt(1, this.getPosibilidades() + 1);
    }
    
    public void metodoDado(){
        System.out.println("Dado");
    }
}
