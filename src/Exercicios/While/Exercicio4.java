package Exercicios.While;

import java.util.Scanner;

public class Exercicio4 {

    /*Escreva um programa com um looping indeterminado em que enquanto o usuário não 
    *pedir para o programa sair, ele continua printando um contador na tela*/
    public static void main(String[] args) {
        int contador = 0;
        Scanner tc = new Scanner(System.in);

        while (true) {
            contador++;
            System.out.println(contador);
            System.out.println("Para parar o programa digite 's' ou 'c' para continuar");
            if(tc.next().toLowerCase().charAt(0) == 's'){
            break;  
            }
        }
        tc.close();
    }
    
}
