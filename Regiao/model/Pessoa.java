package br.edu.etec.aulaenum.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Pessoa {
   // Variável para armazenar a região de origem
   private RegiaoBrasil regiao;
   
   // Construtor da classe Pessoa
   public Pessoa(RegiaoBrasil regiao) {
       this.regiao = regiao;
   }
   // Método para exibir a região de origem
   public void exibirRegiao() {
       System.out.println("A pessoa eh da regiao: " + regiao);
   }
   // Método para mudar a região da pessoa
   public void mudarRegiao(RegiaoBrasil novaRegiao) {
       regiao = novaRegiao;
       System.out.println("A pessoa agora eh da regiao: " + regiao);
   }

}
