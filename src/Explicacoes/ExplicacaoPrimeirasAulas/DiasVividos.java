package Explicacoes.ExplicacaoPrimeirasAulas;

import java.util.Scanner;


public class DiasVividos {
    /**
    * Elabore um algoritemo que leia a idade
    * de uma pessoa e determine, aproximadamente,
    * a quantidade de dias vividos.
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a sua idade");
        int idade = teclado.nextInt();
        int diasVividos = idade*365;
       
        System.out.println("Você já viveu " + diasVividos +" dias.");
        teclado.close();
    }
    
}
