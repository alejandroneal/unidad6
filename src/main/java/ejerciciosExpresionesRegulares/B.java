/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosExpresionesRegulares;

/**
 *
 * "ini 2 números fin"
 * ejemplo: ini77fin, ini93fin
 * ^ini\\d{2}fin$
 */
public class B {
    public static void main(String[] args) {
        
        String regexp = "^ini\\d{2}fin$";
        
        String ejemplo1 = "ini23fin";
        String ejemplo2 = "ini2fin";
        String ejemplo3 = "ini234fin";
        String ejemplo4 = "ini23fon";
        
        if (ejemplo1.matches(regexp)) {
            System.out.println("La cadena ejemplo1 coincide con la expresión regular");
        } else {
            System.out.println("La cade ejemplo1 no coincide con la expresión regular");
        }
        
        if (ejemplo2.matches(regexp)) {
            System.out.println("La cadena ejemplo2 coincide con la expresión regular");
        } else {
            System.out.println("La cade ejemplo2 no coincide con la expresión regular");
        }
        
        if (ejemplo3.matches(regexp)) {
            System.out.println("La cadena ejemplo3 coincide con la expresión regular");
        } else {
            System.out.println("La cade ejemplo3 no coincide con la expresión regular");
        }
        
        if (ejemplo4.matches(regexp)) {
            System.out.println("La cadena ejemplo4 coincide con la expresión regular");
        } else {
            System.out.println("La cade ejemplo4 no coincide con la expresión regular");
        }
    }
}
