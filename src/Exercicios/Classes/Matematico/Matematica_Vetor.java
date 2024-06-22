package Exercicios.Classes.Matematico;

public class Matematica_Vetor {

    int maiorEmVetor (int[] a) {
        int maior = a[0];
        for (int i = 1; i < a.length; i++) {
            if (maior < a[i]) {
                maior = a[i];
            }
        }
        return maior;
    }

    int menorEmVetor (int[] a) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++) {
            if (menor > a[i]) {
                menor = a[i];
            }
        }
        return menor;
    }

    int somaEmVetor (int[] a) {
        int soma = 0;
        for (int i = 0; i < a.length; i++) {
                soma += a[i];
        }
        return soma;
    }

    int mediaEmVetor (int[] a) {
        int soma = 0;
        for (int i = 0; i < a.length; i++) {
            soma += a[i];
        }
        return soma/a.length;
    }

}

