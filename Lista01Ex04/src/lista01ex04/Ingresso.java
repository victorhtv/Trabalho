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
public class Ingresso {
    double valorIngresso;
    
    public void SetIngresso(double Ingresso){
        valorIngresso = Ingresso;
    }
    
    public String imprimeValor(){
        return "VALOR DO INGRESSO: R$ " + valorIngresso;
    }
    
}