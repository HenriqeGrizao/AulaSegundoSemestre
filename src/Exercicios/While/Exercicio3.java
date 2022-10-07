package Exercicios.While;
import java.util.Scanner;

public class Exercicio3 {

    /*Crie um programa para ler 3 notas e mostrar a média delas.*/
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int contador = 0;
        float media = 0;
        while (contador < 3) {
            contador++;
            System.out.print("\nDigite a " + contador + "° nota: ");
            media += tc.nextFloat();   
        }
        System.out.printf("A media é %.2f\n",(media/contador));
        tc.close();
    }
    
}
