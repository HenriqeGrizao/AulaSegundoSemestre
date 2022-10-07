
package Exercicios.codicioal;

import java.util.Scanner;

public class Exercicio8 {
    /*
    *Faça um programa para um banco de sangue em que o usuário informará qual o 
    *tipo sanguíneo de um paciente e o programa retornará que tipo de sangue este 
    *paciente pode receber.
    *Sangue tipo:| Pode doar para: |Pode receber doação de:
    *    A+      |     AB+ e A+    |     A+, A-, O+, O-
    *    A-      | A+, A-, AB+, AB-|         A- e O-
    *    B+      |    B+ e AB+     |       B+, B-, O+, O-
    *    B-      | B+, B-, AB+, AB-|          B- e O-
    *    AB+     |       AB+       |          todos
    *    AB-     |     AB+ e AB-   |     A-, B-, O-, AB-
    *    O+      |  A+, B+, O+, AB+|          O+ e O-
    *    O-      |      todos      |            O-
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Didte o seu tipo sanguíneo");
        String tipoSanque = scanner.nextLine().toUpperCase();
           switch(tipoSanque){
               case "A+":
                   System.out.println("A+, A-, O+, O-");
                   break;
               case "A-":
                   System.out.println("A- e O-");
                   break;
               case "B+":
                   System.out.println("B+, B-, O+, O-");
                   break;
               case "B-":
                   System.out.println("AB- e O-");
                   break;
               case "AB+":
                   System.out.println("todos");
                   break;
               case "AB-":
                   System.out.println("A-, B-, O-, AB-");
                   break;
               case "O+": 
                   System.out.println("O+ e O-");
                   break;
               case "O-":  
                   System.out.println("O-");
                   break;
               default:
                   System.out.println("Tipo sanguínio invalido");
           }
    }
}
