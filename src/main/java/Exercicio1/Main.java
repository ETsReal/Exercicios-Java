/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author pedrom
 */
public class Main {
    
    public static void main(String [] args) {
        MaiorIdade demo = new MaiorIdade();
        demo.adicionarPessoa("Rafael", (short) 20);
        demo.adicionarPessoa("Diogo", (short) 10);
        demo.adicionarPessoa("Pedro", (short) 30);
        demo.pessoasMaiorIdade();
    }
}
