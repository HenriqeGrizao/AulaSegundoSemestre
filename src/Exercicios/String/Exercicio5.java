package Exercicios.String;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        String palavraScreta = "oi";
        Scanner tc = new Scanner(System.in);
        while (true) {
            System.out.println("Incira O seu chute");
            if (tc.next().toLowerCase().equals(palavraScreta)) {
                System.out.println("Acertou");
                break;
            } else {
                System.out.println("Errou");
            }
        }
        tc.close();
    }
}
