package Exercicios.Loop;

public class Exercicio4 {

    /* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma 
    taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com 
    uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número 
    de anos necessários para que a população do país A ultrapasse ou iguale a população 
    do país B, mantidas as taxas de crescimento*/
    public static void main(String[] args) {
        int popuA = 80000;
        int popuB = 200000;
        int contador = 0;
        while (true) {
            contador++;
            popuA *= 1.03;
            popuB *= 1.015;
            if (popuA > popuB) {
                System.out.printf("A populaçõ A vai passa a B em %d anos", contador);
                break;
            }
        }
    }
}
