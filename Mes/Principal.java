package br.edu.etec.aulaenum.model;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número entre 1 e 12 para saber o mês correspondente: ");
        int numeroMes = scanner.nextInt();
        
        try {
            Mes mes = Mes.getMesPorNumero(numeroMes);
            System.out.println("O mês correspondente ao número " + numeroMes + " é: " + mes.name());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
