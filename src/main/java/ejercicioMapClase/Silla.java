/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMapClase;

import java.util.Objects;

/**
 *
 * @author alejandro
 */
public class Silla implements Comparable<Silla>{
    
    private double peso;
    private String marca;

    public Silla() {
    }

    public Silla(double peso, String marca) {
        this.peso = peso;
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Silla{" + "peso=" + peso + ", marca=" + marca + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Silla other = (Silla) obj;
        return Objects.equals(this.marca, other.marca);
    }

    @Override
    public int compareTo(Silla o) {
        return this.marca.compareToIgnoreCase(o.marca);
    }
    
    
}
