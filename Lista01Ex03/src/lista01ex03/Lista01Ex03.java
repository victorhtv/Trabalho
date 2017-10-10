/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01ex03;

/**
 *
 * @author Victor Henrique
 */
public class Lista01Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        long impar = 0, par = 1, i = 1;

        while (i <= 30) {
            if (i % 2 == 0) {
                par = par * i;
            } else {
                impar = impar + i;
            }
            i++;
        }
        System.out.println("SOMA DOS ÍMPARES: " + impar);
        System.out.println("MULTIPLICAÇÃO DOS PARES: " + par);
    }

}
