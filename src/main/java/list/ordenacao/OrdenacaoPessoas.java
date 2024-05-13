package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas orenacaoPessoa = new OrdenacaoPessoas();
        orenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.78);
        orenacaoPessoa.adicionarPessoa("Nome 2", 23, 1.72);
        orenacaoPessoa.adicionarPessoa("Nome 3", 43, 1.80);
        orenacaoPessoa.adicionarPessoa("Nome 4", 12, 1.56);
        orenacaoPessoa.adicionarPessoa("Nome 5", 33, 1.63);

        System.out.println(orenacaoPessoa.pessoaList);

        System.out.println(orenacaoPessoa.ordenarPorIdade());
        System.out.println(orenacaoPessoa.ordenarPorAltura());
    }
}
