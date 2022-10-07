
package Exercicios.Loop;

import java.util.Scanner;


public class Exercicio2 {
    /*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha 
    igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as 
    informações*/
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        while (true) {              
            System.out.println("Digite o seu nome");
            String nome = tc.next();
            System.out.println("Digite o sua senha (não pode ser iqual ao nome)");
            String senha = tc.next();
            if (nome.equals(senha)) {
                System.out.println("Erro, Snha iqual ao nome");
            }else{
                System.out.println("Cadastrado com suseso");
                break;
            }
        }
        tc.close();
    }
}
