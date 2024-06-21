package Exercicios.Classes.Data.Segundo_Modelo;

import javax.swing.*;

public class Data2_Teste_Methods {
    public static void main(String[] args) {
        Data2_Methods e = new Data2_Methods();
        e.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento:"));
        e.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do seu nascimento:"));
        e.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));

        JOptionPane.showMessageDialog(null, "Data de Nascimento: " + e.obterDataFormatada());
    }
}
