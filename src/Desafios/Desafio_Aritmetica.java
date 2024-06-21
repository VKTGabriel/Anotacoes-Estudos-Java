package Desafios;

import java.lang.Math;

public class Desafio_Aritmetica {
    public static void main(String[] args) {
        double numA = Math.pow(6*(3+2),2), numB = (1-5)*(2-7);
        double a = numA/(3*2), b = Math.pow(numB/2,2);
        double resultado = Math.pow(a-b,3)/Math.pow(10,3);

        System.out.printf("\nA = %.0f\nB = %.0f\nResultado = %.0f\n", a, b, resultado);

    }
}
