/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class EjemploAzar {
    public static void main(String[] args) {
        
        List<Azar> objetosAzar =  new ArrayList<>();
        objetosAzar.add(new Moneda()); //conversión implicita
        objetosAzar.add(new Dado()); //conversión implicita
        
        for (Azar a : objetosAzar) {
            System.out.println("Lanzamiento " + a.lanzar());
            //variable eres un dado?
            if (a instanceof Dado) {
                ((Dado) a).metodoDado(); //conversión explicita
            }
            
        }
        
    }
}
