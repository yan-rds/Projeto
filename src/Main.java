import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario teste = new Usuario();
        Sintoma sintomaTeste = new Sintoma("Depressao");
        Tratamentos tratarDepressao = new Tratamentos("Fazer academia");


        teste.adicionarSintoma(sintomaTeste);
        System.out.println(teste.getSintoma().getNome());
        if (sintomaTeste.getNome().equalsIgnoreCase("Depressao")){
            System.out.println("O tratamento para depressão é" + tratarDepressao.getComoTratar());
        }
    }
}
