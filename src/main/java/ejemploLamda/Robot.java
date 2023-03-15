/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package ejemploLamda;

/**
 *
 * @author alejandro
 */
public record Robot(int numSerie, int vida) implements Comparable<Robot>{

    @Override
    public int compareTo(Robot o) {
        return Integer.compare(this.numSerie, o.numSerie);
    }

}
