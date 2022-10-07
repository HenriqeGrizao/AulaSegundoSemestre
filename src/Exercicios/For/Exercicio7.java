package Exercicios.For;

import java.util.Scanner;

public class Exercicio7 {
    /*Faça um programa, utilizando for, que permita o usuário fazer três contas de 
    subtração. O usuário deve conseguir reconhecer que são três contas diferentes.*/

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        float minuendo;
        float subtraendo; 
        System.out.println("Esse programa faz 3 contas de subtração");
        for (int i = 1; i <= 3; i++) {
           System.out.print(i+"°) digite o minuendo: ");
           minuendo = tc.nextFloat();
           System.out.print( i+"°) digite o subtraendo: ");
           subtraendo = tc.nextFloat();
           
           System.out.printf("%d°) %.2f - %.2f = %.2f\n\n",i,minuendo, subtraendo, minuendo-subtraendo);
        }
    }
}
