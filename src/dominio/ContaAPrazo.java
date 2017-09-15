/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Calendar;
import java.util.Date;
import util.Formatador;

/**
 *
 * @author Loc
 */
public class ContaAPrazo extends Conta {

    private final Date dataMaturidade;

    public ContaAPrazo(int meses, double saldo) {
        super(saldo);
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, meses);
        Date dataM = c.getTime();
        this.dataMaturidade = dataM;

    } // fim construtor

    public ContaAPrazo(int meses) {
        this(meses, 0);
    } // fim construtor;

    public String sacar(double valor) {
        String resp = "";
        Calendar c = Calendar.getInstance();
        if (c.after(this.dataMaturidade)) {
            if (super.getSaldo() >= valor) {
                super.setSaldo(super.getSaldo() - valor); 
                resp += "Saque autorizado!\n";
                resp += "Saldo restante: " + Formatador.f(super.getSaldo());
            } else {
                resp += "Saque não autorizado!\n";
                resp += "Saldo disponível: " + Formatador.f(super.getSaldo());

            } //fim if
        } else {
            resp += "\nSaque não autorizado!\n";
            resp += "\nData de maturidade não atingida";
            resp += "\nData de maturidade: " + Formatador.fD(dataMaturidade);
            resp += "\nHora Maturidade: " + Formatador.fH(dataMaturidade);
        }//fim if
        return resp;
    } // fim sacar

    public String exibirConta() {
        String info = "";
        info += "\nConta: " + super.getCodigoConta();
        info += "\nMaturidade: " + Formatador.fD(dataMaturidade);
        info += "\nDt.Abertura: " + Formatador.fD(super.getDataAbertura());
        info += "\nSaldo: " + Formatador.f(super.getSaldo());
        return info;
    }
} // fim classe
