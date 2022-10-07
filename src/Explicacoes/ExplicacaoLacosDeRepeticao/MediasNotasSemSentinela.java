package Explicacoes.ExplicacaoLacosDeRepeticao;

import java.util.Scanner;

public class MediasNotasSemSentinela {
    public static void main(String[] args) {
                        
        Scanner input = new Scanner(System.in);
        int contador = 0;
        float total = 0;
        float nota;
        
        System.out.println("Digite a quantodade de alunos");
        int QuantAuno = input.nextInt();
        
        while(contador < QuantAuno){ 
            System.out.println("digite a nota do " + (contador + 1) + "°");
            nota = input.nextFloat();
            if(nota > 100 || nota < 0){
                System.out.print("Erro, re");
            } else{
                total += nota;
                contador++;
            }
        }
        input.close();
        System.out.println("Media:" + (total/contador));
    }
}
