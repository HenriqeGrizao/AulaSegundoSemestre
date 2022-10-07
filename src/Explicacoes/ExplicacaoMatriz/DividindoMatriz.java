package Explicacoes.ExplicacaoMatriz;

import java.util.Arrays;

public class DividindoMatriz {

    public static void main(String[] args) {
        int[][] m = new int[2][2];

        m[0][0] = 5;
        m[0][1] = 3;
        m[1][0] = 7;
        m[1][1] = 1;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; m[0].length < 2; j++) {
                System.out.println(m[i][j]);
            }
        }

        int[] v1 = m[0];
        int[] v2 = m[1];

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));

    }
}
