package Exercicios.While;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    /*Usando o laço while para pedir ao usuário que tente acertar um número aleatório 
    entre 0 e 10 (incluindo) e mostrar a quantidade de tentativas feitas. Dica: Usar o 
    comando Random numero = new Random();*/
    public static void main(String[] args) {
        Random rd = new Random();
        int numbAleatorio = rd.nextInt(11);
        
        Scanner tc = new Scanner(System.in);
        int contador = 0;
        while (true) {
            contador++;
            System.out.print("Tente acertar o numero ente 0 e 10, digite seu chute: ");
            if(tc.nextInt() == numbAleatorio){
                System.out.printf("Voce acertou em %d tentativas!!!!",contador);
                break;
            }
            System.out.print("\nValor errado \n");
        }
        tc.close();
    }
}
