/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.LinkedList;

/**
 *
 * @author pedrom
 */
public class Clinica {
    
    public LinkedList<Pessoa> listaPessoas;
    
    public Clinica() {
        this.listaPessoas = new LinkedList<>();
    }
    
    public void adicionarPessoaSistema(Pessoa p) {
        this.listaPessoas.add(p);
    }
    
    public int quantidadePacientes() {
        return this.listaPessoas.size();
    }
    
    public float calcularMedia() {
        int somaIdades = 0;
        for(Pessoa p: this.listaPessoas) {
            somaIdades = somaIdades + p.idade;
        }
        return somaIdades / this.listaPessoas.size();
    }
    
    public int calcularQuantidadeMulheresAlturaPeso() {
        int quantidade = 0;
        for(Pessoa p: this.listaPessoas) {
            if(p.altura >= 1.60 && p.altura <= 1.70 && p.peso > 70 && p.sexo == 'F') {
                quantidade++;
            }
        }
        return quantidade;
    }
    
    public int quantidadePessoaIdade1825() {
        int quantidade = 0;
        for(Pessoa p: this.listaPessoas) {
            if(p.idade >= 18 && p.idade <= 25) {
                quantidade++;
            }
        }
        return quantidade;
    }
    
    public String calcularPessoaMaisVelha() {
        if(!listaPessoas.isEmpty()){
          
            Pessoa pVelha = this.listaPessoas.getFirst();

            for(Pessoa p: this.listaPessoas) {
               if(p.idade > pVelha.idade) {
                   pVelha = p;
               }
            }
            return pVelha.nome;
        }
        return "Não há pessoas no sistema";
    }
    
    public String calcularPessoaMaisBaixa() {
        if(!listaPessoas.isEmpty()){
          
            Pessoa pBaixa = this.listaPessoas.getFirst();

            for(Pessoa p: this.listaPessoas) {
               if(p.altura < pBaixa.altura) {
                   pBaixa = p;
               }
            }
            return pBaixa.nome;
        }
        return "Não há pessoas no sistema";
    }
}
