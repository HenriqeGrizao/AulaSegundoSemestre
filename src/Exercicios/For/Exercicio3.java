package Exercicios.For;

public class Exercicio3 {
    //Fazer um programa para encontrar todos os números pares entre 1 e 100.
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 2; i < 101; i+=2) {
            System.out.println(i);
        }
    }
}
