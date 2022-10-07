package Exercicios.codicioal;

import java.util.Scanner;
/*Tendo as variáveis salario, ir e salliq, e considerando os valores abaixo, informe se 
as expressões são verdadeiras ou falsas:

salario| ir  | salliq |       expressão       | Verdadeiro ou Falso
100,00 | 0,0 | 100,00 |    (salliq >= 100)    |       true
200,00 |10,00| 190,00 |    (salliq < 190)     |       false
300,00 |15,00| 285,00 |(salliq = salario + ir)|       false
*/


public class Exercicio1 {

    public static void main(String[] args) {
        double salario, ir, salliq; //Declaração das variaveis
        //---------Exemplo 1----------
        salario = 100.00;
        ir = 0.0;
        salliq = 100.00;
        System.out.println(salliq >= 100);
        //---------Exemplo 2----------
        salario = 200.00;
        ir = 10.00;
        salliq = 190.00;
        System.out.println(salliq < 190);
        //---------Exemplo 3----------
        salario = 300.00;
        ir = 15.00;
        salliq = 285.00;
        System.out.println(salliq == salario + ir);
    }
    
}
