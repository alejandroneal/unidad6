/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author alejandro
 */
public class Prueba {

    public static void main(String[] args) {
        Persona p1 = new Programador(Categoría.ANALISTA, 0, "", "", 0);

        Programador pr1 = new Programador(Categoría.ANALISTA, 10, "Paco", "12", 0);

        Persona x = pr1;
        System.out.println(x.toString());
    }
}
