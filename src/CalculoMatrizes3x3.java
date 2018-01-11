
public class CalculoMatrizes3x3 {

    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ 1*/
    static double[][] matriz1;
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ 2*/
    static double[][] matriz2;
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ COM OS RESULTADOS DA SOMA*/
    static double[][] matrizResultadoSoma = new double[3][3];
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ COM OS RESULTADOS DA DIVISAO*/
    static double[][] matrizResultadoDivisao = new double[3][3];
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ COM OS RESULTADOS DA SUBTRACAO*/
    static double[][] matrizResultadoSubtracao = new double[3][3];
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ COM OS RESULTADOS DA MULTIPLICAÇÃO*/
    static double[][] matrizResultadoMultiplicacao = new double[3][3];

    /*METODO RESPONSAVEL POR CRIAR A MATRIZ1 COM OS VALORES PASSADOS NA TELA*/
    public static void CriarMatriz1(int valor1, int valor2, int valor3, int valor4, int valor5, int valor6, int valor7, int valor8, int valor9) {
        matriz1 = new double[3][3];
        matriz1[0][0] = valor1;
        matriz1[0][1] = valor2;
        matriz1[0][2] = valor3;

        matriz1[1][0] = valor4;
        matriz1[1][1] = valor5;
        matriz1[1][2] = valor6;

        matriz1[2][0] = valor7;
        matriz1[2][1] = valor8;
        matriz1[2][2] = valor9;
    }

    /*METODO RESPONSAVEL POR CRIAR A MATRIZ2 COM OS VALORES PASSADOS NA TELA*/
    public static void CriarMatriz2(int valor1, int valor2, int valor3, int valor4, int valor5, int valor6, int valor7, int valor8, int valor9) {
        matriz2 = new double[3][3];

        matriz2[0][0] = valor1;
        matriz2[0][1] = valor2;
        matriz2[0][2] = valor3;

        matriz2[1][0] = valor4;
        matriz2[1][1] = valor5;
        matriz2[1][2] = valor6;

        matriz2[2][0] = valor7;
        matriz2[2][1] = valor8;
        matriz2[2][2] = valor9;
    }

    /*METODO RESPONSAVEL POR FAZER A SOMA ENTRE OS VALORES DA MATRIZ1 COM A MATRIZ2*/
    public static double[][] Soma() {
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                matrizResultadoSoma[i][x] = matriz1[i][x] + matriz2[i][x];
                System.out.print(" " + matrizResultadoSoma[i][x] + " ");
            }
        }
        return matrizResultadoSoma;
    }

    /*METODO RESPONSAVEL POR FAZER A SUBTRACAO ENTRE OS VALORES DA MATRIZ1 COM A MATRIZ2*/
    public static double[][] Subtracao() {
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                matrizResultadoSubtracao[i][x] = matriz1[i][x] - matriz2[i][x];
            }
        }
        return matrizResultadoSubtracao;
    }

    /*METODO RESPONSAVEL POR FAZER A DIVISAO ENTRE OS VALORES DA MATRIZ1 COM A MATRIZ2*/
    public static double[][] Divisao() {
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                matrizResultadoDivisao[i][x] = matriz1[i][x] / matriz2[i][x];
            }
        }
        return matrizResultadoDivisao;
    }

    /*METODO RESPONSAVEL POR FAZER A MULTIPLICACAO ENTRE OS VALORES DA MATRIZ1 COM A MATRIZ2*/
    public static double[][] Multiplicacao() {
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                matrizResultadoMultiplicacao[i][x] = matriz1[i][x] * matriz2[i][x];
            }
        }
        return matrizResultadoMultiplicacao;
    }
}
