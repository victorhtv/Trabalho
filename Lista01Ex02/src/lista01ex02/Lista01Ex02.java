/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01ex02;

import java.util.Scanner;

/**
 *
 * @author Victor Henrique
 */
public class Lista01Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        double NumeroDecrescente,i;
        
        String entrada;
        
        System.out.print("ENTRE COM O NUMERO: ");
        entrada = in.next();
        NumeroDecrescente = Integer.parseInt(entrada);
        
        i = NumeroDecrescente;
        
      while(i <= NumeroDecrescente && i>=0){
            System.out.println("NUMERO DECRESCENTE: "+ i);
            i--;
            
        }
        
        
    }
    
}
