package Desafios.Desafio_Jantar;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    double comer(Comida comida) {
        peso += comida.peso;
        return peso;
    }
}
