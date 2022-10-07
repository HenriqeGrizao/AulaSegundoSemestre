package Exercicios.While;

public class Exercicio2 {

    /*Escrever um programa para exibir os números pares de 1 até 50 na tela*/
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 50) {
            contador++;
            if (contador%2 == 0) {
                System.out.println(contador);
            }
        }
    }
    
}
