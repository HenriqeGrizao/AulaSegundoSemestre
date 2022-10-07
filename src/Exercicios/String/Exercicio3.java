package Exercicios.String;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Incira o Texto");
        String texto = tc.nextLine();
        tc.close();
        System.out.println("A ultima caractere digitada é: " + texto.substring(texto.length() -1));
    }
}
