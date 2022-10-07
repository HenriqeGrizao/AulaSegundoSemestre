package Exercicios.Operadores;

import java.util.Scanner;
//Peça para o úsuario degiatr um número intero e imprima seu antecessor

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero intero");
        int numb1 = input.nextInt();
        input.close();
        System.out.printf("O antecessor de %d é %d \n", numb1,(--numb1));
    }
}
