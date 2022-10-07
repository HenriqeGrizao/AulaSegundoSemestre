package Explicacoes.ExplicacaoMatriz;

import java.util.Arrays;

public class MatrizTransposta {

    public static void main(String[] args) {
        int[][] m = new int[2][2];

        m[0][0] = 5;
        m[0][1] = 3;
        m[1][0] = 7;
        m[1][1] = 1;

        int[][] mT = new int[m.length][m[0].length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                mT[j][i] = m[i][j];
            }
        }
        System.out.println(Arrays.deepToString(mT));
    }
}
