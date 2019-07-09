package atividadesvetoresematrizes;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadesVetoresEMatrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        questao2();
    }

    /**
     * Escreva uma rotina que receba como parâmetro duas matrizes bidimensionais de tamanho qualquer A e B, efetue a soma das duas matrizes e retome uma matriz
     * C como resultado.
     */
    public static void questao1() {

        int tamanhoMatriz = 3;
        //Matriz A
        int A[][] = new int[tamanhoMatriz][tamanhoMatriz];

        A[0][0] = 15; //Linha 1, col 1
        A[0][1] = 3;//Linha 1, col 2
        A[1][0] = 6; //Linha 2, col 1
        A[1][1] = 4;//Linha 2, col 2

        //Matriz B
        int B[][] = new int[tamanhoMatriz][tamanhoMatriz];

        B[0][0] = 5; //Linha 1, col 1
        B[0][1] = 5;//Linha 1, col 2
        B[1][0] = 3;//Linha 2, col 2
        B[1][1] = 6;//Linha 2, col 2
//Atenção aqui para a função/rotina: matriz. Ela pega 3 argumentos. A, B e tamanhoMatriz, respectivamente: um array A, um array B e o tamanho da matriz. Esse tamanho, por exemplo, se for 3, então as duas matrizes terão 3 linhas e 3 colunas.
        System.out.println(Arrays.deepToString(matriz(A, B, tamanhoMatriz)).replaceAll("],", "]," + System.getProperty("line.separator")));
    }

    /**
     *
     * @param A
     * @param B
     * @param tamanhoDaMatriz
     * @return
     */
    public static int[][] matriz(int[][] A, int B[][], int tamanhoDaMatriz) {

        int C[][] = new int[tamanhoDaMatriz][tamanhoDaMatriz];

        for (int i = 0; i < A.length; i++) {
            for (int n = 0; n < A.length; n++) {
                C[i][n] = A[i][n] + B[i][n];
            }
        }
        return C;
    }

    /**
     * <p style="font-weight:900;">Escrever uma rotina que receba como parâmetro uma matriz A e imprima a matriz recebida na tela no seguinte formato: </p>
     */
    public static void questao2() {

        boolean b = false;

        int row = 0, col = 0;
//O laço de repetição é simples: para cada vez que você pressionar um número, o programa cria outra matriz. Então, caso queira que encerre o programa, pressiona s.
        while (b == false) {

            System.out.print("Digite o número de linhas da matriz: ");

            Scanner scan1 = new Scanner(System.in);
            String linhas = scan1.next();

            System.out.print("Digite o número de colunas da matriz: ");
            String colunas = scan1.next();

            //Se a entrada fo igual a s, então sai do sistema.
            if (linhas.equals('s')) {
                System.exit(1);
            } else {
                row = Integer.parseInt(linhas);
                col = Integer.parseInt(colunas);

                int D[][] = new int[row][col];

                for (int x = 0; x < row; x++) {
                    for (int k = 0; k < col; k++) {
                        //Gera um número aleatório entre 0 e 100. A função ceil é para arrendodar um número.
                        double n1 = Math.ceil(Math.random() * (100 - 0) + 0);
                        D[x][k] = (int) n1; //(int) converte o número double em inteiro.
                    }
                }
                System.out.println(Arrays.deepToString(D).replaceAll("],", "]," + System.getProperty("line.separator")));
            }

        }
    }

    /**
     * Verifica se um número é um inteiro
     *
     * @param input
     * @return
     */
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
