package ExplicacaoMatriz;

import java.util.Random;

import java.util.Arrays;

public class MatrzAleatoria {

    static float m[][] = new float[2][2];
    static Random rd = new Random();

    public static void main(String[] args) {
        entrada();
        saida();

    }

    public static void entrada() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextFloat() * 11;
            }
        }
    }

    public static void saida() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "    ");
            }
            System.out.println("");
        }
    }
}
