package Explicacoes.ExplicacaoPrimeirasAulas;

import java.util.Scanner;

public class IdadeVotar {

    public static void main(String[] args) {

    }
    
    public static void idadeVotar()
    {
        /**
        * Elaborar um algoritemo que leia a idade de uma
         * pessoua e determine se está apta a votar;
         */
       
        char resp = 's';
        Scanner input = new Scanner(System.in);

        while (resp == 's') {
            System.out.println("Digite sua idade:");
            int idade = input.nextInt();

            if (idade == -1) {
                break;
            } else if (idade < 16) {
                System.out.println("Voto proibido.");
            } else if (idade < 18) {
                System.out.println("Voto facultativo.");
            } else if (idade < 70) {
                System.out.println("Voto obrigatório.");
            } else {
                System.out.println("Voto facultativo.");
            }
            System.out.println("Quer continuar (s/n)?");
            resp = input.next().charAt(0);
        }
        input.close();
    }
    
}
