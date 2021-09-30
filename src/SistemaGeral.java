import java.util.Scanner;

public class SistemaGeral {
    private static Scanner capturarDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuInicial() {
        boolean loopMenu = true;
        while (loopMenu) {
            loopMenu = false;
            System.out.println("Bem vindo ao Welfare, seu aplicativo de auto ajuda imediata");
            System.out.println("Para começarmos, é só me dizer o que você quer fazer");
            System.out.println("1 - Ajuda com sua saúde física");
            System.out.println("2 - Ajuda com sua saúde mental");
            System.out.println("3 - Área COVID-19");
            int escolha = capturarDados("É só digitar o número, ok?").nextInt();
            if (escolha == 1) {
                SistemaSaudeFisica.executar();
            } else if (escolha == 2) {
                SistemaSaudeMental.executar();
            } else if (escolha == 3) {
                SistemaCovid.executarSistema();
            }
            String respostaRepetir = capturarDados("Deseja voltar ao menu inicial? Se quiser é só falar Sim").nextLine();
            if (respostaRepetir.equalsIgnoreCase("sim")) {
                loopMenu = true;

            }
        }
    }
}
