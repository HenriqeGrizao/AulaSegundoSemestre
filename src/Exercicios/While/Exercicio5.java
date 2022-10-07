package Exercicios.While;

import java.util.Scanner;

public class Exercicio5 {
    /*Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar 
    um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número 
    novamente. Se digitar correto mostrar o número digitado.*/
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numb = 0;
        while (true) {            
            System.out.print("Digite um numero entre 12 e 20: ");
            numb = tc.nextInt();
            if(numb < 20 && numb > 12){
                System.out.println("\n"+numb);
                break;
            }
            System.out.print("\nValor invalido \n");
        }
        tc.close();
    }
}
