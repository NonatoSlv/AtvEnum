/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */


public class Produto {
    private String nome;
    private ClassificacaoProduto classificacao;

    public Produto(String nome, ClassificacaoProduto classificacao) {
        this.nome = nome;
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public ClassificacaoProduto getClassificacao() {
        return classificacao;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Classificação: " + classificacao.name());
        System.out.println("Descrição: " + classificacao.getDescricao());
    }
}
