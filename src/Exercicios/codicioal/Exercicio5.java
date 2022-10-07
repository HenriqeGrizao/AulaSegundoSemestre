package Exercicios.codicioal;

import java.util.Scanner;

public class Exercicio5 {
    /*
    Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um 
    programa que calcule seu peso ideal utilizando as seguintes fórmulas:
    a. Homens: Peso Ideal = (72,7 * altura) - 58
    b. Mulheres: Peso Ideal = (62,1 * altura) – 44,7
    */
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura");
        float altura = scanner.nextFloat();
        
        do {
            System.out.println("Digite seu sexo");
            String sexo = scanner.next().toUpperCase();
            switch(sexo){
                case "F":
                    System.out.printf("O seu pesso ideal é %.2f", (62.1 * altura) - 44.7);
                    continuar = false;
                    break;
                case "M":
                    System.out.printf("O seu pesso ideal é %.2f", (72.7 * altura) - 58);
                    continuar = false;
                    break;
                default:
                    System.out.print("Erro. ");
            }             
        } while (continuar);
        
    }
}
