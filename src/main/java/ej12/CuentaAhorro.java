/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author alejandro
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comisionAnual;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }
    
    @Override
    public void actualizarSaldo() {
        setSaldo(getSaldo() + (getSaldo()*interes) - comisionAnual);
        if (getSaldo() < 0) {
            setSaldo(0);
        }
    }

    @Override
    public void retirarSaldo(double cantidad) {
        if ((getSaldo() - cantidad) < 0) {
            setSaldo(0);
        } else {
            setSaldo(getSaldo() - cantidad);
        }
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente{");
        sb.append("\ncomision anual=").append(comisionAnual);
        sb.append("\ninteres variable=").append(interes);
        sb.append("\nnúmero de cuenta=").append(getNumeroCuenta());
        sb.append("\nsaldo=").append(getSaldo());
        sb.append("\nPersona=");
        sb.append("nif=").append(super.getCliente().getNif());
        sb.append("nombre=").append(super.getCliente().getNombre());
        sb.append("apellidos=").append(super.getCliente().getApellidos());
        sb.append("\n}");
        return sb.toString();
    }
}
