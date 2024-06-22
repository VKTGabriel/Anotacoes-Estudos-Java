package Exercicios.Classes.Data.Terceiro_Modelo;

public class Data3_Construtor {
    int dia,mes,ano;

    Data3_Construtor(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data3_Construtor(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    String obterDataFormatada() {
        String diaF = dia < 10 ? "0" + dia : dia + "";
        String mesF = mes < 10 ? "0" + mes : mes + "";
        return String.format("%s/%s/%d", diaF, mesF, ano);
    }
}
