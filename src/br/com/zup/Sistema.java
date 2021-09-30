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
}


