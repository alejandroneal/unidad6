/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

import java.util.HashSet;
import java.util.Set;
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
        this.numeroCuenta = numeroCuentaAle();
        this.saldo = 0;
        this.cliente = cliente;
    }
    
    private String numeroCuentaAle(){
        Set<String> generados =  new HashSet<>();
        boolean repetir = false;
        String resultado = "";
        while (!repetir){
            String numeroAux = RandomStringUtils.randomNumeric(20);
            if (!generados.contains(numeroAux)) {
                generados.add(numeroAux);
                resultado = numeroAux;
                repetir = true;
            }
        }
        return resultado;
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
    
    public void ingresar(double cantidad){
        setSaldo(getSaldo() + cantidad);
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirarSaldo(double cantidad);
}
