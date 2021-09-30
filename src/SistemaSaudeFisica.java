import java.util.Scanner;

public class SistemaSaudeFisica {
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
        Pessoa pessoa = new Pessoa();
        boolean opcao = true;
        while (opcao) {


            menu();
            int escolhaMenu = capturarDados("Digite a opção desejada").nextInt();

            if (escolhaMenu == 1) {
                double peso = capturarDados("Digite o seu peso : ").nextDouble();
                double altura = capturarDados("Digite o valor da sua altura (em metros)").nextDouble();
                pessoa.setAltura(altura);
                pessoa.setPeso(peso);
                double imc = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
                System.out.println(String.format("%.2f", imc));

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
            } else if (escolhaMenu == 2) {
                System.out.println("Olá, informe abaixo o seu objetivo");
                System.out.println("Digite 1 - para obter informações para perder peso");
                System.out.println("Digite 2 - para obter informações para manter peso");
                System.out.println("Digite 3 - para obter informações para ganhar peso");
                int corpo = capturarDados("Digite a opção desejada: ").nextInt();


                switch (corpo) {
                    case 1:
                        System.out.println("Consuma alimentos fontes de proteínas magras");
                        System.out.println("Consuma alimentos fontes de carboidratos integrais");
                        System.out.println("Evite as gorduras ruins: saturada e trans, inclua alimentos fontes de gorduras saudáveis: abacate, azeite extra virgem, oleaginosas");
                        System.out.println("Consuma açúcar e sal com moderação;");

                        break;
                    case 2:
                        System.out.println("1. Não coma o mesmo alimento (exceto vegetais) mais de uma vez por dia");
                        System.out.println("2. Coma legumes pelo menos quatro vezes por semana");
                        System.out.println("Beba um litro de água para cada 23 kg do seu peso");
                        System.out.println("Faça exercícios físicos diários");
                        break;
                    case 3:
                        System.out.println("Comer de 3 em 3 horas");
                        System.out.println("Incluir proteínas em todas as refeições");
                        System.out.println("Consumir gorduras boas");
                        System.out.println("Realizar atividade física");
                        break;
                }


            } else if (escolhaMenu == 3) {
                System.out.println("Olá, aqui daremos algumas dicas para tornar seu trabalho em casa mais confortável");
                System.out.println("Dica {1} ");
                System.out.println("Tenha apoio para costas, cotovelos e pescoço");
                System.out.println("Dica {2} ");
                System.out.println("Busque ambientes bem iluminados, ventilados e sem barulho");
                System.out.println("Dica {3} ");
                System.out.println("Faça pausas e alongamentos");
                System.out.println("Dica {4} ");
                System.out.println("Dê atenção à altura e à distância dos utensílios");


            } else if (escolhaMenu == 4) {
                opcao = false;
            }
        }


    }
}


