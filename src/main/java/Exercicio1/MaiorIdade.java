/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.LinkedList;

/**
 *
 * @author pedrom
 */
public class MaiorIdade {
    
    LinkedList<Pessoa> listaPessoas;
    
    public MaiorIdade() {
        this.listaPessoas = new LinkedList<>();
    }
    
    
    
    void adicionarPessoa(String nome, short idade) {
        Pessoa pessoa = new Pessoa(nome, idade);
        this.listaPessoas.add(pessoa); 
    }
    
    void pessoasMaiorIdade() {
        for(Pessoa p : this.listaPessoas) {
            if(p.idade >= 18) {
                System.out.println("--MAIORES DE IDADE--");
                System.out.println("Pessoa: " + p.nome);
                System.out.println("Idade: " + p.idade);
            }
        }
    }
    
    void printPessoas() {
        try {
            for(Pessoa p: this.listaPessoas){
                System.out.println("Pessoa: " + p.nome);
                System.out.println("Idade: " + p.idade);
            }
        } catch (Exception e) {
            System.out.println("Não há individuos");
        }
    }
}
