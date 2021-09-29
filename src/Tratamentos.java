public class Tratamentos {
    private String comoTratar;

    public String getComoTratar() {
        return comoTratar;
    }

    public void setComoTratar(String comoTratar) {
        this.comoTratar = comoTratar;
    }

    public Tratamentos(String comoTratar) {
        this.comoTratar = comoTratar;
    }

    public void tratarDepressao() {
        StringBuilder concatenador = new StringBuilder();
        concatenador.append("Para te ajudar com depressão, faça isso");
        concatenador.append("\nTambém ajuda muito fazer aquilo ali");
        concatenador.append("\nE claro, nunca se esqueça de sempre fazer tal coisa");
        comoTratar = concatenador.toString();
    }

    public void tratarAnsiedade() {
        StringBuilder concatenador = new StringBuilder();
        concatenador.append("\nTem algumas coisas que você pode fazer para lidar com a ansiedade\n");
        concatenador.append("\nProcure organizar sua rotina diariamente");
        concatenador.append("\nA organização é a maior inimiga da ansiedade. Quando deixamos tudo organizado, sabendo exatamente o que temos de executar e onde procurar, tudo fica mais tranquilo.");
        concatenador.append("\nTambém é importante salientar que ser organizado não é querer que o mundo caiba na sua agenda.");
        concatenador.append("\n Ser organizado não é ser controlador, busque conhecimento para contornar obstáculos que estão fora do seu controle.");
        concatenador.append("\nInvista no autoconhecimento");
        concatenador.append("\nSomos muito parecidos em muitas coisas, mas cada pessoa tem sua própria maneira de pensar e agir. Portanto, conhecer-se é fundamental. Não se espelhe nos outros para saber o que fazer. Olhe para si mesmo e aprenda sua própria maneira de reagir e lidar com as coisas.");
        concatenador.append("\nAprenda e controle a sua própria respiração");
        concatenador.append("\nO controle da respiração tem a capacidade de induzir ou acabar com uma crise de ansiedade, de tão poderosa que é. ");
        concatenador.append("\nPortanto, ao sentir que está em um ritmo respiratório muito acelerado, procure reduzir a intensidade da respiração, puxando-a para o abdômen e tirando aquela pressão de ar do peito. Inspire e respire profundamente, para conectar-se consigo mesmo e não se deixar levar pelo estado ansioso.");
        concatenador.append("\nNão se exija tanto assim");
        concatenador.append("\nAinda na linha das percepções sobre si mesmo, tome cuidado para não se cobrar demais. Cada um de nós possui um tempo próprio de desenvolvimento pessoal.");
        concatenador.append("\nÉ importante sim estarmos atentos às nossas atitudes e nos cobrarmos certas posturas de vez em quando, mas noutros momentos, é preciso relaxar, aceitar quem somos e onde estamos e entendermos que aquela situação vai passar e que você está fazendo o suficiente para isso");
        concatenador.append("\nNão se cobre tanto, apenas aja em prol de você mesmo.");
        concatenador.append("\nProcure um psicólogo ou um psiquiatra");
        concatenador.append("\nInvestir na sua saúde mental é uma das formas mais belas de autocuidado. Quem procura esses profissionais, o faz com o objetivo de melhorar sua qualidade de vida e o preconceito acerca disso deve ficar no passado.");
        concatenador.append("Afinal, eles podem ajudar qualquer pessoa a modificar determinados comportamentos que podem aumentar seu bem-estar e melhorar suas relações interpessoais de forma bastante positiva.");
        comoTratar = concatenador.toString();
    }

    public void tratarTimidez() {
        StringBuilder concatenador = new StringBuilder();
        concatenador.append("Para te ajudar com Timidez, faça isso");
        concatenador.append("\nTambém ajuda muito fazer aquilo ali");
        concatenador.append("\nE claro, nunca se esqueça de sempre fazer tal coisa");
        comoTratar = concatenador.toString();
    }

    public void tratarInseguranca() {
        StringBuilder concatenador = new StringBuilder();
        concatenador.append("Para te ajudar com inseguranca, faça isso");
        concatenador.append("\nTambém ajuda muito fazer aquilo ali");
        concatenador.append("\nE claro, nunca se esqueça de sempre fazer tal coisa");
        comoTratar = concatenador.toString();
    }



}
