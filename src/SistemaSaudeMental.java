import java.util.Scanner;

public class SistemaSaudeMental {

    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Tratamentos definirTratamento(){
        Tratamentos tratamentoDefinido = new Tratamentos();

        int escolhaMenu = capturarDados("Com quais dessas opções eu posso te ajudar?").nextInt();

        if (escolhaMenu == 1){
            tratamentoDefinido.tratarLuto();
        }
        else if (escolhaMenu == 2){
             tratamentoDefinido.tratarAnsiedade();
        }
        else if (escolhaMenu == 3){
            tratamentoDefinido.tratarTimidez();
        }
        else if (escolhaMenu == 4){
            tratamentoDefinido.tratarAmorProprio();
        }
        else if (escolhaMenu == 5){
            tratamentoDefinido.tratarInseguranca();
        }

        return tratamentoDefinido;
    }

    public static void apresentacao(){
        System.out.println("Olá!!!\n");
        System.out.println("Se você tá por aqui provavelmente tem alguma coisa incomodando esse seu coraçãozinho");
        System.out.println("E tá tudo bem! São as emoções que nos fazem humanos");
        System.out.println("E praquelas que são difíceis de lidar sozinho");
        System.out.println("Saiba que tem gente como eu que adoraria te dar uma mãozinha!");
    }

    public static void exibirOpcoesMenu(){
        System.out.println("\nNo que você acha que eu poderia te ajudar?");
        System.out.println("1 - Problemas para lidar com o luto");
        System.out.println("2 - Quero ajuda com minha ansiedade");
        System.out.println("3 - Sou tímido e queria dar um jeito nisso");
        System.out.println("4 - Não tenho muito amor próprio, as vezes acho que eu seria melhor se eu fosse um pouco diferente");
        System.out.println("5 - As vezes me sinto inseguro, mas quero quebrar essa insegurança na porrada");
        }

    public static void executar(){
        apresentacao();

        boolean loopMenu = true;
        while (loopMenu) {
            loopMenu = false;
            exibirOpcoesMenu();
            System.out.println(definirTratamento());
            String repetir = capturarDados("\nDeseja voltar ao menu anterior? Se quiser é só falar Sim").next();
            if (repetir.equalsIgnoreCase("sim")) {
                loopMenu = true;
            }
        }


    }




}
