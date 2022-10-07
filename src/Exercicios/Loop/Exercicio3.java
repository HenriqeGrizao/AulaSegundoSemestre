package Exercicios.Loop;

import java.util.Scanner;

public class Exercicio3 {

    /*Faça um programa que leia e valide as seguintes informações:
    a. Nome: maior que 3 caracteres;
    b. Idade: entre 0 e 150;
    c. Salário: maior que zero;
    d. Sexo: 'f' ou 'm';
    e. Estado Civil: 's', 'c', 'v', 'd'; */
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        while (true) {
            System.out.println("digite seu nome");
            String nome = tc.next();
            if(nome.length() <= 3){
                System.out.println("Erro o nome tem que ter pelo menos 3 letras, re");
            } else{
                break;
            }
        }
        
        while (true) {
            System.out.println("digite sua idade");
            int idade = tc.nextInt();
            if(idade >= 0 && idade <= 150){
                break;
            } else{
                System.out.print("Erro idade invalida, re");
            }
        }
        
        while (true) {
            System.out.println("digite seu salário");
            float salario = tc.nextFloat();
            if(salario >= 0){
                break;
            } else{
                System.out.print("Erro salário invalida, re");
            }
        }

        while (true) {
            System.out.println("digite seu sexo [f/m]");
            String sexo = tc.next().toLowerCase();
            if ("f".equals(sexo) || "m".equals(sexo)) {
                break;
            } else {
                System.out.print("Erro comando não reconhecido, re");
            }
        }
        
        while (true) {
            System.out.println("digite seu estado civil \ns = solteiro \nc = casado\nv = viuvo\nd = divorciado");
            String sexo = tc.next().toLowerCase();
            if ("s".equals(sexo) || "c".equals(sexo) || "v".equals(sexo) || "d".equals(sexo)) {
                break;
            } else {
                System.out.print("Erro comando não reconhecido, re");
            }
        }
    tc.close();
    }
}
