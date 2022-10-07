package Exercicios.Operadores;

import java.util.Scanner;
//Peça para o úsuari digitar três valores interos e imprima a soma deles

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Primeiro numero da soma");
        int Numb1 = input.nextInt();
        System.out.println("Digite o segundo numjero da soma");
        int Numb2 = input.nextInt();
        System.out.println("Digite o teceiro numero da soma");
        int Numb3 = input.nextInt();
        input.close();
        System.out.printf("A soma de %d, %d e %d é %d", Numb1, Numb2, Numb3, Numb1 + Numb2 + Numb3);
    }
}
