/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author pedrom
 */
public class Main {
    
    
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Pessoa p = new Pessoa("Andrea", 'F', (int) 75, (short) 22, (float) 1.66);
        Pessoa p2 = new Pessoa("Patricia", 'F', (int) 80, (short) 18, (float) 1.50);
        Pessoa p3 = new Pessoa("João", 'M', (int) 80, (short) 80, (float) 1.90);
        Pessoa p4 = new Pessoa("Paulo", 'M', (int) 70, (short) 33, (float) 1.60);
        Pessoa p5 = new Pessoa("Maria", 'F', (int) 50, (short) 13, (float) 1.60);
        clinica.adicionarPessoaSistema(p);
        clinica.adicionarPessoaSistema(p2);
        clinica.adicionarPessoaSistema(p3);
        clinica.adicionarPessoaSistema(p4);
        clinica.adicionarPessoaSistema(p5);
        System.out.println("A quantidade de pacientes é: " + clinica.quantidadePacientes());
        System.out.println("A Media é: " + clinica.calcularMedia());
        System.out.println("A quantidade de mulheres com altura  entre 1,60 e 1,70  e peso superior a 70kg é: " + clinica.calcularQuantidadeMulheresAlturaPeso());
        System.out.println("A qantidade de pessoas entre 18 e 25 anos é: " + clinica.quantidadePessoaIdade1825());
        System.out.println("O nome do paciente mais velho é: " + clinica.calcularPessoaMaisVelha());
        System.out.println("A pessoa mais baixa é: " + clinica.calcularPessoaMaisBaixa());
    }
}
