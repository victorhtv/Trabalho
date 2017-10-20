/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01ex04;

/**
 *
 * @author Victor Henrique
 */
import javax.swing.*;

public class Lista01Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ingresso ingresso = new Ingresso();

        ingresso.SetIngresso(50);
        System.out.println(ingresso.imprimeValor());
        String tipoIngresso = JOptionPane.showInputDialog("DIGITE 1 PARA INGRESSO NORMAL OU 2 PARA INGRESSO VIP: ");

        if (tipoIngresso.equals("2")) {
            String camarote = JOptionPane.showInputDialog("DIGITE 1 PARA CAMAROTE SUPERIOR OU 2 PARA CAMAROTE INFERIOR: ");
            if (camarote.equals("1")) {
                CamaroteSuperior vip1 = new CamaroteSuperior();

                System.out.println(vip1.camaroteSuperior());
            } else {
                CamaroteInferior vip2 = new CamaroteInferior();
                System.out.println(vip2.ingressoVip());
            }
        } else {
            System.out.println(ingresso.imprimeValor());
        }

    }

}
