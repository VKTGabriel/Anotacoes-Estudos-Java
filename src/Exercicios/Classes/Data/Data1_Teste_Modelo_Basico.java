package Exercicios.Classes.Data;

import javax.swing.*;

public class Data1_Teste_Modelo_Basico {
    public static void main(String[] args) {
        Data1_Modelo_Basico d = new Data1_Modelo_Basico();
        d.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento:"));
        d.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do seu nascimento:"));
        d.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));

        String dia = d.dia < 10 ? "0"+ d.dia : d.dia + "";
        String mes = d.mes < 10 ? "0"+ d.mes : d.mes + "";
        String data_Nascimento = String.format("Data de Nascimento: %s/%s/%d", dia, mes, d.ano);

        JOptionPane.showMessageDialog(null, data_Nascimento);
    }
}
