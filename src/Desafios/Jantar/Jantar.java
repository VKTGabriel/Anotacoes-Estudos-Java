package Desafios.Jantar;

import javax.swing.*;

public class Jantar {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
        Pessoa p1 = new Pessoa(nome, peso);

        Comida[] comidas = {new Comida("Arroz", 0.320), new Comida("Batata", 0.150),
                new Comida("Carne", 0.550)};

        String pergunta = "O que gostaria de comer hoje?\n";

        for (int i = 0; i < comidas.length; i++) {
            pergunta += String.format("%d. %s (Peso: %.1fKg)\n",i+1,comidas[i].nome,comidas[i].peso);
        }

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(pergunta));

        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nNovo Peso: %.2f",
                p1.nome, p1.comer(comidas[escolha-1])));

    }
}
