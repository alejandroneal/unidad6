/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class PruebaLegislador {
    public static void main(String[] args) {
        
        Legislador l1 = new Diputado(14, "Málaga", "PSOE", "Antonio", "Antonio");
        Legislador l2 = new Senador(1500, "Madrid", "PP", "Paco", "Paco");
        Legislador l3 = new Diputado(7, "Barcelona", "Podemos", "Juana", "Juana");
        Legislador l4 = new Senador(1300, "Murcia", "VOX", "Pepa", "Pepa");
        Legislador l5 = new Diputado(12, "Sevilla", "PP", "Manuel", "Manuel");
        Legislador l6 = new Senador(1250, "Toledo", "Ciudadanos", "Carlota", "Carlota");
        
        List<Legislador> lista = new ArrayList<>();
        lista.add(l6);
        lista.add(l5);
        lista.add(l1);
        lista.add(l4);
        lista.add(l2);
        lista.add(l3);
        
        for (Legislador legislador : lista) {
            System.out.println(legislador.getCamaraEnQueTrabaja());
            System.out.println(legislador.toString() + "\n");
        }
    }
}
