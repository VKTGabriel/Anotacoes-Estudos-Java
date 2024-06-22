package Exercicios.Classes.Data.Terceiro_Modelo;

import javax.swing.*;

public class Data3_Construtor_Teste {
    public static void main(String[] args) {
        Data3_Construtor e = new Data3_Construtor();
        JOptionPane.showMessageDialog(null, "Data padrão: " + e.obterDataFormatada());

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do seu nascimento:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));
        Data3_Construtor f = new Data3_Construtor(dia, mes, ano);

        JOptionPane.showMessageDialog(null, "Data de Nascimento: " + f.obterDataFormatada());
    }
}
