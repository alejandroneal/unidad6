/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Alejandro
 */
public final class Cuadro extends Obra {
    
    private String estilo;

    public Cuadro(String estilo, int id, String autor) {
        super(id, autor);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    @Override
    public String toString() {
        return "Cuadro{autor=" + getAutor() + ", id=" + getId() + ", estilo=" + estilo + '}';
    }
}
