package Explicacoes.ExplicacaoVetores;

import java.util.Scanner;
import java.util.Arrays;

public class OperacaoVetores {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o numero que ira multiplicar o vetor");
        int mul = tc.nextInt();
        
        int[] v = {1, 2, 3};

        int[] u = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            u[i] = mul * v[i];
        }
        System.out.println("Os valores iniciais eram: " + Arrays.toString(v));
        System.out.println("0s novos valores são: " + Arrays.toString(u));
        tc.close();
    }
}
