/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alejandro
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta() {
    }

    public Cuenta(Persona cliente) {
        this.numeroCuenta = RandomStringUtils.randomNumeric(20);
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirarSaldo(double cantidad);
}
