package Exercicios.Operadores;

import java.util.Scanner;
//Fça um programa que leia um número intero e imprima

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//criando 0 Scaner
        System.out.println("Digite um numero intero");
        int NumbInt = input.nextInt();//Pegando o número digitado e atribuindo para NumbInt 
        input.close();
        System.out.printf("Seu numero intero é: %d", NumbInt);
        System.out.print("\n");
    }
}
