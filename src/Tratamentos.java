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

}
