package Desafios;

public class Desafio_For_Sem_Numeros {
    public static void main(String[] args) {
        String valor;
        for (valor = "#"; !valor.equals("######") ; valor += "#") {
            System.out.println(valor);
        }
    }
}
