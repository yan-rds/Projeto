package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    public static void menu() {
        System.out.println("---- Bem vindo ao bem estar FÍSICO -----");
        System.out.println("Digite 1 - Para descobrir o seu IMC (INDICE DE MASSA CORPORAL). ");
        System.out.println("Digite 2 - Para  objetivo corporal . ");
        System.out.println("Digite 3 - Para obter informações  ergonomia no home office  . ");
        System.out.println("Digite 4 - Para sair");
    }

    public static void executar() {
        boolean opcao = true;
        while (opcao) {


            menu();
            int escolhaMenu = capturarDados("Digite a opção desejada").nextInt();

            if (escolhaMenu == 1) {
                double peso = capturarDados("Digite o seu peso : ").nextDouble();
                double altura = capturarDados("Digite o valor da sua altura").nextDouble();
                double imc = peso / (altura * altura);
                //System.out.println("Seu imc é = %.2f " ,(imc) );

                if (imc < 18.5) {
                    System.out.println("Seu imc aponta para magreza");

                } else if (imc > 18.5 & imc < 24.9) {
                    System.out.println("Seu imc aponta para normal");
                } else if (imc > 24.9 & imc < 29.9) {
                    System.out.println("Seu imc aponta para sobrepeso");
                } else if (imc > 29.9 & imc < 39.9) {
                    System.out.println("Seu imc aponta para obesidade ");
                } else {
                    System.out.println("Seu imc aponta para obesidade grave");
                }


            }
        }
    }
}


