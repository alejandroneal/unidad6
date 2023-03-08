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

    private static double interes = 1.5;

    public static double getInteres() {
        return interes;
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
            setSaldo(getSaldo() + (saldoMinimo*interes));
        } else {
            setSaldo(getSaldo() + (getSaldo() + interes));
        }
    }

    @Override
    public void retirarSaldo(double cantidad) {
        if ((getSaldo() - cantidad) > saldoMinimo) {
            setSaldo(getSaldo() - cantidad);
            actualizarSaldo();
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
        sb.append("saldoMinimo=").append(saldoMinimo);
        sb.append("número de cuenta=").append(getNumeroCuenta());
        sb.append("saldo=").append(getSaldo());
        sb.append("Persona=");
        sb.append("nif=").append(super.getCliente().getNif());
        sb.append("nombre=").append(super.getCliente().getNombre());
        sb.append("apellidos=").append(super.getCliente().getApellidos());
        sb.append('}');
        return sb.toString();
    }
}
