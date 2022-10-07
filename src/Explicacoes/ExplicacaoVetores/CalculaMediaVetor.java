package Explicacoes.ExplicacaoVetores;

import java.util.Scanner;

public class CalculaMediaVetor {
     public static void main(String[] args) {
        float media = 0;
        
        Scanner tc = new Scanner(System.in);
        System.out.println("Incira a quantidade de notas:");
        int n = tc.nextInt();
        
        int[] notas = new int[n]; 
        for (int i = 0; i < notas.length; i++) {   
        System.out.printf("Digite a %d° nota: ", i+1);
        notas[i] = tc.nextInt();
        media += notas[i];
        }
        media /= n;
        System.out.printf("A media é %.2f\n", media);
        
        tc.close();
    }
}
