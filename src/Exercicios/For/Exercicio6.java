package Exercicios.For;

import java.util.Scanner;

public class Exercicio6 {

    //Ler 10 números e imprimir quantos são pares e quantos são ímpares
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int qtPar = 0;
        int qtImpar = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d° numero: ", i + 1);

            if (tc.nextInt() % 2 == 0) {
                qtPar++;
            } else {
                qtImpar++;
            }
        }
        tc.close();;
        System.out.println("Você digitou " + qtPar + " número pares e " + qtImpar + " númeors impares");
    }

}
