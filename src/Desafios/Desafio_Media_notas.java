package Desafios;

import javax.swing.*;

public class Desafio_Media_notas {
    public static void main(String[] args) {
        double nota = 0, media = 0;
        int alunos = 0;
        while (nota != -1) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("(-1 para sair) Digite a nota do aluno " + (alunos + 1) + ":"));
            if (nota != -1) {
                if (nota > 0 && nota <= 10) {
                    media += nota;
                    alunos++;
                } else {
                    JOptionPane.showMessageDialog(null, "Nota Inválida");
                }
            }
        }
        if (alunos > 0) {
            JOptionPane.showMessageDialog(null, "Média dos alunos: " + (media / alunos));
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma nota informada");
        }
    }
}
