package Explicacoes.ExplicacaoLacosDeRepeticao;

import java.util.Scanner;

public class Calculadora {

    static float numero1, numero2, resultado;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("Digite o operando,\n[+] - adição\n[-] - subtração\n[*] - multiplicação\n[/] - divisão\n[S] - sair");
            char operando = input.next().toUpperCase().charAt(0);
            switch (operando) {
                case '+':
                    EntradaNumeros();
                    resultado = numero1 + numero2;
                    System.out.printf("O resultado é %.2f\n", resultado);
                    break;
                case '-':
                    EntradaNumeros();
                    resultado = numero1 - numero2;
                    System.out.printf("O resultado é %.2f\n", resultado);
                    break;
                case '/':
                    EntradaNumeros();
                    resultado = numero1 / numero2;
                    System.out.printf("O resultado é %.2f\n", resultado);
                    break;
                case '*':
                    EntradaNumeros();
                    resultado = numero1 * numero2;
                    System.out.printf("O resultado é %.2f\n", resultado);
                    break;
                case 'S':
                    input.close();
                    System.exit(0);
                default:
                    System.out.printf("Erro o operador [%c] não foi encontrado \n", operando);
            }
        } while (true);
    }

    public static void EntradaNumeros() {
        System.out.println("Digite o 1° número");
        numero1 = input.nextFloat();
        System.out.println("Digite o 2° número");
        numero2 = input.nextFloat();
    }
}