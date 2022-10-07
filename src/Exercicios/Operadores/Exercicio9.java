package Exercicios.Operadores;

import java.util.Scanner;
//Faça um programa que calcule a área de uma circunferência coma presisão de 2 casa decimais

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o raio do circulo");
        float raio = input.nextFloat();
        input.close();
        float area = (float) (2*Math.PI*Math.pow(raio, 2));
        System.out.printf("\nA área da circunferencia é %.2f \n", area);
    }
}
