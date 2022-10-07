package Exercicios.Operadores;

import java.util.Scanner;
//Peça para o úsuario inserir seu ano de nascimento e imprima dua idade 

public class Exercicio8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        int anoNascimento = input.nextInt();
        input.close();
        System.out.printf("Você tem %d anos\n", (2022 -  anoNascimento));
    }
}
