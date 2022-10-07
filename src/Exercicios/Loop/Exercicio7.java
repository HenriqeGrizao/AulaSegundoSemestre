/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Loop;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número*/
public class Exercicio7 {
    public static void main(String[] args) {
        float numbMaior = 0;
        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            float numero = tc.nextFloat();
            if (numbMaior < numero) {
                numbMaior = numero;
            }
        }
        System.out.println("\nO maior numero é: " + numbMaior);
    }
}
