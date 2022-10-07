package Exercicios.Loop;

import java.util.Scanner;

public class Exercicio11 {
    /*Faça um programa que receba dois números inteiros e gere os números inteiros que 
        estão no intervalo compreendido por eles.
        Altere o programa anterior para mostra no final a foma entre eles.
     */
    public static void main(String[] args) {
        int soma = 0;
        Scanner tc = new Scanner(System.in);
        System.out.print("DIgite o númereo inicial: ");
        int numbInic = tc.nextInt();
        System.out.print("Digite o número final: ");
        int numbFinal = tc.nextInt();
        tc.close();
        System.out.println("");

        if (numbInic < numbFinal) {
            for (int i = numbInic; i <= numbFinal; i++) {
                soma += i;
                System.out.print(i + ", ");
            }
        } else {
            for (int i = numbInic; i >= numbFinal; i--) {
                soma += i;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nA soma entre eles é: " + soma);
    }
}
