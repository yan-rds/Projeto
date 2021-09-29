package br.com.zup;

public class Pessoa {
    private String nome;
    private double idade;
    private double peso;

    public Pessoa() {
    }

    public Pessoa(String nome, double idade, double peso) {
        this.nome = nome;
        this.idade=idade;
        this.peso=peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String adicionarNome(String nomePessoa){
        nome=nomePessoa;
        return nome;
    }
    public double adicionarIdade(double idadePessoa){
        idade=idadePessoa;
        return idade;
    }
    public double adicionarPeso(double novoPeso){
        peso=novoPeso;
        return peso;
    }

    @Override
    public String toString() {
        return
                "\n Nome: " + nome +
                "\n Idade: " + idade +" anos" +
                "\n Peso: " + peso + " quilos";
    }
}
