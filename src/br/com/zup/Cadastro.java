package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    List <Pessoa> listaDePessoas =new ArrayList<>();

    public Cadastro() {
    }

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }
    public void adicionarPessoa (Pessoa novaPessoa){
        listaDePessoas.add(novaPessoa);
    }

    @Override
    public String toString() {
        return "\n Cadastro" + listaDePessoas;

    }
}
