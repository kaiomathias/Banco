/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loc
 */
public class Cliente {
    
    private static int lastCod = 0;

    public static int getLastCod() {
        return lastCod;
    }
    private int codigo;
    private String nome;
    private List<ContaAPrazo> contas;

    public Cliente(String nome) {
        this.codigo = calcularCodigo();
        this.nome = nome;
        contas = new ArrayList<>();
    }
    
    private int calcularCodigo(){
        return ++lastCod ;
    } //fim metodo
    
    public void adicionar(ContaAPrazo contaAPrazo){
        contas.add(contaAPrazo);
    } //fim metodo

    /*Getters e setters*/
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<ContaAPrazo> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String exibirCliente(){
        String info = "";
        info += "\nCliente: " + this.nome;
        info += "\n[Lista de contas]";
        info = contas.stream().map((c) -> c.exibirConta()).reduce(info, String::concat);
        return info;
    } // fim metodo exibirConta
} //fim classe 
