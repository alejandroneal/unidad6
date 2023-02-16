/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author alejandro
 */
public abstract class Empleado extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    @Override
    public String toString() { 
       String tmp = super.toString();
       return tmp + " " + this.salario;
    }
    
    public abstract void aumentarSalario(double n);
}
