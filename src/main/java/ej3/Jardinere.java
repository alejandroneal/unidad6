/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author alejandro
 */
public class Jardinere extends Empleado{
    private int antiguedad; //meses

    public Jardinere() {
    }

    public Jardinere(int antiguedad, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jardinere{");
        sb.append(super.toString());
        sb.append("antiguedad=").append(antiguedad);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public int compareTo(Persona p){
        return Integer.compare(this.antiguedad, ((Jardinere)p).antiguedad);
    }

    @Override
    public void aumentarSalario(double n) {
        this.setSalario(this.getSalario() + (n + 0.7));
    }
}
