/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.Random;

/**
 *
 * @author alejandro
 */
public class Pictorico extends Conservador {

    public Pictorico(int numHerramientas, String nif, String nombre) {
        super(numHerramientas, nif, nombre);
    }

    @Override
    public void restaurar(Obra obra) {
        if (obra instanceof Pintura) {
            Random random = new Random();
            if (random.nextInt(0, 3) == 0) {
                System.out.println("El restaurador " + getNombre() + " ha resaurado la pintura " + obra.getId());
            } else {
                System.out.println("El restaurador " + getNombre() + " no ha conseguido restaurar la pintura "
                    + obra.getId() + ". Vaya chapuzas");
            }
        } else {
            System.out.println("La obra " + obra.getId() + " no es una pintura, no puedo restaurarla");
        }
    }
    
}
