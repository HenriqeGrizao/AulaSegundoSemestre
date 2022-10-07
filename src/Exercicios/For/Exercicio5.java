package Exercicios.For;

import java.util.Scanner;

public class Exercicio5 {
    //Leia várias idades e calcule a média entre as idades (usar uma variável para idade)
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int media = 0;
        for (int i = 1; i > -1; i++) {
            System.out.printf("Didite a %d° idade ou \"-1\" para parar: ",i);
            int idade = tc.nextInt();
            if(idade == -1){
                media /= (i-1);
                break;
            }
            media += idade;
        }
        tc.close();
        System.out.println("A media das idades é " + media);
    }
}
