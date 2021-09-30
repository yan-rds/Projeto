package br.com.zup;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuInicial() {
        Pessoa pessoa1 = new Pessoa();
        boolean menu = true;
        while (menu) {
            System.out.println("~~~~Sistema Covid ~~~~");
            System.out.println("Informe seus dados para cadastro");
            String nomePessoa = capturarDados("Digite seu nome completo:").nextLine();
            pessoa1.adicionarNome(nomePessoa);

            double idadePessoa = capturarDados("Digite a sua idade:").nextDouble();
            pessoa1.adicionarIdade(idadePessoa);


            double pesoPessoa = capturarDados("Digite seu peso:").nextDouble();
            pessoa1.adicionarPeso(pesoPessoa);
            menu = false;
        }
    }

    public static void menuDica() {

        boolean dica = true;
        while (dica) {
            System.out.println("Digite 1- Para mais informações sobre o vírus covid-19");
            System.out.println("Digite 2- Para informar seus sintomas");
            System.out.println("Digite 3- Para orientaçoes sobre prevenção");
            System.out.println("Digite 4-Para sair ");


            int opcaoMenu = capturarDados("Digite sua escolha").nextInt();
            switch (opcaoMenu) {
                case 1:
                    informacoesCovid();
                    break;
                case 2:
                    menuSintoma();

                    break;
                case 3:
                    orientacaoCovid();
                    break;
                case 4:
                    encerrarDica();
                    dica = false;
                    break;


            }
        }

    }

    public static void menuSintoma() {
        Pessoa pessoa1 = new Pessoa();

        boolean menuSintoma = true;
        while (menuSintoma) {
            System.out.println("Questionário de sintomas");
            System.out.println("Responda com Sim ou Não");


            String sintomaFebre = capturarDados("Teve febre?").nextLine();
            if (sintomaFebre.equalsIgnoreCase("sim")) {
                Sintoma febre = new Sintoma();
                pessoa1.adicionarSintoma(febre);
            }

            String sintomaTosse = capturarDados("Teve tosse?").nextLine();


            if (sintomaTosse.equalsIgnoreCase("sim")) {

                pessoa1.adicionarSintoma(instanciarSintoma());
            }

            String sintomaCansaco = capturarDados("Teve cansaço?").nextLine();

            if (sintomaCansaco.equalsIgnoreCase("sim")) {
                Sintoma cansaco = new Sintoma();
                pessoa1.adicionarSintoma(cansaco);

            }
            String sintomaPerda = capturarDados("Teve perda de paladar ou de olfato?").nextLine();

            if (sintomaPerda.equalsIgnoreCase("sim")) {
                Sintoma perda = new Sintoma();
                pessoa1.adicionarSintoma(perda);


            }
            if (pessoa1.listasSintoma.size() == 4) {
                System.out.println(" Procure atendimento médico imediatamente. " +
                        "\n Sempre ligue antes de ir ao médico ou posto de saúde, clínicas ou hospitais.Pessoas saudáveis " +
                        "\n que apresentarem os sintomas leves devem acompanhar a situação em casa.Em média, os sintomas" +
                        "\n  aparecem cinco ou seis dias após a infeção pelo vírus. No entanto, eles também podem levar até 14 dias para se manifestarem.");
                menuSintoma = false;
            } else {
                System.out.println("\n A maioria das pessoas que adoece em decorrência da COVID-19 " +
                        "\n apresenta sintomas leves a moderados e se recupera sem tratamento especial. " +
                        "\n No entanto, algumas desenvolvem um quadro grave e precisam de atendimento médico." +
                        "\n Fique atento e caso os sintomas se agravem, procure um médico imediatamente");
                menuSintoma = false;
            }

        }

    }

    public static void informacoesCovid() {
        System.out.println("\n O vírus pode se espalhar pela boca ou pelo nariz de uma pessoa infectada, " +
                "\nem pequenas partículas líquidas expelidas quando elas tossem, espirram, falam, cantam ou " +
                "\n respiram. O tamanho dessas partículas vai de gotas respiratórias maiores até aerosois " +
                "\n menores.\n" +
                "\n A infecção pode ocorrer caso você inale o vírus quando estiver perto de alguém " +
                "\n que tenha COVID-19 ou se você tocar em uma superfície contaminada e, em seguida, " +
                "\n passar as mãos nos olhos, no nariz ou na boca. O vírus se espalha com mais facilidade em " +
                "\n locais fechados e em multidões." +
                "" +
                "\n Previna-se!\n");
    }

    public static void orientacaoCovid() {
        System.out.println("Etiqueta respiratória\n" +
                "Uma das formas mais importantes de prevenir a disseminação do SARS-CoV-2 é a etiqueta respiratória, a qual consiste num conjunto de medidas" +
                "que devem ser adotadas para evitar e/ ou reduzir a disseminação de pequenas gotículas oriundas do aparelho " +
                "respiratório, buscando evitar possível contaminação de outras pessoas que estão em um mesmo ambiente." +
                "\n" +
                "A etiqueta respiratória consiste nas seguintes ações:\n" +
                "* Cobrir nariz e boca com lenço de papel ou com o antebraço, e nunca com as mãos ao tossir ou espirrar. Descartar adequadamente o lenço utilizado.\n" +
                "* Evitar tocar olhos, nariz e boca com as mãos não lavadas. Se tocar, sempre higienize as mãos como já indicado.\n" +
                "* Manter uma distância mínima de cerca de 1 metro de qualquer pessoa tossindo ou espirrando.\n" +
                "* Evitar abraços, beijos e apertos de mãos. Adote um comportamento amigável sem contato físico.\n" +
                "* Higienizar com frequência os brinquedos das crianças e aparelho celular. Não compartilhar objetos de uso pessoal, como talheres, toalhas.\n" +
                "* Evitar aglomerações, principalmente em espaços fechados e manter os ambientes limpos e bem ventilados.\n");
    }

    public static void encerrarDica() {
        System.out.println("Cuidar de você é cuidar do outro.Vacine-se!");
    }

    public static Sintoma instanciarSintoma() {
        Sintoma sintoma1 = new Sintoma();
        return sintoma1;
    }
    public static void executarSistema(){
        menuInicial();
        menuDica();

    }
}
