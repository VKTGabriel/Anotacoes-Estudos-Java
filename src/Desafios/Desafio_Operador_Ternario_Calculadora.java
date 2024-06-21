package Desafios;

import javax.swing.JOptionPane;

public class Desafio_Operador_Ternario_Calculadora {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primero número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        String operacao = JOptionPane.showInputDialog("Digite o simbolo da operação desejada:");

        double resultado = operacao.equals("+")
                ? num1 + num2 : operacao.equals("-")
                ? num1 - num2 : operacao.equals("*")
                ? num1 * num2 : operacao.equals("/")
                ? num1 / num2 : operacao.equals("%")
                ? num1 % num2 : 0;

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
