package Exercicios.Operadores;

import java.util.Scanner;
/*Faça um programa em que o úsuario digite uma letra e o programa retorne
  o numero intero do código UNICODE referente àquela letra */

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a letra");
        char caractere = input.next().charAt(0);
        input.close();
        int Index = (int)caractere;
        System.out.printf("O codigo UNICODE do %c é %d\n",caractere,Index);
    }

}
