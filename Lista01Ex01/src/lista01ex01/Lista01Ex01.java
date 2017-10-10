/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01ex01;

import java.util.Scanner;

/**
 *
 * @author Victor Henrique
 */
public class Lista01Ex01 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        double n1,n2;
        
        String entrada;
        
        System.out.print("ENTRE COM O PRIMEIRO NUMERO: ");
        entrada = in.next();
        n1 = Integer.parseInt(entrada);
        
        System.out.print("ENTRE COM O SEGUNDO NUMERO: ");
        entrada = in.next();
        n2 = Integer.parseInt(entrada);
        
        if(n2 < n1){
            System.out.println("O MAIOR NUMERO É: " + n1);
        }
        else if(n1 == n2){
            System.out.println("OS NUMEROS SÃO IGUAIS: " + n2);
        }
        else{
            System.out.println("O MAIOR NUMERO É: " + n2);
        }
    }
}
