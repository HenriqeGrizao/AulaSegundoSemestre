package Exercicios.codicioal;

import java.util.Scanner;

public class Exercicio6 {
    /*João é um pescador e um microcomputador para controlar seu rendimeto diário
     *Toda vez que ele traz um peicha maior do que o estabelecido no regimeto
     *de pesca do estado de SP (50 quilos) ele deve pagar R$ 4,00 por quilo 
     *exedente, Faça um programa que, quando João informa o pesso do peixe
     *que trouxe no dia, o programa retorna o valor da multa
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o pesso do peixe:");
        float pesso = scanner.nextFloat();
        scanner.close();
        
        if(pesso > 50){
            System.out.printf("Voce vai ter que pagar R$ %.2f\n", (pesso-50)*4);
        } else{
            System.out.println("Sem multa hoje :)");
        }
        
    }
}
