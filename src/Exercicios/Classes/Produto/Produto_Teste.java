package Exercicios.Classes.Produto;

public class Produto_Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Sapato";
        p1.preco = 200.00;

        Produto.desconto = 0.40;

        System.out.println(p1.aplicarDesconto());
    }
}
