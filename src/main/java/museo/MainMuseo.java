/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class MainMuseo {
    public static void main(String[] args) {
        //Creo a los empleados
        Empleado escultorico = new Escultorico(7, "47586698", "Escultorico");
        Empleado pictorico = new Pictorico(4, "54525369", "Pictorico");
        
        //Creo las obras
        Obra cuadro = new Pintura("Impresionista", 1, "Monet");
        Obra escultura = new Escultura("Marmol", 2, "Miguel Ángel");
        
        List<Obra> listaObras1 = new ArrayList<>();
        listaObras1.add(cuadro);
        List<Obra> listaObras2 = new ArrayList<>();
        listaObras2.add(escultura);
        
        //Creo los sensores
        Temperatura sensor1 = new Temperatura(1);
        Humedad sensor2 = new Humedad(2);
        
        //Creo las salas
        Sala sala1 = new Fija(true, listaObras1, sensor1, sensor2, 1);
        Sala sala2 = new Fija(true, listaObras2, sensor1, sensor2, 2);
        
        Museo museo = new Museo("Museo del Prado", "Calle nosecuantos");
        museo.anadirSala(sala1);
        museo.anadirSala(sala2);
        museo.contratar(pictorico);
        museo.contratar(escultorico);
        
        for (Empleado empleado : museo.getEmpleados()) {
            if (empleado instanceof Pictorico) {
                for (Sala sala : museo.getSalas()) {
                    for (Obra obra : sala.getObras()) {
                        ((Pictorico) empleado).restaurar(obra);
                    }
                }
            }
        }
    }
}
