package Explicacoes.ExplicacaoHeranca.cliente;

import Explicacoes.ExplicacaoHeranca.heranca.*;
import java.util.Scanner;

public class UsaHerancao {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite o nome");
        pessoa.setNome(tc.nextLine());
        System.out.println("Nome" + pessoa.getNome());

        //intanciar a clase pessoaFisica
        PessoaFisica pf = new PessoaFisica();
        System.out.println("Digite o nome");
        pf.setNome(tc.nextLine());
        System.out.println("Digite o cpf");
        pf.setCpf(tc.nextLong());
        System.out.println("Nome: " + pf.getNome());
        System.out.println("cpf: " + pf.getCpf());
        
        //intanciar a clase pessoaJuridica
        PessoaJuridica pj = new PessoaJuridica();
        System.out.println("Digite o nome");
        pj.setNome(tc.nextLine());
        System.out.println("Digite o cpf");
        pj.setCnpj(tc.nextLong());
        System.out.println("Nome: " + pj.getNome());
        System.out.println("cnpj: " + pj.getCnpj());
        
        //intanciar a clase Funcionario
        Funcionario func = new Funcionario();
        System.out.println("Digite o nome");
        func.setNome(tc.nextLine());
        System.out.println("Digite o cpf");
        func.setCpf(tc.nextLong());
        System.out.println("Digite a sua matricula");
        func.setMatricula(tc.nextInt());
        System.out.println("Nome: " + func.getNome());
        System.out.println("cpf: " + func.getCpf());
        System.out.println("Matricula: " + func.getMatricula());
    }
}
