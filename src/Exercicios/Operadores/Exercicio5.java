package Exercicios.Operadores;

import java.util.Scanner;
//Peça para o úsuario incerir uma temperatura em °C imprima a temperatura em °F 

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C");
        float TempC = input.nextFloat();
        input.close();
        System.out.printf("A temperatura em °F é %f\n",(TempC*9/5)+32);
    }
}
