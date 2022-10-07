package Exercicios.For;

import java.util.Scanner;

/*Crie um programa que calcula o fatorial de um número. Mas o incremento do for deve 
ser regressivo.*/
public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um numero para ver o ser fatorial");
        int numb = tc.nextInt();
        int fatorial = 1;
        tc.close();
        //numb=3
        for (int i = numb; i > 1; i--) {
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é %d\n",numb,fatorial);
    }
}
