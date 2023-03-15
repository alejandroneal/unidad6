/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploLamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author alejandro
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Robot> lista  = getListaRobots(20);
        lista.forEach(System.out::println);
        //Ordenar por vida
        System.out.println("\nOrdenado por el porcentaje de vida de menor a mayor");
        Collections.sort(lista, (r1,r2)->Integer.compare(r1.vida(), r2.vida()));
        lista.forEach(System.out::println);
        
        System.out.println("\nOrdenado por el porcentaje de vida de mayor a menor");
        Comparator<Robot> menorMayor = (r1,r2)->Integer.compare(r1.vida(), r2.vida());
        Collections.sort(lista, menorMayor.reversed());
        lista.forEach(System.out::println);
        
        System.out.println("\nRobots con más del 50% de vida");
        for (Robot robot : lista) {
            if (robot.vida() >= 50) {
                System.out.println(robot);
            }
        }
        //Otra forma de hacer lo mismo de arriba pero más chulo con lamdas
        System.out.println("\nUsando API Stream. Robots con más de 50% vida");
        Stream<Robot> streamRobot = lista.stream();
//        lista.stream()
//                .filter(r->r.vida()>=50)
//                .forEach(r->System.out.println(r));
        
        Stream<Robot> streamRobotFiltrados = streamRobot.filter(r->r.vida()>=50);
        streamRobotFiltrados.forEach(System.out::println);
        
        System.out.println("\n3 Robots con mayor porcent. de vida");
        lista.stream()
                .limit(3)
                .forEach(r->System.out.println(r.numSerie()));
    }
    
    public static ArrayList<Robot> getListaRobots(int num){
        var listaRobots = new ArrayList<Robot>();
        Random random = new Random();
        
        if (num<=0) {
            throw new IllegalArgumentException("El número de robots a crear no es válido");
        }
        
        for (int i = 0; i < num; i++) {
            listaRobots.add(new Robot(random.nextInt(0, 5000), random.nextInt(1, 101)));
        }
        
        return listaRobots;
    }
}
