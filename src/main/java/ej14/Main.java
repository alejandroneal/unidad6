/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class Main {
    public static void main(String[] args) {
        
        List<Silencioso> lista = new ArrayList<>();
        
        lista.add(new Frigorifico(50, 40, "Chulísimo"));
        lista.add(new Microondas(200, 70, "Guapísimo"));
        //No se puede añadir objetos de tipo CampanaExtractora porque esta clase no implementa la 
        //interfaz Silencioso
        //lista.add(new CampanaExtractora(70, 20, "Espectacular"));
        
        for (Silencioso silencioso : lista) {
            silencioso.silencioso();
        }
    }
}
