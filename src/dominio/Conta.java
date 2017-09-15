/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Loc
 */
public abstract class Conta {

    private static int lastCod = 0;
    private final int codigoConta;
    private final Date dataAbertura;
    private double saldo;

    public Conta(double saldo) {
        this.codigoConta = calcularCodigo();
        this.dataAbertura = Calendar.getInstance().getTime();
        this.saldo = saldo;
    }

    private int calcularCodigo() {
        return ++lastCod;
    } //fim metodo

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } //fim if
    } // fim depositar   
    
    public abstract String exibirConta();
    public abstract String sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public int getCodigoConta() {
        return codigoConta;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
