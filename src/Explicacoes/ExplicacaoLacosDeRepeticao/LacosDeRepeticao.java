package Explicacoes.ExplicacaoLacosDeRepeticao;
import java.util.Scanner;

public class LacosDeRepeticao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Didite o valor inicial");
        int produto = input.nextInt();
        input.close();
        
        while(produto <= 100){
            produto*=3;
            System.out.println(produto);
        }
        System.out.println("O valor final é " + produto);       
    }
}