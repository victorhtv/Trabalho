/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

/**
 *
 * @author Victor Henrique
 */
public class PrimeiraAplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro meuCarro = new Carro();
        meuCarro.setChassi("A123B");
        meuCarro.setCor("AZUL");
        meuCarro.setModelo("UNO");

        System.out.println("CHASSI: " + meuCarro.getChassi());
        System.out.println("COR: " + meuCarro.getCor());
        System.out.println("MODELO: " + meuCarro.getModelo());

    }

}
