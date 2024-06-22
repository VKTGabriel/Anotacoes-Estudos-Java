package Exercicios.Classes.Produto;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    public Produto(String nomeInf, double precoInf) {
        nome = nomeInf;
        preco = precoInf;
    }

    public Produto() {

    }

    double aplicarDesconto() {
        return preco - preco * desconto;
    }
}
