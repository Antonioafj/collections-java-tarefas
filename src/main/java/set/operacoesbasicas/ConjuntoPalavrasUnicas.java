package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

        private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavraSet.add(palavra);
    }

    public void removerPalavra( String palavra ){
       if (!palavraSet.isEmpty());
            if (palavraSet.contains(palavra)){
            palavraSet.remove(palavra);
        }else{
                System.out.println("O conjunto esta vazio");
    }
 }
    public boolean verificarPalavra( String palavra ){
       return palavraSet.contains(palavra);
            }

    public void exibirPalavrasUnicas() {
        if (!palavraSet.isEmpty()) {
            System.out.println(palavraSet);
        } else {
            System.out.println("o conjunto esta vazio");
        }
    }
    public static void main (String[] args) {
        ConjuntoPalavrasUnicas conjuntodepalavras = new ConjuntoPalavrasUnicas();

            conjuntodepalavras.adicionarPalavra("java");
            conjuntodepalavras.adicionarPalavra("python");
            conjuntodepalavras.adicionarPalavra("javascript");
            conjuntodepalavras.adicionarPalavra("python");
            conjuntodepalavras.adicionarPalavra("c++");
            conjuntodepalavras.adicionarPalavra("Ruby");


           conjuntodepalavras.exibirPalavrasUnicas();

            conjuntodepalavras.removerPalavra("python");
            conjuntodepalavras.exibirPalavrasUnicas();

            conjuntodepalavras.removerPalavra("swift");

            System.out.println("A linguagem 'java' esta no conjunto? " + conjuntodepalavras.verificarPalavra("java"));
            System.out.println("A linguagem 'python' esta no conjunto? " + conjuntodepalavras.verificarPalavra("python"));

            conjuntodepalavras.exibirPalavrasUnicas();

        }
}

