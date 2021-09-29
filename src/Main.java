import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Usuario teste = new Usuario();
        Sintoma sintomaTeste = new Sintoma();
        Tratamentos tratamento = new Tratamentos();
        teste.adicionarSintoma(sintomaTeste);
        sintomaTeste.setTratamento(tratamento);
        // Menu
        System.out.println("\tOlá!!!");
        System.out.println("Se você tá por aqui provavelmente tem alguma coisa incomodando esse seu coraçãozinho");
        System.out.println("E tá tudo bem! São as emoções que nos fazem humanos");
        System.out.println("E praquelas que são difíceis de lidar sozinho");
        System.out.println("Saiba que tem gente como eu que adoraria te dar uma mãozinha!");
        System.out.println("\n No que você acha que eu poderia te ajudar?");
        System.out.println("1 - Problemas para lidar com o luto");
        System.out.println("2 - Quero ajuda com minha ansiedade");
        System.out.println("3 - Sou tímido e queria dar um jeito nisso");
        System.out.println("4 - Não tenho muito amor próprio, as vezes acho que eu seria melhor se eu fosse um pouco diferente");
        System.out.println("5 - As vezes me sinto inseguro, mas quero quebrar essa insegurança na porrada");
        int escolha = leitor.nextInt();
        if (escolha == 1){
            sintomaTeste.setNome("Luto");
            tratamento.tratarLuto();
        }
        else if (escolha == 2){
            sintomaTeste.setNome("Ansiedade");
            tratamento.tratarAnsiedade();
        }
        else if (escolha == 3){
            sintomaTeste.setNome("Timidez");
            tratamento.tratarTimidez();
        }
        else if (escolha == 4){
            sintomaTeste.setNome("Falta de amor próprio");
            tratamento.tratarAmorProprio();
        }
        else if (escolha == 5){
            sintomaTeste.setNome("Insegurança");
            tratamento.tratarInseguranca();
        }
        else if (escolha == 6){

        }
        System.out.println(tratamento);


    }
    }

