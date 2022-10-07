package Exercicios.codicioal;

public class Exercicio2 {
/*
Sabendo que a = 3, b = 7 e c = 4, informe se as expressões abaixo são verdadeiras 
ou falsas:
1. (a + c) > b    false
2. b > = (a + 2)  true
3. c == (b – a)   true
4. (b + a) < = c  false
5. (c + a) > b    false
*/
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 4;
        System.out.println((a + c)> b);
        System.out.println(b>= (a+2));
        System.out.println(c == (b - a));
        System.out.println((b + a) <= c);
        System.out.println((c + a) > b);
    }
}
