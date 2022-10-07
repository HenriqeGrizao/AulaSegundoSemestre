package Explicacoes.ExplicacaoVetores;

import java.util.Random;

public class ArreyAleatorio {

    public static int[] v = new int[20];
    public static Random rd = new Random();

    public static void main(String[] args) {
        entrada();
        exibirPares();
    }

    public static void entrada() {
        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(101);
        }
    }

    public static void exibirPares() {
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                System.out.println("v[" + i + "]= " + v[i]);
            }
        }
    }
}
