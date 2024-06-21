package Desafios;

import javax.swing.JOptionPane;

public class Desafio_IfElse_Dias_da_Semana {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite um Dia da Semana:");

        if (valor.equalsIgnoreCase("domingo")) {
            JOptionPane.showMessageDialog(null, "Correspondente: 1");
        } else if (valor.equalsIgnoreCase("segunda")) {
            JOptionPane.showMessageDialog(null, "Correspondente: 2");
        } else if (valor.equalsIgnoreCase("terça") || valor.equalsIgnoreCase("terca")) {
            JOptionPane.showMessageDialog(null, "Correspondente: 3");
        } else if (valor.equalsIgnoreCase("quarta")) {
            JOptionPane.showMessageDialog(null, "Correspondente: 4");
        } else if (valor.equalsIgnoreCase("quinta")) {
            JOptionPane.showMessageDialog(null, "Correspondente: 5");
        } else if (valor.equalsIgnoreCase("sexta")) {
            JOptionPane.showMessageDialog(null, "Correspondente: 6");
        } else if (valor.equalsIgnoreCase("sabado") || valor.equalsIgnoreCase("sábado")) {
            JOptionPane.showMessageDialog(null, "Correspondente: 7");
        } else {
            JOptionPane.showMessageDialog(null, "Dia Inválido");
        }

    }
}
