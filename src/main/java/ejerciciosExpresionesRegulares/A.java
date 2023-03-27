/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosExpresionesRegulares;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Detectar N,S,E,O
 * N|S|E|O
 */
public class A {
    public static void main(String[] args) {
        
        String regexp = "(Localización: )([N|S|E|O])";
        
        String ejemplo1 = "Localización: N";
        String ejemplo2 = "Localización: S";
        String ejemplo3 = "Localización: E";
        String ejemplo4 = "Localización: O";
        
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
        System.out.println("");
        final Pattern pattern = Pattern.compile(regexp, Pattern.MULTILINE);
        
        List<String> lista = new ArrayList<>();
        lista.add(ejemplo1);
        lista.add(ejemplo2);
        lista.add(ejemplo3);
        lista.add(ejemplo4);
        
        
        for (int j = 0; j < lista.size(); j++) {
            final Matcher matcher = pattern.matcher(lista.get(j));
        
        while (matcher.find()) {            
            System.out.println("Full match: " + matcher.group(0));
            
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i +": " + matcher.group(i));
            }
            System.out.println("");
        }
        
        }
    }
}
