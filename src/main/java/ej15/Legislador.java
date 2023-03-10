/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author alejandro
 */
public abstract class Legislador extends Persona {
    
    private String provincia;
    private String partidoPolitico;

    public Legislador() {
    }

    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public String provinciaQueRepresenta() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String partidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return "Legislador{" + "provincia=" + provincia + ", partidoPolitico=" + partidoPolitico + ""
                + ", nombre=" + getNombre() + ", apellidos=" + getApellidos();
    }
    
    public abstract String getCamaraEnQueTrabaja();
}
