package Exercicios.While;

import java.util.Scanner;

public class Exercicio7 {
    /*O usuário vai digitar uma nota válida (de 0 até 10). O programa deverá armazenar 
    estas notas em um acumulador. Usar uma segunda variável para contar quantas notas 
    foram armazenadas. Ao final, quando o usuário não quiser mais lançar notas, ele pede 
    para sair e o programa imprime na tela a média das notas*/
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int contador = 0;
        float acumulador = 0;
        while (true) {
            System.out.print("Digite uma entre 0 e 10 ou '-1' para sair: ");
            float nota = tc.nextFloat();
            if(nota == -1){
                System.out.printf("A media é %.2f\n",acumulador/contador);
                break;
            } if(nota <= 10 && nota >= 0){
                contador++;
                acumulador += nota;
            } else {
            System.out.print("\nValor da nota invalida, não foi posivel computar\n");
            }
        }
        tc.close();
    }
}
