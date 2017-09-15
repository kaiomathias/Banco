/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dominio.Banco;
import dominio.Cliente;
import dominio.ContaAPrazo;

/**
 *
 * @author Loc
 */
public class TesteBanco1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco = new Banco();
        Cliente c1 = new Cliente("Lucas Santos");
        ContaAPrazo cap1 = new ContaAPrazo(2);
        ContaAPrazo cap2 = new ContaAPrazo(2);
        c1.adicionar(cap1);
        c1.adicionar(cap2);
        
        Cliente c2 = new Cliente("Igor Ribeiro");
        ContaAPrazo cap3 = new ContaAPrazo(4);
        ContaAPrazo cap4 = new ContaAPrazo(4);
        c2.adicionar(cap3);
        c2.adicionar(cap4);
        
        banco.adicionar(c1);
        banco.adicionar(c2);
        
        cap1.depositar(500);
        cap2.depositar(500);
        cap3.depositar(1000);
        cap4.depositar(1000);
        
        System.out.println(cap2.sacar(600));
        System.out.println(cap3.sacar(600));
                     
        System.out.println(banco.exibirBanco());
    }
    
}
