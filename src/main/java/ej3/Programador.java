/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author alejandro
 */
public class Programador extends Empleado {
    
    private Categoría categoría;

    public Categoría getCategoría() {
        return categoría;
    }

    public void setCategoría(Categoría categoría) {
        this.categoría = categoría;
    }

    public Programador() {
    }

    public Programador(Categoría categoría, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        String tmp = super.toString();
        return tmp + " " + this.categoría;
    }
    
    
}
