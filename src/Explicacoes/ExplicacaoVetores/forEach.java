package Explicacoes.ExplicacaoVetores;


import java.util.Random;

public class forEach {
    public static void main(String[] args) {
        int[] valores = new int[5]; 
        Random rd = new Random();

        //definido os valores de forma aleatoria
        for (int v : valores ) {
            v = rd.nextInt(11);
            System.out.println(v);
        }
    }
}
