package Exercicios.Loop;

import java.util.Scanner;

public class Exercicio5 {

    /* 4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma 
    taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com 
    uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número 
    de anos necessários para que a população do país A ultrapasse ou iguale a população 
    do país B, mantidas as taxas de crescimento
    
    5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas 
    de crescimento iniciais. Valide a entrada e permita repetir a operação.
     */
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int popuA;
        int popuB;
        float cresimentoA;
        float cresimentoB;

        while (true) {
            System.out.print("Digite a população A inicial: ");
            popuA = tc.nextInt();
            System.out.print("\nDigite o cresimento em porcentagen da população A: ");

            cresimentoA = (float) tc.nextInt() / 100 + 1;
            System.out.print("\nDigite a população B inicial: ");
            popuB = tc.nextInt();
            System.out.print("\nDigite o cresimento em porcentagen da população B: ");
            cresimentoB = (float) tc.nextInt() / 100 + 1;

            if (cresimentoA > cresimentoB) {
                int anos = 0;
                while (true) {
                    if (popuA > popuB) {
                        System.out.printf("A populaçõ A(%d pessoas) vai passa a B(%d pessoas) em %d anos\n", popuA, popuB, anos);
                        break;
                    }
                    anos++;
                    popuA *= cresimentoA;
                    popuB *= cresimentoB;
                }
            } else {
                System.out.println("A população de A nunca vai ser maior que B com esse cresimento");
            }

            System.out.println("Quer Reazer a conta?[s/n]");
            char resp = tc.next().toLowerCase().charAt(0);
            if (resp != 's') {
                break;
            }
        }
        tc.close();
    }
}
