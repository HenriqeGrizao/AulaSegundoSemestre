package Exercicios.For;

import java.util.Scanner;

public class Exercicio4 {
    /*Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 
    10 do valor lido*/
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero = 0;
        for (int i = 0; i < 2; i--) {
            System.out.println("didite um numero de 1 a 10");
            numero = tc.nextInt();
            if (numero > 0 && numero < 11) {
                break;
            } else {
                System.out.println("Erro, por favor ");
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n",numero,i,numero*i);
        }
        tc.close();
    }
}
