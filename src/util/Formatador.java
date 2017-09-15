/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author Loc
 */
public class Formatador {

    public static String f(double valor) {
        String s = NumberFormat.getCurrencyInstance().format(valor);
        return s;
    } // fim formatar

    public static String fD(Date data) {
        String s = DateFormat.getDateInstance().format(data);
        return s;
    }
    
    public static String fH(Date data) {
        String s = DateFormat.getTimeInstance().format(data);
        return s;
    }
}
