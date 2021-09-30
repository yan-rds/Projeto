import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    List<Sintoma> listasSintoma=new ArrayList<>();

    public Pessoa() {
    }

    public List<Sintoma> getListasSintoma() {
        return listasSintoma;
    }

    public void setListasSintoma(List<Sintoma> listasSintoma) {
        this.listasSintoma = listasSintoma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void adicionarSintoma (Sintoma sintomaAdicionado){
        listasSintoma.add(sintomaAdicionado);
    }
}