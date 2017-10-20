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
public class VIP extends Ingresso {
    private double valorAdicional = 150;
    private String localizacaoIngresso;
    
    public String ingressoVip() {
        valorIngresso = valorIngresso + valorAdicional;
       return "INGRESSO VIP: R$ " + valorIngresso;
    }
} 