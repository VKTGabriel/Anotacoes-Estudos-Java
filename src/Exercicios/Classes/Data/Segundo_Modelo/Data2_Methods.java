package Exercicios.Classes.Data.Segundo_Modelo;

public class Data2_Methods {
    int dia,mes,ano;

    String obterDataFormatada() {
        String diaF = dia < 10 ? "0" + dia : dia + "";
        String mesF = mes < 10 ? "0" + mes : mes + "";
        return String.format("%s/%s/%d", diaF, mesF, ano);
    }
}
