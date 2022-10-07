
package Explicacoes.ExplicacaoVetores;

import java.util.Random;

public class ExplicacaoVetor {

    public static void main(String[] args) {
        //criação do vetor/arrey
        int[] v = new int[10]; 
        Random rd = new Random();
        //definido os valores do arrey/vetor manualmente
        v[0] = 9;
        v[1] = 19;
        v[2] = 58;
        //definido os valores de forma aleatoria
        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(11);
        }
        //exibindo um valor especifico individualmwnte
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println("--------------------");
        //exibindo todos os valores com um laço for
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        } 
    }
}
