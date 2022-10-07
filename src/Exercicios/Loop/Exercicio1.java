
package Exercicios.Loop;

import java.util.Scanner;

public class Exercicio1 {
    //Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem cas
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        while (true) { 
       
            System.out.println("digite a nota emtre 0 e 10: ");
            int nota = tc.nextInt();
            if (nota >= 0 && nota <= 10) {
                break;
            }else{
                System.out.println("Erro, valor invalido ");
            }
        }
        tc.close();
    }  
}
