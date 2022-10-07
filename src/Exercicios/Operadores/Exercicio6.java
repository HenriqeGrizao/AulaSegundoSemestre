package Exercicios.Operadores;

import java.util.Scanner;
//Faça para converter a velocidade de km/h para m/s

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a velocidade em km/h");
        float VelocidadeKm = input.nextFloat();
        input.close();
        System.out.printf("A velocidade em m/s é %f\n",(VelocidadeKm /3.6));
    }

}