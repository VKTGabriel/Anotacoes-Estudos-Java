package Anotacoes;

public class Tipos_Primitivos {
    public static void main(String[] args) {


    //8 Tipos Primitivos://

/*
    Numericos {
        Inteiros {
            Definição: Número que pode ser escrito sem um componente fracional;
            Tipos: byte, short, int, long;

            Range {
                byte(x >= -128 && x <= 127); [1 Byte]
                short(x >= -32,768 && x <= 32,767); [2 Byte]
                int(x >= -2,147,483,648 && x <= 2,147,483,647); [4 Byte]
                long(x >= -9,223,372,036,854,775,808 && x <= 9,223,372,036,854,775,807); [8 Byte]
            }

                long_Obs {
                Para inicializar uma variavel valor long, deve-se adicionar a caracter "L" no final da declaração;
                exemplo( long a = 5_453_523_244_223L );
            }
        }

        Reais {
            Definição: Número que possui componente fracional;
            Tipos: float, double;
            Range {
                float(Até 7 casas decimais); [4 Byte]
                double(Até 15 casas decimais); [8 Byte]
            }

            float_Obs {
                Para inicializar uma variavel valor float, deve-se adicionar a caracter "F" no final da declaração;
                exemplo( float a = 12.67F );
            }
        }
    }
*/

    //Exemplo caso de uso Inteiros//

        byte anos_Trabalhados = 65;
        short pontos_Acumulados = 12_450;
        int pontos_Totais = 1_456_543_983;
        long contribuicao_Equipe = 231_431_456_543_983L;

        System.out.printf("\nAnos trabalhados: %d\nPontos Acumulados: %d\nPontos Totais: %d\nPontos da Equipe: %d\n\n",
                anos_Trabalhados, pontos_Acumulados, pontos_Totais, contribuicao_Equipe);

    //Exemplo caso de uso Reais//

        float salario_funcionario = 12367.45F;
        double estimativa_entrada = 2313243145.56;

        System.out.printf("Salário do Funcionário: R$%.2f\nEstimativa de Entrada de Capital na Empresa: R$%.2f\n\n",
                salario_funcionario, estimativa_entrada);

/*
    Não_Numericos {
        Caracter {
            Definição: Um único caracter alfanumérico;
            Tipo: char;
            Exemplos: ['A', '1', 'ç', ':', '?'];
        }

        char_Obs {
            Para inicializar uma variavel valor char, deve-se adicionar aspas simples ao redor do valor declarado (exemplo: 'A');
        }

        Booleano {
            Definição: Um valor lógico [Verdadeiro ou Falso];
            Tipo: boolean;
            Exemplos: [true, false];
        }
    }
*/

    //Exemplo caso de uso Boolean//

        char genero = 'F';
        boolean aptidao = true;

        System.out.printf("Genero do(a) Funcionario(a): %c\nApto a se aposentar: %b\n",
                genero, aptidao);


    }
}
