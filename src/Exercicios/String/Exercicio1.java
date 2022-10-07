package Exercicios.String;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite seu texto");
        String texto = tc.nextLine();
        tc.close();
        String primeiraLetra = texto.substring(0, 1);
        if (primeiraLetra.toLowerCase().equals(primeiraLetra.toUpperCase())) {
            System.out.println("O texto não começa com uma letra");
        } else if(primeiraLetra.toUpperCase().equals(primeiraLetra)){
            System.out.println("Maiuscula!!!!");
        } else {
            System.out.println("Minúscula!!!");
        }
    }
}
