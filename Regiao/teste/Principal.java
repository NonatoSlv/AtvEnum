/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.aulaenum.teste;

import br.edu.etec.aulaenum.model.Pessoa;
import br.edu.etec.aulaenum.model.RegiaoBrasil;

/**
 *
 * @author Admin
 */
public class Principal {
     public static void main(String[] args) {
       // Criando um objeto Pessoa com região inicial Norte
       Pessoa pessoa = new Pessoa(RegiaoBrasil.NORTE);
       // Exibindo a região inicial
       pessoa.exibirRegiao();
       // Mudando a região para Sudeste
       pessoa.mudarRegiao(RegiaoBrasil.SUDESTE);
       // Mudando a região novamente para Nordeste
       pessoa.mudarRegiao(RegiaoBrasil.NORDESTE);
   }
    
}
