package Explicacoes.ExplicacaoPrimeirasAulas;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        
    }
    
    public static void Exercicio23(){
    int c; 
    int thisIsAVariable;
    int q76354;
    int number = 0;
    int value;
    
    Scanner input = new Scanner(System.in);
    value = input.nextInt();
    input.close();
    System.out.println("O valor é: " + value);

    System.out.printf("%s%n%s%n%n","Isso é","um programa em Java");
    System.out.print("Isso é \num programa em Java\n\n");
    System.out.printf("O número %d está armazenado na variavel value\n\n",value);
    System.out.println("O número " + value + " está armazenado na variavel value\n");

    if (number != 7)
    {
      System.out.print("A variavel 'number' não é igual a 7");
    }
  }
     public static void Exercicios()
     {
         //Exercício 2.4
    int c = 9;
    if (c < 7)//Não pode ter ';' depois do if (c < 7)
    {
      System.out.println("c é menor que 7");
    }
    if (c >= 7)//Ao invés de '>=' etáva '=<'  
    {
      System.out.println("c é maior ou igual a que 7");
    }
    //Exercício 2.5
    int x; 
    int y; 
    int z; 
    int result; 

    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor para 'x'");
    x = input.nextInt();
    System.out.println("Digite o valor para 'y'");
    y = input.nextInt();
    System.out.println("Digite o valor para 'z'");
    z = input.nextInt();
    input.close();
    
    result = x*y*z;
    System.out.println("O produto de 'x','y' e 'z' é: " + result);
     } 
}
