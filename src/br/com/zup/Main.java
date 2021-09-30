package br.com.zup;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        /*//instanciando pessoa
        Pessoa pessoa1 =  new Pessoa();
        pessoa1.adicionarNome("João");
        pessoa1.adicionarIdade(16);
        pessoa1.adicionarPeso(55);
         Cadastro cadastro1 = new Cadastro();
         cadastro1.adicionarPessoa(pessoa1);
        System.out.println(cadastro1); */
        Pessoa pessoa1 =new Pessoa();
Scanner leitor = new Scanner(System.in);
        boolean menu=true;
        while (menu){
            System.out.println("~~~~Sistema Saúde~~~~");
            System.out.println("Informe seus dados para cadastro");
            System.out.println("Digite seu nome completo:");
            String nomePessoa =leitor.nextLine();
            pessoa1.adicionarNome(nomePessoa);
            System.out.println("Digite a sua idade:");
            double idadePessoa = leitor.nextDouble();
            pessoa1.adicionarIdade(idadePessoa);
            leitor.nextLine();
            System.out.println("Digite seu peso:");
            double pesoPessoa = leitor.nextDouble();
            pessoa1.adicionarPeso(pesoPessoa);
            menu=false;
        }
        //instanciando cadastro
        Cadastro cadastro1 = new Cadastro();
        //adicionando pessoa1 a cadastro
        cadastro1.adicionarPessoa(pessoa1);


        //mostrando cadastro.
        System.out.println(cadastro1);
    }
}

