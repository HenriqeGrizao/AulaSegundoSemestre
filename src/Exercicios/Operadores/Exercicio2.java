package Exercicios.Operadores;

import java.util.Scanner;
//Fça um programa que leia um número real e imprima

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero real");
        String entrada = input.next();
        entrada = entrada.replace("," , ".");
        input.close();
        float numero = Float.parseFloat(entrada);
        System.out.printf("Seu numero real é: %f", numero);
        System.out.print("\n");
    }
}
