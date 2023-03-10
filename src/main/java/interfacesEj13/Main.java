/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesEj13;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class Main {
    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<>();
        List<Identificable> objetosIdentificables = new ArrayList<>();
        
        lista.add(new Estudiante("1", "Pepito", "Grillo", "1", 
                new Direccion(" ", " ", " ", " ")));
        lista.add(new Titular(LocalDate.now(), "Maestro repostero", 
                "Jaimito", "Pérez", "2", new Direccion(" ", " ", " ", " "))); 
       lista.add(new Interino(LocalDate.MIN, LocalDate.MIN, 
               "Matemáticas", "Manolito", "Polinomio", "3", 
               new Direccion(" ", " ", " ", " ")));
       
       objetosIdentificables.add(new Estudiante("1", "Pepito", "Grillo", "1", 
                new Direccion(" ", " ", " ", " ")));
       
        for (Persona persona : lista) {
            persona.identificate();
        }
        
        for (Persona persona : lista) {
            if (persona instanceof Interino) {
                var tmp = ((Interino) persona).getFechaInicio();
                System.out.println(tmp);
            }
            if (persona instanceof Titular) {
                var tmp = ((Titular) persona).getFechaJubilacion();
                System.out.println(tmp);
            }
            if (persona instanceof Estudiante) {
                ((Estudiante) persona).estudiarPoco();
            }
            if (persona instanceof Identificable) {
                System.out.println("Soy identificable");
            }
        }
    }
}
