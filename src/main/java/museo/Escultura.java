/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Alejandro
 */
public final class Escultura extends Obra {
    
    private String material;

    public Escultura(String material, int id, String autor) {
        super(id, autor);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Escultura{autor=" + getAutor() + ", id=" + getId() + ", material=" + material + '}';
    }
}
