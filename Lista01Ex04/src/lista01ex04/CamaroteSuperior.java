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
public class CamaroteSuperior extends VIP {

    private double taxaSuperior = 100;
    private double valor = valorIngresso + taxaSuperior;

    public String camaroteSuperior() {
        return "INGRESSO CAMAROTE SUPERIOR: R$" + valor;
    }
}
