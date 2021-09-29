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
        concatenador.append("Para te ajudar com ansiedade, faça isso");
        concatenador.append("\nTambém ajuda muito fazer aquilo ali");
        concatenador.append("\nE claro, nunca se esqueça de sempre fazer tal coisa");
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
