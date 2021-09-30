package br.com.zup;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("~~~~Sistema Saúde~~~~");
            System.out.println("Informe seus dados para cadastro");
            System.out.println("Digite seu nome completo:");
            String nomePessoa = leitor.nextLine();
            pessoa1.adicionarNome(nomePessoa);
            System.out.println("Digite a sua idade:");
            double idadePessoa = leitor.nextDouble();
            pessoa1.adicionarIdade(idadePessoa);
            leitor.nextLine();
            System.out.println("Digite seu peso:");
            double pesoPessoa = leitor.nextDouble();
            pessoa1.adicionarPeso(pesoPessoa);
            menu = false;
        }
        // boolean menuSintoma = true;
        //  while (menuSintoma) {
        System.out.println("Questionário de sintomas");
        System.out.println("Responda com Sim ou Não");

        System.out.println("Teve febre?");
        leitor.nextLine();

        String sintomaFebre = leitor.nextLine();
        if (sintomaFebre.equalsIgnoreCase("sim")) {
            Sintoma febre = new Sintoma();
            pessoa1.adicionarSintoma(febre);
        }

        System.out.println("Teve tosse?");
        String sintomaTosse = leitor.nextLine();

        if (sintomaTosse.equalsIgnoreCase("sim")) {
            Sintoma tosse = new Sintoma();
            pessoa1.adicionarSintoma(tosse);
        }
        System.out.println("Teve cansaço?");
        String sintomaCansaco = leitor.nextLine();
        if (sintomaCansaco.equalsIgnoreCase("sim")) {
            Sintoma cansaco = new Sintoma();
            pessoa1.adicionarSintoma(cansaco);
        }
        System.out.println("Teve perda de paladar ou de olfato?");
        String sintomaPerda = leitor.nextLine();
        if (sintomaPerda.equalsIgnoreCase("sim")) {
            Sintoma perda = new Sintoma();
            pessoa1.adicionarSintoma(perda);

            System.out.println(pessoa1.listasSintoma.size());
        }




    }

}

