/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Cumplir letraNumero tantos como se quiera
 * [A-Za-z][0-9]
 */
public class C {
    public static void main(String[] args) {
        
        String regexp = "[A-Za-z][0-9]";
        String regexp2 = "^([A-Za-z][0-9])+$";
        
        String ejemplo1 = "a3v4r4";
        String ejemplo2 = "aa2e223";
        
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(ejemplo1);
        
        System.out.println("Patrones encontrados en la cadena ejemplo1");
        while (matcher.find()) {            
            System.out.println("\tPatrón encontrado: " + matcher.group());
        }
        
        matcher = pattern.matcher(ejemplo2);
        System.out.println("Patrones encontrados en la cadena ejemplo2");
        while (matcher.find()) {            
            System.out.println("\tPatrón encontrado: " + matcher.group());
        }
        
        System.out.println("");
        
        
        if (ejemplo1.matches(regexp2)) {
            System.out.println("La cadena ejemplo1 coincide con la expresión regular");
        } else {
            System.out.println("La cade ejemplo1 no coincide con la expresión regular");
        }
        
        if (ejemplo2.matches(regexp2)) {
            System.out.println("La cadena ejemplo2 coincide con la expresión regular");
        } else {
            System.out.println("La cade ejemplo2 no coincide con la expresión regular");
        }
        
    }
}
