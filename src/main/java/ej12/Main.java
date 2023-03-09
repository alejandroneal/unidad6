/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class Main {
    public static void main(String[] args) {
        
        List<Cuenta> cuentas = new ArrayList<>();
        
        Persona p1 = new Persona("Juan", "Juanito Juanillo", "1111");
        Persona p2 = new Persona("Tere", "Teresilla Teresa", "2222");
        Persona p3 = new Persona("María", "Guerrero Lorca", "3333");
        Persona p4 = new Persona("Paco", "Paquillo Paquito", "4444");
        
        Cuenta ca1 = new CuentaAhorro(2.3, 20, p1);
        Cuenta ca2 = new CuentaAhorro(1.2, 50, p2);
        Cuenta cc1 = new CuentaCorriente(300, p3);
        Cuenta cc2 = new CuentaCorriente(500, p4);
        
        cuentas.add(ca1);
        cuentas.add(ca2);
        cuentas.add(cc1);
        cuentas.add(cc2);
        
        for (Cuenta c : cuentas) {
            System.out.println(c.toString());
            System.out.println("");
            if (c instanceof CuentaAhorro) {
                c.setSaldo(1500);
                c.actualizarSaldo();
                System.out.println(c.getSaldo());
            } else if (c instanceof CuentaCorriente) {
                c.setSaldo(1780);
                c.actualizarSaldo();
                System.out.println(c.getSaldo());
            }
        }
    }
}
