public class Usuario {
    private Sintoma sintoma;

    public Usuario() {
    }

    public Usuario(Sintoma sintoma) {
        this.sintoma = sintoma;
    }

    public Sintoma getSintoma() {
        return sintoma;
    }

    public void setSintoma(Sintoma sintoma) {
        this.sintoma = sintoma;
    }

    public void adicionarSintoma(Sintoma sintomaAdicionado){
        setSintoma(sintomaAdicionado);
    }

}
