package Exercicios.String;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Incira o codigo do produto");
        String codigo = tc.next();
        tc.close();
        if (codigo.startsWith("BEB")) {
            System.out.println("O codigo começa com BEB");
        } else {
            System.out.println("O codigo não começa com BEB");
        }
    }
}
