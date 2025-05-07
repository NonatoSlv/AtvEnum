/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.myproject.model;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número de 1 a 7
        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        // Valida a entrada
        if (numero < 1 || numero > 7) {
            System.out.println("Número inválido! Por favor, insira um número entre 1 e 7.");
        } else {
            // Associa o número ao dia da semana
            DiasSemana dia = DiasSemana.values()[numero - 1];
            System.out.println("O dia correspondente é: " + dia);
        }

        scanner.close();
    }
}

