import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario teste = new Usuario();
        Sintoma sintomaTeste = new Sintoma("Depressao");
        Tratamentos tratamento = new Tratamentos("Fazer academia");


        teste.adicionarSintoma(sintomaTeste);
        System.out.println(teste.getSintoma().getNome());
        if (sintomaTeste.getNome().equalsIgnoreCase("Depressao")){
            tratamento.tratarDepressao();
            System.out.println("O tratamento para depressão é" + tratamento.getComoTratar());
        }
    }
}
