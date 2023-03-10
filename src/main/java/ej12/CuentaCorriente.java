/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author alejandro
 */
public class CuentaCorriente extends Cuenta {

    private final static double INTERES = 1.5;

    public static double getInteres() {
        return INTERES;
    }
    private double saldoMinimo;
    
    public CuentaCorriente() {
    }

    public CuentaCorriente(double saldoMinimo, Persona cliente) {
        super(cliente);
        this.saldoMinimo = saldoMinimo;
    }
    
    @Override
    public void actualizarSaldo() {
        if (getSaldo() > 1000) {
            setSaldo(getSaldo() + (saldoMinimo*INTERES));
        } else {
            setSaldo(getSaldo() + (getSaldo() + INTERES));
        }
    }

    @Override
    public void retirarSaldo(double cantidad) {
        if ((getSaldo() - cantidad) > saldoMinimo) {
            setSaldo(getSaldo() - cantidad);
        }
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente{");
        sb.append("\nsaldoMinimo=").append(saldoMinimo);
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
