package Explicacoes.ExplicacaoPrimeirasAulas;


import java.util.Scanner;

public class CalculaNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a Quantidade de avalia��es");
        int QunatAvaliacao = teclado.nextInt();
        float media = 0;
        
        for (int i = 0; i < QunatAvaliacao; i++) {   
            System.out.println("Digite a sua nota da " + (i+1) + "� avalia��es");
            media += teclado.nextFloat();
        }
        teclado.close(); 
        System.out.println(media/QunatAvaliacao);
               
        if (media >= 70) {
            System.out.println("Aprovado com media " + media);
        }else
        {
            System.out.println("Reprovado com media " + media);
        }
}
    
}
