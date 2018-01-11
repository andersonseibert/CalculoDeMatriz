
public class CalculoMatrizes2x2 {

    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ 1*/
    static int[][] matriz1;
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ 2*/
    static int[][] matriz2;
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ COM OS RESULTADOS DA SOMA*/
    static int[][] matrizResultadoSoma = new int[2][2];
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ COM OS RESULTADOS DA DIVISAO*/
    static int[][] matrizResultadoDivisao = new int[2][2];
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ COM OS RESULTADOS DA SUBTRACAO*/
    static int[][] matrizResultadoSubtracao = new int[2][2];
    /*VARIAVEL QUE ARMAZENA OS VALORES DA MATRIZ COM OS RESULTADOS DA MULTIPLICAÇÃO*/
    static int[][] matrizResultadoMultiplicacao = new int[2][2];

    /*METODO RESPONSAVEL POR CRIAR A MATRIZ1 COM OS VALORES PASSADOS NA TELA*/
    public static void CriarMatriz1(int valor1, int valor2, int valor3, int valor4) {
        matriz1 = new int[2][2];
        matriz1[0][0] = valor1;
        matriz1[0][1] = valor2;
        matriz1[1][0] = valor3;
        matriz1[1][1] = valor4;
    }

    /*METODO RESPONSAVEL POR CRIAR A MATRIZ2 COM OS VALORES PASSADOS NA TELA*/
    public static void CriarMatriz2(int valor1, int valor2, int valor3, int valor4) {
        matriz2 = new int[2][2];
        matriz2[0][0] = valor1;
        matriz2[0][1] = valor2;
        matriz2[1][0] = valor3;
        matriz2[1][1] = valor4;
    }

    /*METODO RESPONSAVEL POR FAZER A SOMA ENTRE OS VALORES DA MATRIZ1 COM A MATRIZ2*/
    public static int[][] Soma() {
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                matrizResultadoSoma[i][x] = matriz1[i][x] + matriz2[i][x];
                System.out.print(" " + matrizResultadoSoma[i][x] + " ");
            }
        }
        return matrizResultadoSoma;
    }

    /*METODO RESPONSAVEL POR FAZER A SUBTRACAO ENTRE OS VALORES DA MATRIZ1 COM A MATRIZ2*/
    public static int[][] Subtracao() {
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                matrizResultadoSubtracao[i][x] = matriz1[i][x] - matriz2[i][x];
            }
        }
        return matrizResultadoSubtracao;
    }

    /*METODO RESPONSAVEL POR FAZER A DIVISAO ENTRE OS VALORES DA MATRIZ1 COM A MATRIZ2*/
    public static int[][] Divisao() {
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                matrizResultadoDivisao[i][x] = matriz1[i][x] / matriz2[i][x];
            }
        }
        return matrizResultadoDivisao;
    }

    /*METODO RESPONSAVEL POR FAZER A MULTIPLICACAO ENTRE OS VALORES DA MATRIZ1 COM A MATRIZ2*/
    public static int[][] Multiplicacao() {
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 2; x++) {
                matrizResultadoMultiplicacao[i][x] = matriz1[i][x] * matriz2[i][x];
            }
        }
        return matrizResultadoMultiplicacao;
    }
}
