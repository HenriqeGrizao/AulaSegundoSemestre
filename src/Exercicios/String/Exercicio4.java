package Exercicios.String;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Incira o seu cpf [xxx.xxx.xxx-xx]");
        String cpf = tc.nextLine();
        tc.close();
        System.out.println("cpf " + cpf.replace(".", "").replace("-", "").length());
    }
}
