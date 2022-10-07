package Exercicios.codicioal;

public class Exercicio3 {
/*
Sabendo que a = 5, b = 4, c = 3 e d = 6, informe se as expressões abaixo são 
verdadeiras ou falsas:
1. (a > c) AND (c <= d)                 true
2. (a + b) > 10 OR (a + b) == (c + d)   true 
3. (a >= c) AND (d >= c)                true
*/
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int d = 6;
        System.out.println((a > c) && (c <= d));
        System.out.println((a + b) > 10 || (a + b) == (c + d));
        System.out.println((a >= c) && (d >= c));
    }
}
