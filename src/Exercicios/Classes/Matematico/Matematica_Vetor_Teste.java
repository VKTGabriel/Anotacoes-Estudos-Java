package Exercicios.Classes.Matematico;

import javax.swing.*;

public class Matematica_Vetor_Teste {
    public static void main(String[] args) {
        Matematica_Vetor m = new Matematica_Vetor();

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Quantos número deseja analizar?"));
        int[] n = new int[valor];

        for (int i = 0; i < valor; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("[Faltam " + (valor - i) + "] Digite um valor?"));
        }

        int menor = m.menorEmVetor(n), maior = m.maiorEmVetor(n), soma = m.somaEmVetor(n);
        double media = m.mediaEmVetor(n);
        String print_Array = String.format("Array: %d", n[0]), saida = "";

        for (int i = 1; i < n.length; i++) {
            print_Array += ", " + n[i];
        }

        saida = String.format("%s\nMenor Valor = %d\nMaior Valor = %d\nSoma dos valores = %d\nMedia = %.2f\n",
                print_Array, menor, maior, soma, media);
        JOptionPane.showMessageDialog(null, saida);

    }
}