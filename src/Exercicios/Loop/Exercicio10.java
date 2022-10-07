package Exercicios.Loop;

import java.util.Scanner;

public class Exercicio10 {
    /*Faça um programa que receba dois números inteiros e gere os números inteiros que 
    estão no intervalo compreendido por eles.*/
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o númereo inicial: ");
        int numbInic = tc.nextInt();
        System.out.print("Digite o número final: ");
        int numbFinal = tc.nextInt();
        tc.close();
        System.out.println("");
        
        if (numbInic < numbFinal) {
            for (int i = numbInic; i <= numbFinal; i++) {
                System.out.print(i + ", ");
            }
        } else{
            for (int i = numbInic; i >= numbFinal; i--) {
                System.out.print(i + ", ");
            }
        }    
    }
}
