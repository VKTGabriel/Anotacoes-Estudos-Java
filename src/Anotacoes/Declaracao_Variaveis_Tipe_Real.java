package Anotacoes;

public class Declaracao_Variaveis_Tipe_Real {
    public static void main(String[] args) {

        float desconto_beneficios = 65.76F; //Declaração de variável tipo float.
        double salario_funcionario = 8_450.34; //Declaração de variável tipo double.

        System.out.printf("\nSalario do funcionário: R$%.2f\nValor descontado = R$%.2f\n",
                salario_funcionario, desconto_beneficios);
    }
}
