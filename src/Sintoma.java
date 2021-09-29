public class Sintoma {
    private String nome;
    private Tratamentos tratamento;

    public Sintoma() {
    }

    public Sintoma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tratamentos getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamentos tratamento) {
        this.tratamento = tratamento;
    }

}
