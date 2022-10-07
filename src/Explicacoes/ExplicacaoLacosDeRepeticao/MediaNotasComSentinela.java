package Explicacoes.ExplicacaoLacosDeRepeticao;

import java.util.Scanner;

public class MediaNotasComSentinela {
    public static void main(String[] args) {
                        
        Scanner input = new Scanner(System.in);
        int contador = 0;
        float total = 0;
        float nota;             
        
        System.out.println("digite '-1' para para com a contagen das notas");
        
        while(true){ 
            System.out.println("digite a nota do " + (contador + 1) + "°");
            nota = input.nextFloat();         
            if (nota == -1) {
                break;
            }
            if(nota > 100 || nota < 0){
                System.out.print("Erro re");
            }else{
                total += nota;
                contador++;
            }
        }
        input.close();
        System.out.println("Media:" + (total/contador) + " Para o total de " + contador + " alunos.");
    }
}
