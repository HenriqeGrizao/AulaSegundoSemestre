package Exercicios.codicioal;

import java.util.Scanner;

public class Exercicio7 {

    /*Faça um programa de resultado de exames em que o usuário digitará Nome, 
    *idade, sexo e quantidade de hemoglobina em g/gL. O programa deverá, com base 
    *na tabela abaixo, informar se o resultado está normal ou se há alguma alteração.
    *Crianças de 2 a 6 anos  | 11,5 a 13,5 g/dL
    *Crianças de 6 a 12 anos | 11,5 a 15,5 g/dL
    *        Homens          |   14 a 18 g/dL
    *        Mulheres        |   12 a 16 g/dL
    *        Grávidas        |      11 g/dL
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite a quantidade de hemoglobina");
        float hemoglobina = scanner.nextFloat();

        if (idade >= 2 && idade < 6) {
            if (hemoglobina <= 11.5 && hemoglobina <= 13.5) {
                System.out.println("Etá tudo normal");
            } else {
                System.out.println("Há uteração, deveria ser ente 11,5 e 13,5 g/dl");
            }
        } else if (idade <= 12) {
            if (hemoglobina > 11.5 && hemoglobina < 15.5) {
                System.out.println("Etá tudo normal");
            } else {
                System.out.println("Há uteração, deveria ser ente 11,5 e 15.5 g/dl");
            }
        } else {
            System.out.println("Digite seu sexo (F/M)");
            String sexo = scanner.next().toUpperCase();
            switch (sexo) {
                case "F":
                    System.out.println("Voce etá gravida? (S/N)");
                    char gravida = scanner.next().toLowerCase().charAt(0);
                    if (gravida == 's') {
                        if (hemoglobina == 11) {
                            System.out.println("Etá tudo normal");
                        } else {
                            System.out.println("Há uteração, deveria ser 11 g/dl");
                        }
                    } else {
                        if (hemoglobina > 12 && hemoglobina < 16) {
                            System.out.println("Etá tudo normal");
                        } else {
                            System.out.println("Há uteração, deveria ser ente 12 e 16 g/dl");
                        }
                    }
                    break;
                case "M":
                    if (hemoglobina > 14 && hemoglobina < 18) {
                        System.out.println("Etá tudo normal");
                    } else {
                        System.out.println("Há uteração, deveria ser ente 14 e 18 g/dl");
                    }
                    break;
                default:
                    System.out.print("Erro. ");
            }
        }
    }
}
