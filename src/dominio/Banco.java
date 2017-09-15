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
public class Banco {
    
    private static final String NUM_FEBRABAN = "003";
    private List<Cliente> clientes;
    
    public Banco() {
        clientes = new ArrayList<>();
    }
    
    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public String exibirBanco() {
        String info = "";
        info += "Banco: " + NUM_FEBRABAN;
        info = clientes.stream().map((c) -> c.exibirCliente()).reduce(info, String::concat);
        return info;
    }
}
