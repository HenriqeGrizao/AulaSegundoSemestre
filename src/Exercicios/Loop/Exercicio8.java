package Exercicios.Loop;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe a soma e a média dos números*/
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        float soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            float numero = tc.nextFloat();
            soma += numero;
        }
        System.out.printf("\nA soma é: %f e a media é %f\n", soma, soma/5);
    }
}
