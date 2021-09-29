import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario teste = new Usuario();
        Sintoma sintomaTeste = new Sintoma("Ansiedade");
        Tratamentos tratamento = new Tratamentos("Fazer academia");


       tratamento.tratarLuto();
        System.out.println(tratamento.getComoTratar());
    }
    }

