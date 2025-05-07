/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */
    public enum ClassificacaoProduto {
    BASICO("Produto simples"),
    PADRAO("Produto padrão"),
    PREMIUM("Produto de alto nível");
    private final String descricao;

    ClassificacaoProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

