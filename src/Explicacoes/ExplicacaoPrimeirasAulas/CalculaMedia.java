package Explicacoes.ExplicacaoPrimeirasAulas;
import java.util.Scanner;
/**
Calcular a media da A1 e A2
 */
public class CalculaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite a sua nota da A1");
        float notaA1 = teclado.nextFloat();
        while (notaA1 > 100 || notaA1 < 0) {             
            System.out.println("Erro... Reigite a sua nota da A1");
            notaA1 = teclado.nextFloat();
        }
        
        System.out.println("Digite a sua nota da A2");
        float notaA2 = teclado.nextFloat();
        while (notaA2 > 100 || notaA2 < 0) {             
            System.out.println("Erro... Reigite a sua nota da A2");
            notaA2 = teclado.nextFloat();
        }
        teclado.close(); 
        
        float media = (notaA1 + notaA2)/3;
        if (media > 100 || media<0) {
            System.out.println("valor inválido");
        } else if (media >= 90) {
            System.out.println("A com media " + media);
        }else if (media >= 80) {
            System.out.println("B com media " + media);
        }else if (media >= 70) {
            System.out.println("C com media " + media);
        }else if (media >= 60) {
            System.out.println("D com media " + media);
        }else{
            System.out.println("F com media " + media);
        }
    }
    
    public static void exercicio1()
    {
    }
}
