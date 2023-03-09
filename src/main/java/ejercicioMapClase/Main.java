/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMapClase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alejandro
 */
public class Main {
    public static void main(String[] args) {
        
        Silla s1 = new Silla(15.2, "Sillazas");
        Silla s2 = new Silla(4.7, "Sillitas");
        Silla s3 = new Silla(2.4, "Mini sillitas");
        Silla s4 = new Silla(7.5, "Sillas S.A.");
        Silla s5 = new Silla(1.6, "Plastiquitos");
        
        //Crear un map cuya key es un objeto Silla y el value un Integer
        Map<Silla,Double> aux = new TreeMap<>();
        aux.put(s1, s1.getPeso());
        aux.put(s2, s2.getPeso());
        aux.put(s3, s3.getPeso());
        aux.put(s4, s4.getPeso());
        aux.put(s5, s5.getPeso());
        
        for (Map.Entry<Silla, Double> entry : aux.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Silla=" + key.toString() + "\npeso=" + val);
        }
        
        System.out.println("");
        
        List<Silla> listaSillas = new ArrayList<>();
        listaSillas.add(s1);
        listaSillas.add(s2);
        listaSillas.add(s3);
        listaSillas.add(s4);
        listaSillas.add(s5);
        
        System.out.println("Lista de sillas śegún orden de inserción");
        listaSillas.forEach(s->System.out.println("Nombre: " + s.getMarca()));
        
        System.out.println("\nLista de sillas śegún orden natural");
        Collections.sort(listaSillas);
        listaSillas.forEach(s->System.out.println("Nombre: " + s.getMarca()));
        
        System.out.println("\nLista de sillas śegún peso");
        CriterioPeso criterioPeso = new CriterioPeso();
        //la variable criterio es de tipo CriterioPeso, Object, Comparator
        //Collections.sort(listaSillas,criterioPeso);
//        Collections.sort(listaSillas, new Comparator<Silla>(){
//            @Override
//            public int compare(Silla o1, Silla o2){
//                return Double.compare(o1.getPeso(), o2.getPeso());
//            }
//        });
        
        Comparator<Silla> criterio1 = ((o1, o2) -> Double.compare(o1.getPeso(), o2.getPeso()));
        Collections.sort(listaSillas, (o1, o2) -> Double.compare(o1.getPeso(), o2.getPeso()));
        listaSillas.forEach(System.out::println);
    }
}
