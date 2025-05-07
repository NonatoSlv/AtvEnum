/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.teste;

/**
 *
 * @author Admin
 */

import br.edu.etec.myproject.model.ClassificacaoProduto;
import br.edu.etec.myproject.model.Produto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nomeProduto = obterNomeProduto();
        ClassificacaoProduto classificacao = obterClassificacaoProduto();
        Produto produto = new Produto(nomeProduto, classificacao);
        produto.exibirInformacoes();
    }

    private static String obterNomeProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        return scanner.nextLine();
    }

    private static ClassificacaoProduto obterClassificacaoProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a classificação:");
        System.out.println("1 - BASICO");
        System.out.println("2 - PADRAO");
        System.out.println("3 - PREMIUM");
        System.out.print("Digite o número da classificação: ");
        int numeroClassificacao = scanner.nextInt();
        return getClassificacaoPorNumero(numeroClassificacao);
    }

    private static ClassificacaoProduto getClassificacaoPorNumero(int numero) {
        switch (numero) {
            case 1:
                return ClassificacaoProduto.BASICO;
            case 2:
                return ClassificacaoProduto.PADRAO;
            case 3:
                return ClassificacaoProduto.PREMIUM;
            default:
                System.out.println("Classificação inválida. Valor padrão será utilizado.");
                return ClassificacaoProduto.BASICO;
        }
    }
}

 