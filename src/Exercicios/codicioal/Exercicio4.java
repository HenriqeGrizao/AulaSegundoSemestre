package Exercicios.codicioal;

import java.util.Scanner;

public class Exercicio4 {

    /*
    Faça um programa que leia um número inteiro e retorna ao usuário uma 
    mensagem informando se o número é par ou ímpar e se é positivo ou negativo.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero intero");
        int numb = scanner.nextInt();
        scanner.close();

        System.out.printf("O numero %d é ", numb);
        if (numb % 2 == 0) {
            System.out.print("par e ");
        } else {
            System.out.print("impar e ");
        }

        if (numb > 0) {
            System.out.print("positivo \n");
        } else {
            System.out.print("negativo \n");
        }
    }

}
