/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package    br.edu.etec.aulaenum.model;

/**
 *
 * @author Admin
 */
public enum Mes {
    JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4), MAIO(5), JUNHO(6),
    JULHO(7), AGOSTO(8), SETEMBRO(9), OUTUBRO(10), NOVEMBRO(11), DEZEMBRO(12);
    
    private final int numero;

    Mes(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public static Mes getMesPorNumero(int numero) {
        for (Mes mes : Mes.values()) {
            if (mes.getNumero() == numero) {
                return mes;
            }
        }
        throw new IllegalArgumentException("Número de mês inválido: " + numero);
    }
}


