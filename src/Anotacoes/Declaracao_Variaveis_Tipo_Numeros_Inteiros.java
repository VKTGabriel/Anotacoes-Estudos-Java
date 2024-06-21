package Anotacoes;

public class Declaracao_Variaveis_Tipo_Numeros_Inteiros {
    public static void main(String[] args) {

        byte anos_trabalhados = 65; //Declaração de variável tipo byte.
        short pontos_acumulados = 12_450; //Declaração de variável tipo short.
        int pontos_totais = 1_456_543_983; //Declaração de variável tipo int.
        long contribuicao_equipe = 231_431_456_543_983L; //Declaração de variável tipo long.

        System.out.printf("\nAnos trabalhados = %d\nPontos acumulados = %d\nPontos totais = %d\nContribuição da Equipe = %d\n",
                anos_trabalhados, pontos_acumulados, pontos_totais, contribuicao_equipe);

    }
}
