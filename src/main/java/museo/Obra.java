/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Alejandro
 */
public abstract class Obra {
    
    private int id;
    private String autor;

    public Obra(int id, String autor) {
        this.id = id;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
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
        final Obra other = (Obra) obj;
        return this.id == other.id;
    }
}
